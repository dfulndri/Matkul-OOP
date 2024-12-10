package com.pbo;

public class Lingkaran extends BangunDatar {
    public float jari;

    public double luasLingkaran() {
        return 3.14 * jari * jari;
    }

    public double kelilingLingkaran() {
        return 2 * 3.14 * jari;
    }
}
