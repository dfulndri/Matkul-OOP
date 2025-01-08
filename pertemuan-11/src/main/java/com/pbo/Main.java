package main.java.com.pbo;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);
        car.fuelType();
        car.drive();

        Bicycle bicycle = new Bicycle("Mountain");
        bicycle.drive();

        ElectricScooter scooter = new ElectricScooter("Xiaomi");
        scooter.fuelType();
    }
}
