package com.pbo.latihan1;

// Class OperasiPembagian
class OperasiPembagian extends OperasiBilangan {
    @Override
    protected void set_C() {
        if (b != 0) {
            c = a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            c = 0;
        }
    }
}