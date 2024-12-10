package com.pbo;

public class App {
    public static void main(String[] args) {
        // membuat objek bangun datar
        BangunDatar bgn = new BangunDatar();
        System.out.println(bgn.luas());
        System.out.println(bgn.keliling());

        // membuat objek persegi
        Persegi prs = new Persegi();
        prs.sisi = 8;

        // membuat objek persegi panjang
        PersegiPanjang psp = new PersegiPanjang();
        psp.panjang = 12;
        psp.lebar = 7;

        // membuat objek lingkaran
        Lingkaran lkg = new Lingkaran();
        lkg.jari = 7;

        // membuat objek segitiga
        Segitiga sgt = new Segitiga();
        sgt.alas = 10;
        sgt.tinggi = 5;

        // memanggil method luas
        System.out.println("Luas Persegi: " + prs.luasPersegi());
        System.out.println("Luas Persegi Panjang: " + psp.luasPersegiPanjang());
        System.out.println("Luas Lingkaran: " + lkg.luasLingkaran());
        System.out.println("Luas Segitiga: " + sgt.luasSegitiga());

        // memanggil method keliling
        System.out.println("Keliling Persegi: " + prs.kelilingPersegi());
        System.out.println("Keliling Persegi Panjang: " + psp.kelilingPersegiPanjang());
        System.out.println("Keliling Lingkaran: " + lkg.kelilingLingkaran());
        System.out.println("Keliling Segitiga: " + sgt.kelilingSegitiga());
    }
}
