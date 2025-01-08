package com.pbo.latihan3;

import com.pbo.latihan3.parent.Komputer;

public class Print {
    // Method cetakSemua yang menerima array objek Komputer
    public final void cetakSemua(Komputer[] obj) {
        for (Komputer komputer : obj) {
            // Cetak informasi dari setiap objek Komputer
            komputer.hidupkan_os();  // Memanggil method hidupkan_os
            komputer.matikan_os();    // Memanggil method matikan_os

            // Memanggil metode dari interface yang diimplementasikan dalam Komputer
            komputer.klik_kanan();
            komputer.klik_kiri();
            komputer.klik_enter();
            komputer.cetak_data();
            System.out.println("----------------------------");
        }
    }
}
