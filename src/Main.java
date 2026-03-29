package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RentalManager manager = new RentalManager();
        Scanner sc = new Scanner(System.in);

        manager.addVehicle(new Car("C1", 1000));
        manager.addVehicle(new Bike("B1", 500));

        Customer c = new Customer("U1", "Mayank");

        while (true) {
            System.out.println("1. Rent 2. Return 3. Exit")
            int ch = sc.nextInt();

            if (ch == 1) {
                manager.rentVehicle("C1", c, 3);
            } else if (ch == 2) {
                manager.returnVehicle("C1");
            } else {
                break;
            }
        }
    }
}
