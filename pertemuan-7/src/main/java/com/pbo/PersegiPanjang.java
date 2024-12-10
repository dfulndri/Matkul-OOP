package com.pbo;

public class PersegiPanjang extends BangunDatar {
    public float panjang, lebar;

    public double luasPersegiPanjang() {
        return panjang * lebar;
    }

    public double kelilingPersegiPanjang() {
        return 2 * (panjang + lebar);
    } 
}
