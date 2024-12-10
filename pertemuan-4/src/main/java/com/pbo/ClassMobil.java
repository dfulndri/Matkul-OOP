package com.pbo;
//SESI 4

class Mobil {
    String aktifitas;
    String warna;
    int kecepatan;

    // Konstruktor dengan nama kelas yang benar
    public Mobil (String aktifitas, String warna, int kecepatan){
        this.aktifitas = aktifitas;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }
    // Cek kecepatan untuk mengubah aktifitas
    void cekKecepatan(){
        if (kecepatan == 0)
            aktifitas = "parkir";  // Perbaikan: penulisan 'aktifitas' benar
    }
    // Cetak atribut mobil
    void cetakAtribut(){
        System.out.println("Aktifitas: " + aktifitas);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan: " + kecepatan);
    }
}

public class ClassMobil {
    public static void main(String[] args) {
        // Membuat objek Mobil dengan parameter yang benar
        Mobil mobilku = new Mobil("jalan", "merah", 0); 

        mobilku.cekKecepatan();
        mobilku.cetakAtribut();
    }
}