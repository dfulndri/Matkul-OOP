package com.pbo.latihan2;

// Class turunan untuk operasi pembagian
class Pembagian extends OperasiBilangan {
    @Override
    protected void set_A(double a) {
        this.a = a;
    }

    @Override
    protected void set_B(double b) {
        this.b = b;
    }

    @Override
    protected double get_A() {
        return this.a;
    }

    @Override
    protected double get_B() {
        return this.b;
    }

    @Override
    protected double get_C() {
        return this.c;
    }

    @Override
    protected void set_C() {
        if (b != 0) {
            this.c = a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
            this.c = Double.NaN;
        }
    }

    @Override
    protected void tampil() {
        if (!Double.isNaN(this.c)) {
            System.out.println("Hasil Pembagian: " + a + " / " + b + " = " + c);
        }
    }
}