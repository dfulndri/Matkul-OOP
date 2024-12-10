package com.pbo.parents;

public class Hewan {
     // atribut kelas induk
     protected String suara;

     // constructor
     public Hewan(String suara) {
         this.suara = suara;
     }
 
     // method to display
     public void display() {
         System.out.println("hewan bersuara " + suara);
     }
    
}
