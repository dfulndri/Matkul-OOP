package com.pbo;
//KUIZ KP SESI 6 UML (Program Alat Tulis)

public class Products {
    private String name;
    private int stok;
    private int hargaPerItem;
    private int totalHarga;

    // Metode untuk mengatur detail produk
    public void setDetails(String name, int stok, int hargaPerItem) {
        this.name = name;
        this.stok = stok;
        this.hargaPerItem = hargaPerItem;
        calculateTotalHarga();
    }

    // Metode untuk menghitung total harga (stok * harga per item)
    private void calculateTotalHarga() {
        this.totalHarga = this.stok * this.hargaPerItem;
    }

    // Metode untuk mendapatkan total harga
    public int getTotalHarga() {
        return this.totalHarga;
    }

    // Metode untuk mendapatkan informasi produk
    public String getDetails() {
        return "\nNama Alat Tulis: " + this.name + "\n" +
               "Stok: " + this.stok + "\n" +
               "Harga Satuan: " + this.hargaPerItem + "\n" +
               "Total Harga: " + this.totalHarga;
    }
}
