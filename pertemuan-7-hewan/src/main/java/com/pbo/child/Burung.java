package com.pbo.child;

import com.pbo.parents.Unggas;

public class Burung extends Unggas{
    final private String jenis, ciri;

    public Burung() {
        super(); // constructor dari class Unggas
        this.suara = "kicauan"; // suara custom
        this.jenis = "merpati";
        this.ciri = "bulu putih";
    }

    @Override
    public void display() {
        System.out.println("============Data Burung============");
        super.display();
        System.out.println("suara burung " + this.suara);
        System.out.println("burung berjenis " + this.jenis + " dengan ciri " + this.ciri);
    }
}
