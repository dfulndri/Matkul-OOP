package com.pbo;

public class Persegi extends BangunDatar{
    public float sisi;
    
    public double luasPersegi() {
        return sisi * sisi;
    }

    public double kelilingPersegi() {
        return 4 * sisi;
    }
}
