package main.java.com.pbo;

// Abstract Class
abstract class Vehicle {
    private final String brand; // final variable

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public final String getBrand() { // final method
        return brand;
    }

    public abstract void fuelType(); // abstract method
}
