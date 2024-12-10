package com.pbo;
//PBO SESI 4 KUIZ KP

public class DuaDimensional {
     // Menghitung luas persegi
     public double luasPersegi(double sisi) {
        return sisi * sisi;
    }

    // Menghitung keliling persegi
    public double kelilingPersegi(double sisi) {
        return 4 * sisi;
    }

    // Menghitung luas lingkaran
    public double luasLingkaran(double radius) {
        return Math.PI * radius * radius;
    }

    // Menghitung keliling lingkaran
    public double kelilingLingkaran(double radius) {
        return 2 * Math.PI * radius;
    }

    // Menghitung luas segitiga
    public double luasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    // Menghitung keliling segitiga
    public double kelilingSegitiga(double sisi1, double sisi2, double sisi3) {
        return sisi1 + sisi2 + sisi3;
    }
    
}
