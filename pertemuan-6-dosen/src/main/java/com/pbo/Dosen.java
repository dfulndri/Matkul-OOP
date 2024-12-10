package com.pbo;
// SESI 6 PROGRAM DOSEN

import java.util.ArrayList;
import java.util.List;

// Deklarasi kelas Dosen
public class Dosen { 
    // Deklarasi atribut untuk nama dosen, NIP, dan daftar mahasiswa yang dibimbing
    private String nama; 
    private String nip; 
    private List<Mahasiswa> mahasiswaWaliList; // List untuk menyimpan mahasiswa yang dibimbing oleh dosen ini
 
    // Konstruktor kelas Dosen
    public Dosen(String nama, String nip) { 
        this.nama = nama; 
        this.nip = nip; 
        this.mahasiswaWaliList = new ArrayList<>(); // Inisialisasi list mahasiswa bimbingan
    } 
 
    // Getter untuk nama dosen
    public String getNama() { 
        return nama; 
    } 
 
    // Getter untuk NIP dosen
    public String getNip() { 
        return nip; 
    } 
 
    // Metode untuk menambahkan mahasiswa ke dalam list bimbingan
    public void tambahMahasiswa(Mahasiswa mahasiswa) { 
        // Memeriksa apakah mahasiswa sudah ada di dalam list
        if (!mahasiswaWaliList.contains(mahasiswa)) { 
            mahasiswaWaliList.add(mahasiswa); // Menambahkan mahasiswa ke dalam list
            mahasiswa.setDosenWali(this); // Mengatur dosen sebagai wali bagi mahasiswa (relasi dua arah)
        } 
    } 
 
    // Metode untuk menampilkan informasi dosen dan mahasiswa bimbingannya
    public void displayInfo() { 
        System.out.println("Nama Dosen: " + nama); 
        System.out.println("NIP: " + nip); 
        System.out.println("Mahasiswa Bimbingan:"); 
        for (Mahasiswa mhs : mahasiswaWaliList) { 
            System.out.println("- " + mhs.getNama()); // Menampilkan nama setiap mahasiswa bimbingan
        } 
    } 
}
