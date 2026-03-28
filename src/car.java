package src;

class Car extends Vehicle {
    public Car(String id, double price) {
        super(id, "Car", price);
    }

    @Override
    public double calculateRent(int days) {
        return days * pricePerDay;
    }
}

class Bike extends Vehicle {
    public Bike(String id, double price) {
        super(id, "Bike", price);
    }

    @Override
    public double calculateRent(int days) {
        return days * pricePerDay * 0.8;
    }
}

class Truck extends Vehicle {
    public Truck(String id, double price) {
        super(id, "Truck", price);
    }

    @Override
    public double calculateRent(int days) {
        return days * pricePerDay * 1.5;
    }
}
    
}
