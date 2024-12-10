package com.pbo;

// import yang akan dieksekusi
import com.pbo.child.Ayam;
import com.pbo.child.Burung;
import com.pbo.child.Gurame;
import com.pbo.child.Kambing;
import com.pbo.child.Lele;
import com.pbo.child.Sapi;

public class App 
{
    public static void main( String[] args )
    {
        // object untuk hewan sapi
        Sapi sapi = new Sapi();
        sapi.display();
        System.out.println("\n");

        //object untuk hewan kambing
        Kambing kambing = new Kambing();
        kambing.display();
        System.out.println("\n");

        // object untuk hewan ayam
        Ayam ayam = new Ayam();
        ayam.display();
        System.out.println("\n");

        // object untuk hewan burung
        Burung burung = new Burung();
        burung.display();
        System.out.println("\n");

        // object untuk hewan lele
        Lele lele = new Lele();
        lele.display();
        System.out.println("\n");

        // object untuk hewan gurami
        Gurame gurami = new Gurame();
        gurami.display();
    }
}
