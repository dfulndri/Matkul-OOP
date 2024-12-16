package com.pbo.latihan1;

// Class OperasiBilangan
abstract class OperasiBilangan {
    protected double a, b, c;

    protected void set_A(double a) {
        this.a = a;
    }

    protected void set_B(double b) {
        this.b = b;
    }

    protected double get_A() {
        return a;
    }

    protected double get_B() {
        return b;
    }

    protected double get_C() {
        return c;
    }

    protected abstract void set_C();

    protected void tampil() {
        System.out.println("Hasil operasi: " + c);
    }
}

