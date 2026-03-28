package src;

    abstract class Vehicle {
    protected String vehicleId;
    protected String type;
    protected double pricePerDay;
    protected boolean isAvailable;

    public Vehicle(String vehicleId, String type, double pricePerDay) {
        this.vehicleId = vehicleId;
        this.type = type;
        this.pricePerDay = pricePerDay;
        this.isAvailable = true;
    }

    public abstract double calculateRent(int days);

    public void setAvailable(boolean status) {
        this.isAvailable = status;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getVehicleId() {
        return vehicleId;
    }
}
    

