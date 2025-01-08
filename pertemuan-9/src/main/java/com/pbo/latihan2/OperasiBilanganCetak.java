package com.pbo.latihan2;

// Class untuk mencetak semua operasi yang dilakukan
public class OperasiBilanganCetak {
    // Method untuk mencetak semua hasil operasi matematika
    private final void cetakSemua(OperasiBilangan[] OB, double a, double b) {
        // Looping setiap objek operasi di dalam array OB
        for (OperasiBilangan operasi : OB) {
            operasi.set_A(a); // Mengisi nilai a
            operasi.set_B(b); // Mengisi nilai b
            operasi.set_C();  // Melakukan operasi perhitungan
            operasi.tampil(); // Menampilkan hasil operasi
        }
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
        // Konstanta nilai untuk operasi (final memastikan nilai tidak bisa diubah)
        final double A = 6.5;
        final double B = 0.5;

        // Membuat array dari class turunan OperasiBilangan
        OperasiBilangan[] operasiArray = {
            new Penjumlahan(), // Objek  penjumlahan
            new Pengurangan(), // Objek  pengurangan
            new Perkalian(),   // Objek  perkalian
            new Pembagian()    // Objek  pembagian
        };

        // Membuat objek OperasiBilanganCetak
        OperasiBilanganCetak cetak = new OperasiBilanganCetak();

        // Memanggil method cetakSemua untuk mencetak hasil operasi
        cetak.cetakSemua(operasiArray, A, B);
    }
}