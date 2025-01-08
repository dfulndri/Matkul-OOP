package main.java.com.pbo;

// Another class implementing the interface
class Bicycle implements CanDrive {
    private String type;

    public Bicycle(String type) {
        this.type = type;
    }

    @Override
    public void drive() {
        System.out.println("The " + type + " bicycle is being pedaled.");
    }
}
