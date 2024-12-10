package com.pbo;
// SESI 6 PROGRAM Mahasiswa

import java.util.ArrayList;
import java.util.List; 

// Deklarasi kelas Mahasiswa
public class Mahasiswa { 
    // Deklarasi atribut 
    private String nama; 
    private String nim; 
    private Dosen dosenWali; // Menyimpan dosen wali yang membimbing mahasiswa ini
    private List<MataKuliah> mataKuliahList; 
 
    // Konstruktor kelas Mahasiswa
    public Mahasiswa(String nama, String nim) { 
        this.nama = nama; 
        this.nim = nim; 
        this.mataKuliahList = new ArrayList<>(); // Inisialisasi list mata kuliah
    } 
 
    // Getter untuk nama mahasiswa
    public String getNama() { 
        return nama; 
    } 
 
    // Getter untuk NIM mahasiswa
    public String getNim() { 
        return nim; 
    } 
 
    // Getter untuk dosen wali mahasiswa
    public Dosen getDosenWali() { 
        return dosenWali; 
    } 
 
    // Setter untuk mengatur dosen wali mahasiswa
    public void setDosenWali(Dosen dosenWali) { 
        this.dosenWali = dosenWali; 
    } 
 
    // Metode untuk menambahkan mata kuliah ke dalam list mata kuliah yang diikuti mahasiswa
    public void addMataKuliah(MataKuliah mataKuliah) { 
        // Memeriksa apakah mata kuliah sudah ada dalam list
        if (!mataKuliahList.contains(mataKuliah)) { 
            mataKuliahList.add(mataKuliah); 
            mataKuliah.addMahasiswa(this); 
        } 
    } 
 
    // Metode untuk menampilkan informasi mahasiswa
    public void displayInfo() { 
        System.out.println("Nama Mahasiswa: " + nama); 
        System.out.println("NIM: " + nim); 
        System.out.println("Dosen Wali: " + (dosenWali != null ? dosenWali.getNama() : "Belum Ada")); 
        System.out.println("Mata Kuliah yang Diikuti:"); 
        for (MataKuliah mk : mataKuliahList) { 
            System.out.println("- " + mk.getNama()); 
        } 
    } 
} 
