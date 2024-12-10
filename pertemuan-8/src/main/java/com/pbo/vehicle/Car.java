package com.pbo.vehicle;

//SUBCLASS
public class Car extends Vehicle{
    int doors;

    //Cotructor
    public Car (String brand, int doors){
        super(brand); //memanggil contructor superclass
        this.doors = doors;
    }

    //overloading metode displayInfo
    public void displayInfo(String type){
        super.displayInfo();
        System.out.println("Type: " + type +", Doors: " + doors);
    }
}