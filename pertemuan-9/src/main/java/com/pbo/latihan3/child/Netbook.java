package com.pbo.latihan3.child;

import com.pbo.latihan3.parent.Komputer;

public class Netbook extends Komputer {

    // Implementasi method dari interface Mouse
    @Override
    public void klik_kanan() {
        System.out.println("Netbook: Klik Kanan");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Netbook: Klik Kiri");
    }

    // Implementasi method dari interface Keyboard
    @Override
    public void klik_enter() {
        System.out.println("Netbook: Tekan Enter");
    }

    // Implementasi method dari interface Printer
    @Override
    public void cetak_data() {
        System.out.println("Netbook: Mencetak data");
    }

    // Implementasi method dari kelas abstrak Komputer
    @Override
    public void hidupkan_os() {
        System.out.println("Netbook: Menghidupkan OS");
    }

    @Override
    public void matikan_os() {
        System.out.println("Netbook: Mematikan OS");
    }
}
