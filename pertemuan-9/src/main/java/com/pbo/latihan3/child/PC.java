package com.pbo.latihan3.child;

import com.pbo.latihan3.parent.Komputer;

public class PC extends Komputer {

    // Implementasi method dari interface Mouse
    @Override
    public void klik_kanan() {
        System.out.println("PC: Klik Kanan");
    }

    @Override
    public void klik_kiri() {
        System.out.println("PC: Klik Kiri");
    }

    // Implementasi method dari interface Keyboard
    @Override
    public void klik_enter() {
        System.out.println("PC: Tekan Enter");
    }

    // Implementasi method dari interface Printer
    @Override
    public void cetak_data() {
        System.out.println("PC: Mencetak data");
    }

    // Implementasi method dari kelas abstrak Komputer
    @Override
    public void hidupkan_os() {
        System.out.println("PC: Menghidupkan OS");
    }

    @Override
    public void matikan_os() {
        System.out.println("PC: Mematikan OS");
    }
}
