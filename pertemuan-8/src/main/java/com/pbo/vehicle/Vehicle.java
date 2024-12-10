package com.pbo.vehicle;

//inheritance dengan kontruktor superclass dan method overloading
//SUPERCLASS
class Vehicle {
    String brand;

    //Contructor
    public Vehicle(String brand){
        this.brand = brand;
    }

    //method untuk menampilkan informasi kendaraan
    public void displayInfo(){
        System.out.println("Brand: " +brand);
    } 
}