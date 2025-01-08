package com.pbo.kuiz1;

// Subclass Dekan (turunan dari Dosen)
class Dekan extends Dosen {
    private String fakultas;

    public Dekan(String nik, String nama, String fakultas) {
        super(nik, nama); // Panggil konstruktor Dosen
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void viewDekan() {
        super.view(); // Panggil method view() dari Dosen
        System.out.println("Fakultas: " + fakultas);
    }
}
