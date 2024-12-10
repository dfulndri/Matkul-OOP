package com.pbo;

public class TreeDimensional {
    // Menghitung volume kubus
    public double volumeKubus(double sisi) {
        return Math.pow(sisi, 3);
    }

    // Menghitung luas permukaan kubus
    public double luasPermukaanKubus(double sisi) {
        return 6 * Math.pow(sisi, 2);
    }

    // Menghitung volume balok
    public double volumeBalok(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }

    // Menghitung luas permukaan balok
    public double luasPermukaanBalok(double panjang, double lebar, double tinggi) {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    // Menghitung volume bola
    public double volumeBola(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Menghitung luas permukaan bola
    public double luasPermukaanBola(double radius) {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    
}
