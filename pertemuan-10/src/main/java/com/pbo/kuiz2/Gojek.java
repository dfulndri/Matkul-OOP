package com.pbo.kuiz2;

// Superclass Gojek
class Gojek implements Transportasi {
    protected int harga;
    protected int id;

    // Implementasi method dari interface Transportasi
    @Override
    public void tampil() {
        System.out.println("ID: " + id);
        System.out.println("Harga: " + harga);
    }

    @Override
    public void setData() {
        this.id = 101;
        this.harga = 20000;
    }

    @Override
    public int getId() {
        return id;
    }
}
