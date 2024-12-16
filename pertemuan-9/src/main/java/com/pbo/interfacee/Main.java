package com.pbo.interfacee;

public class Main {
    public static void main(String[]args){
        Lingkaran l = new Lingkaran();
        Bujursangkar b = new Bujursangkar();
        PersegiPanjang p = new PersegiPanjang();

        l.radius = 10;
        System.out.println("Lingkaran dengan radius " +l.radius);
        System.out.println("Luas: " +l.getLuas()+ " Keliling: " +l.getKeliling());

        b.sisi = 15;
        System.out.println("Bujursangkar dengan sisi: " +b.sisi);
        System.out.println("Luas: " +b.getLuas()+ " Keliling: " +b.getKeliling());

        p.panjang = 5;
        p.lebar = 6;
        System.out.println("persegi dengan panjang: " +p.panjang+ " lebar: " +p.lebar);
        System.out.println("Luas: " +p.getLuas()+ " Keliling: " +p.getKeliling());
    } 
}