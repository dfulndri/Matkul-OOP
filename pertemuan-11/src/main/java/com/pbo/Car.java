package main.java.com.pbo;

// Inheritance
class Car extends Vehicle implements CanDrive {
    private int wheels;

    public Car(String brand, int wheels) {
        super(brand);
        this.wheels = wheels;
    }

    @Override
    public void fuelType() {
        System.out.println(getBrand() + " uses petrol or diesel as fuel.");
    }

    @Override
    public void drive() {
        System.out.println(getBrand() + " is driving with " + wheels + " wheels.");
    }
}

