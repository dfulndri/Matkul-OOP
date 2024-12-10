package com.pbo.parents;

public class Mamalia extends Hewan{
    protected String berkembangBiak;

    public Mamalia() {
        super("suara mamalia"); // super dari class Hewan
        this.berkembangBiak = "beranak";
    }

    @Override
    public void display() {
        System.out.println("mamalia berkembang biak " + berkembangBiak);
    }
    
}
