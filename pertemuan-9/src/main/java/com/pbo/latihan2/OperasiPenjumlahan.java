package com.pbo.latihan2;

// Class OperasiPenjumlahan
class OperasiPenjumlahan extends OperasiBilangan {
    @Override
    protected void set_C() {
        c = a + b;
    }
}
