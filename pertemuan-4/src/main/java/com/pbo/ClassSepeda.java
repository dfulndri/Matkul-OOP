package com.pbo;
//SESI 4

// Kelas Sepeda dengan atribut dan metode dasar
class Sepeda {
    private String status;
    private String warna;
    private int kecepatan;

    // Konstruktor untuk inisialisasi objek Sepeda
    public Sepeda(String warna, int kecepatan) {
        this.warna = warna;
        this.kecepatan = kecepatan;
        cekStatus(); // Cek status saat sepeda dibuat
    }

    // Method untuk mengatur kecepatan dan memperbarui status
    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
        cekStatus(); // Update status setiap kali kecepatan berubah
    }

    // Method untuk memeriksa status berdasarkan kecepatan
    private void cekStatus() {
        if (kecepatan == 0) {
            status = "berhenti";
        } else if (kecepatan > 0 && kecepatan <= 20) {
            status = "melaju lambat";
        } else {
            status = "melaju cepat";
        }
    }

    // Method untuk mencetak atribut sepeda
    public void cetakAtribut() {
        System.out.println("Status: " + status);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}

// Kelas utama untuk menjalankan program
public class ClassSepeda {
    public static void main(String[] args) {
        // Membuat objek Sepeda dengan warna "biru" dan kecepatan awal 10 km/jam
        Sepeda sepedaku = new Sepeda("biru", 10);

        // Menampilkan atribut sepeda saat awal
        System.out.println("Atribut awal sepeda:");
        sepedaku.cetakAtribut();

        // Mengubah kecepatan sepeda dan menampilkan atribut lagi
        System.out.println("\nMengubah kecepatan menjadi 0 km/jam:");
        sepedaku.setKecepatan(0);
        sepedaku.cetakAtribut();

        System.out.println("\nMengubah kecepatan menjadi 25 km/jam:");
        sepedaku.setKecepatan(25);
        sepedaku.cetakAtribut();
    }
}