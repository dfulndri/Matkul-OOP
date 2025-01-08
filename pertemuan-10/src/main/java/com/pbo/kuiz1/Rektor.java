package com.pbo.kuiz1;

// Subclass Rektor (turunan dari Dosen)
class Rektor extends Dosen {
    private int tahunMasuk;

    public Rektor(String nik, String nama, int tahunMasuk) {
        super(nik, nama); // Panggil konstruktor Dosen
        this.tahunMasuk = tahunMasuk;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public void viewRektor() {
        super.view(); // Panggil method view() dari Dosen
        System.out.println("Tahun Masuk: " + tahunMasuk);
    }
}
