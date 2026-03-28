package src;

class GPSTracker {
    public void updateLocation(Vehicle vehicle, Location location) {
        System.out.println("Vehicle " + vehicle.getVehicleId() +
                " is now at " + location.getPlace());
    }
}
    

