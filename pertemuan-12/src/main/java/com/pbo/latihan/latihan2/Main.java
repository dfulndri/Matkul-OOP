package com.pbo.latihan.latihan2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Buat list objek Mahasiswa
        List<Mahasiswa> listMahasiswa = new ArrayList<>();
        listMahasiswa.add(new Mahasiswa("001", "Azzizaturrida"));
        listMahasiswa.add(new Mahasiswa("002", "Bimo Ardito"));
        listMahasiswa.add(new Mahasiswa("003", "Chrisella Natasia"));
        listMahasiswa.add(new Mahasiswa("004", "Defia Ulandari"));

        // Tampilkan data
        System.out.println("Data Awal:");
        TampilkanList.tampilkanList(listMahasiswa);

        // Balik data
        Collections.reverse(listMahasiswa);
        System.out.println("\nData Setelah Dibalik:");
        TampilkanList.tampilkanList(listMahasiswa);

        // Acak data
        Collections.shuffle(listMahasiswa);
        System.out.println("\nData Setelah Diacak:");
        TampilkanList.tampilkanList(listMahasiswa);

        // Urutkan data
        Collections.sort(listMahasiswa);
        System.out.println("\nData Setelah Diurutkan Berdasarkan Nama:");
        TampilkanList.tampilkanList(listMahasiswa);
    }
}

