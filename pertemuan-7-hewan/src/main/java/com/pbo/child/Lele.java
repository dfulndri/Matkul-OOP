package com.pbo.child;

import com.pbo.parents.Ikan;

public class Lele extends Ikan{
    final private String ciri, berat;
    
    public Lele() {
        super();
        this.ciri = "berwarna hitam keputihan";
        this.berat = "3 kg";
    }

    @Override
    public void display() {
        System.out.println("============Data Lele============");
        super.display();
        System.out.println("lele dengan ciri " + this.ciri);
        System.out.println("lele dengan berat " + this.berat);
    }
    
}
