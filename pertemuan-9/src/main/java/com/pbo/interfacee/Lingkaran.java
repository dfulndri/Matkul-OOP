package com.pbo.interfacee;

public class Lingkaran implements Bidang2D{
    public double radius;
    public double getKeliling(){
        return 2*Math.PI*radius;
    }
    public double getLuas(){
        return Math.PI*radius*radius;
    }

    
}
