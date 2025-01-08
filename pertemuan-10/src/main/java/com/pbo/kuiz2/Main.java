package com.pbo.kuiz2;

// Main Class
public class Main {
    public static void main(String[] args) {
        // Membuat objek Bayar
        Bayar bayar1 = new Bayar("Resti", 5);

        // Menampilkan data menggunakan method tampil
        System.out.println("=== DATA PEMBAYARAN ===");
        bayar1.tampil();
    }
}
