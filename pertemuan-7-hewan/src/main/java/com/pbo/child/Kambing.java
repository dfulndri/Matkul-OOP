package com.pbo.child;

import com.pbo.parents.Mamalia;

public class Kambing extends Mamalia{
    final private String nama, umur;
    
    public Kambing() {
        super(); // super dari class Mamalia
        this.suara = "meeeee"; // suara spesifik
        this.nama = "Si Ling";
        this.umur = "2 tahun";
    }

    @Override
    public void display() {
        System.out.println("============Data Kambing============");
        super.display();
        System.out.println("suara kambing " + this.suara);
        System.out.println("kambing bernama " + this.nama + " berumur " + this.umur);
    }
}
