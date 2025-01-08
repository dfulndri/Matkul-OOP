package com.pbo.latihan.latihan2;

public class Mahasiswa implements Comparable<Mahasiswa> {
    private String nrp;
    private String nama;

    // Constructor
    public Mahasiswa(String nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    // Getter
    public String getNrp() {
        return nrp;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{nrp='" + nrp + "', Nama='" + nama + "'}";
    }

    // Implement Comparable to sort by nama
    @Override
    public int compareTo(Mahasiswa other) {
        return this.nama.compareTo(other.nama);
    }
}

