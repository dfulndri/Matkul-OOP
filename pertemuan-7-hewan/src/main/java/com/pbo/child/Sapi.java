package com.pbo.child;

import com.pbo.parents.Mamalia;

public class Sapi extends Mamalia{
    final private String nama, umur;

    public Sapi () {
        super(); // super dari class Mamalia
        this.suara = "moo"; // suara spesifik
        this.nama = "ujang";
        this.umur = "1 tahun";
    }

    @Override
    public void display() {
        System.out.println("============Data Sapi============");
        super.display();
        System.out.println("suara sapi " + this.suara);
        System.out.println("sapi bernama " + this.nama + " berumur " + this.umur);
    }
    
}
