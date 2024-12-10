package com.pbo.animal;

//SUPERCLASS
public class Animal {
    //properti
    String name;

    //contructor 
    public Animal (String name){
        this.name = name;
    }

    //metoode
    public void speak(){
        System.out.println("Animal Speaks");
    }
}