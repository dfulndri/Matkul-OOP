package main.java.com.pbo;

// Final Class
final class ElectricScooter extends Vehicle {
    public ElectricScooter(String brand) {
        super(brand);
    }

    @Override
    public void fuelType() {
        System.out.println(getBrand() + " uses electricity as fuel.");
    }
}
