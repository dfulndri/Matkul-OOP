package com.pbo.child;

import com.pbo.parents.Unggas;

public class Ayam extends Unggas{
    final private String jenis, ciri;

    public Ayam() {
        super(); // constructor dari class Unggas
        this.suara = "kukuruyuk"; // suara custom
        this.jenis = "ayam kampung";
        this.ciri = "ayam berwarna hitam";
    }

    @Override
    public void display() {
        System.out.println("============Data Ayam============");
        super.display();
        System.out.println("suara ayam " + this.suara);
        System.out.println("ayam berjenis " + this.jenis + " dengan ciri " + this.ciri);
    }
    
}
