package src;

import java.util.*;

class RentalManager {
    private List<Vehicle> vehicles = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public void addCustomer(Customer c) {
        customers.add(c);
    }

    public Vehicle findVehicle(String id) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleId().equals(id) && v.isAvailable()) {
                return v;
            }
        }
        return null;
    }

    public void rentVehicle(String id, Customer c, int days) {
        Vehicle v = findVehicle(id);
        if (v != null) {
            v.setAvailable(false);
            RentalTransaction rt = new RentalTransaction(v, c, days);
            System.out.println("Total cost: " + rt.getTotalCost());
        } else {
            System.out.println("Vehicle not available!");
        }
    }

    public void returnVehicle(String id) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleId().equals(id)) {
                v.setAvailable(true);
                System.out.println("Vehicle returned");
            }
        }
    }
}