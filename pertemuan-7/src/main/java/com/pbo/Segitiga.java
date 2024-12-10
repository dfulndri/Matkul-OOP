package com.pbo;

public class Segitiga extends BangunDatar {
    public float alas, tinggi;

    public double luasSegitiga() {
        return 0.5 * alas * tinggi;
    }

    public double kelilingSegitiga() {
        return alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi);
    }
}