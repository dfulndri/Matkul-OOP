package com.pbo.kuiz2;

// Subclass Bayar
class Bayar extends Gojek {
    private int jarak;
    private int total;
    private String nama;

    // Constructor
    public Bayar(String nama, int jarak) {
        this.nama = nama;
        this.jarak = jarak;
        setData();
        hitungTotal();
    }

    // Method khusus untuk menghitung total bayar
    public void hitungTotal() {
        total = harga * jarak;
    }

    // Override tampil method untuk menampilkan data
    @Override
    public void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("ID: " + id);
        System.out.println("Harga per KM: " + harga);
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("Total Bayar: " + total);
    }

    @Override
    public void setData() {
        this.id = 202;
        this.harga = 15000;
    }
}
