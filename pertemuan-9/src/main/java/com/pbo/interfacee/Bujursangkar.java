package com.pbo.interfacee;

public class Bujursangkar implements Bidang2D{
    public double sisi;

    public double getKeliling(){
        return 4 * sisi;
    }
    public double getLuas(){
        return sisi*sisi;
    } 
}