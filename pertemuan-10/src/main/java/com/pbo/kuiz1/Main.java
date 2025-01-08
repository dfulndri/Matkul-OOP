package com.pbo.kuiz1;

// Kelas Utama
public class Main {
    public static void main(String[] args) {
        // Buat objek Rektor
        Rektor rektor1 = new Rektor("12345", "Prof. Dr. Defia", 2025);
        System.out.println("Data Rektor:");
        rektor1.viewRektor();

        System.out.println();

        // Buat objek Dekan
        Dekan dekan1 = new Dekan("67890", "Dr. Ulandari", "ILmu Komputer");
        System.out.println("Data Dekan:");
        dekan1.viewDekan();
    }
}
