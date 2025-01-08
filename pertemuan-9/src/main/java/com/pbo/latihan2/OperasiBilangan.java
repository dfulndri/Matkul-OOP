// Package declaration
package com.pbo.latihan2;

// Abstract class OperasiBilangan sebagai kerangka dasar untuk operasi matematika
public abstract class OperasiBilangan {
    // Variabel protected yang akan digunakan oleh class turunan
    protected double a, b, c;

    // Method setter untuk variabel a
    protected abstract void set_A(double a);

    // Method setter untuk variabel b
    protected abstract void set_B(double b);

    // Method getter untuk variabel a
    protected abstract double get_A();

    // Method getter untuk variabel b
    protected abstract double get_B();

    // Method getter untuk variabel c
    protected abstract double get_C();

    // Abstract method untuk menghitung nilai c (hasil operasi)
    // Harus diimplementasikan di class turunan
    protected abstract void set_C();

    // Method untuk menampilkan hasil operasi
    protected abstract void tampil();
}
