package com.pbo;
//SESI 6 PROGRAM MAIN UNTUK CLASS MAHASISWA

public class Main { 
    public static void main(String[] args) { 
        // Membuat objek Mahasiswa 
        Mahasiswa mahasiswa1 = new Mahasiswa("Ahmad", "12345678", 21); 
 
        // Mengakses dan menampilkan data Mahasiswa 
        mahasiswa1.displayInfo(); 
 
        // Mengubah data Mahasiswa 
        mahasiswa1.setNama("Budi"); 
        mahasiswa1.setNim("87654321"); 
        mahasiswa1.setUsia(22); 
 
        // Menampilkan data setelah diubah 
        mahasiswa1.displayInfo(); 
    } 
} 