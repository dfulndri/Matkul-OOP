package com.pbo.animal;

//SUBCLASS
class Dog extends Animal{
    public Dog(String name){
        super(name); //Memanggil contructor dari superclass
    }

    //Override metode speak
    @Override
    public void speak(){
        System.out.println(name+ " Says Woof");
    }
}