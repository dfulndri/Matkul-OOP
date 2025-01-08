package com.pbo.latihan3.child;

import com.pbo.latihan3.parent.Komputer;

public class Laptop extends Komputer {

    // Implementasi method dari interface Mouse
    @Override
    public void klik_kanan() {
        System.out.println("Laptop: Klik Kanan");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Laptop: Klik Kiri");
    }

    // Implementasi method dari interface Keyboard
    @Override
    public void klik_enter() {
        System.out.println("Laptop: Tekan Enter");
    }

    // Implementasi method dari interface Printer
    @Override
    public void cetak_data() {
        System.out.println("Laptop: Mencetak data");
    }

    // Implementasi method dari kelas abstrak Komputer
    @Override
    public void hidupkan_os() {
        System.out.println("Laptop: Menghidupkan OS");
    }

    @Override
    public void matikan_os() {
        System.out.println("Laptop: Mematikan OS");
    }
}
