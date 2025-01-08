package com.pbo.kuiz4;

// Main Class
public class Main {
    public static void main(String[] args) {
        Mamalia kucing = new Mamalia();
        kucing.setNama("Kucing Anggora");
        kucing.setBisaJalan(true);
        kucing.setJumlahKaki(4);

        System.out.println("Nama: " + kucing.getNama());
        System.out.println("Bisa Jalan: " + kucing.getBisaJalan());
        System.out.println("Jumlah Kaki: " + kucing.getJumlahKaki());

        Ayam ayam = new Ayam();
        ayam.setNama("Ayam Kampung");
        ayam.setBisaDiadu(true);

        System.out.println("\nJenis Ayam: " + ayam.getNama());
        System.out.println("Bisa Diadu: " + ayam.getBisaDiadu());
    }
}
