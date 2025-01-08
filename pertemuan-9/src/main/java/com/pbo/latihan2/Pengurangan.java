package com.pbo.latihan2;

// Class turunan untuk operasi pengurangan
class Pengurangan extends OperasiBilangan {
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
        this.c = a - b;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Pengurangan: " + a + " - " + b + " = " + c);
    }
}