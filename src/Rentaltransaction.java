package src;
class RentalTransaction {
    private Vehicle vehicle;
    private Customer customer;
    private int days;

    public RentalTransaction(Vehicle vehicle, Customer customer, int days) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
    }

    public double getTotalCost() {
        return vehicle.calculateRent(days;
    }
}

