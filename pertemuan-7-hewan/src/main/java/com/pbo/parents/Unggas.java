package com.pbo.parents;

public class Unggas extends Hewan{
    protected String berkembangBiak;

    public Unggas() {
        super("suara unggas");
        this.berkembangBiak = "bertelur";        
    }

    @Override
    public void display() {
        System.out.println("unggas berkembang biak " + berkembangBiak);
    }
    
}
