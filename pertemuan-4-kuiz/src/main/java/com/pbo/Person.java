package com.pbo;
//PBO SESI 4 KUIZ KP

public class Person {
    String name;
    int age;
    String gender;
    String hobby;

    // Constructor
    public Person(String name, int age, String gender, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }

    // Method untuk menampilkan informasi
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Hobby: " + hobby);
    }
    
}
