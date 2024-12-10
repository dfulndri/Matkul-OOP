package com.pbo;
//PBO SESI 4 KUIZ KP

public class Animal {
    String name;
    String sound;
    String food;

    // Constructor
    public Animal(String name, String sound, String food) {
        this.name = name;
        this.sound = sound;
        this.food = food;
    }

    // Method untuk menampilkan informasi hewan
    public void displayAnimalInfo() {
        System.out.println("Animal: " + name);
        System.out.println("Sound: " + sound);
        System.out.println("Food: " + food);
    }
    
}
