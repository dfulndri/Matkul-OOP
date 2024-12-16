package com.pbo.latihan1;

// Class OperasiPerkalian
class OperasiPerkalian extends OperasiBilangan {
    @Override
    protected void set_C() {
        c = a * b;
    }
}