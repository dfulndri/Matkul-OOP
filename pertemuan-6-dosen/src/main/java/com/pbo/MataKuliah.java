package com.pbo;
// SESI 6 PROGRAM MataKuliah

import java.util.ArrayList;
import java.util.List;

// Deklarasi kelas MataKuliah
public class MataKuliah { 
    // Deklarasi atribut 
    private String nama; 
    private String kode; 
    private List<Mahasiswa> mahasiswaList; // List untuk menyimpan mahasiswa 
 
    // Konstruktor kelas MataKuliah
    public MataKuliah(String nama, String kode) { 
        this.nama = nama; 
        this.kode = kode; 
        this.mahasiswaList = new ArrayList<>(); // Inisialisasi list mahasiswa
    } 
 
    // Getter untuk nama mata kuliah
    public String getNama() { 
        return nama; 
    } 
 
    // Getter untuk kode mata kuliah
    public String getKode() { 
        return kode; 
    } 
 
    // Metode untuk menambahkan mahasiswa ke dalam list mahasiswa 
    public void addMahasiswa(Mahasiswa mahasiswa) { 
        // Memeriksa apakah mahasiswa sudah ada dalam list
        if (!mahasiswaList.contains(mahasiswa)) { 
            mahasiswaList.add(mahasiswa);
            mahasiswa.addMataKuliah(this); 
        } 
    } 
 
    // Metode untuk menampilkan informasi mata kuliah
    public void displayInfo() { 
        System.out.println("Mata Kuliah: " + nama); 
        System.out.println("Kode: " + kode); 
        System.out.println("Daftar Mahasiswa:"); 
        for (Mahasiswa mhs : mahasiswaList) { 
            System.out.println("- " + mhs.getNama()); 
        } 
    } 
} 
