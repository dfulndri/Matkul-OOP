package com.pbo.tugas.tugas2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Membuat queue untuk menampung data mahasiswa
        Queue<Mahasiswa> queue = new LinkedList<>();

        // Daftar nama mahasiswa
        String[] namaMahasiswa = {"Aziza", "Bintang", "Chrisella", "Defia", "Eka", "Firnanda", "Guntur", "Haikal", "Ilham", "Jessika"};
        
        // Mengisi queue dengan 10 data mahasiswa secara acak
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            String nrp = String.format("%03d", i + 1);  // Membuat NRP "001", "002", ...
            String nama = namaMahasiswa[i];
            float nilai = 60 + rand.nextFloat() * (100 - 60);  // Nilai acak antara 60 dan 100
            queue.offer(new Mahasiswa(nrp, nama, nilai));
        }

        // Menampilkan data mahasiswa sebelum diurutkan
        System.out.println("Data Mahasiswa Sebelum Diurutkan:");
        tampilkanQueue(queue);

        // Mengurutkan mahasiswa berdasarkan nilai menggunakan Comparator
        List<Mahasiswa> listMahasiswa = new ArrayList<>(queue);
        listMahasiswa.sort(Comparator.comparingDouble(Mahasiswa::getNilai).reversed());  // Urutkan nilai dari tinggi ke rendah

        // Menampilkan data mahasiswa setelah diurutkan
        System.out.println("\nData Mahasiswa Setelah Diurutkan Berdasarkan Nilai (Tinggi ke Rendah):");
        for (Mahasiswa mhs : listMahasiswa) {
            System.out.println(mhs);
        }
    }

    // Utility method untuk menampilkan isi queue
    private static void tampilkanQueue(Queue<Mahasiswa> queue) {
        for (Mahasiswa mhs : queue) {
            System.out.println(mhs);
        }
    }
}
