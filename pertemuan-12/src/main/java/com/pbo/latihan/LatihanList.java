package com.pbo.latihan;
//Latihan 2 : Memahami penggunaan interface List.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LatihanList {
    public static void main(String[] args) {
        // Membuat objek List dengan data bertipe String
        List<String> dataList = new ArrayList<>();
        dataList.add("Andi");
        dataList.add("Bintang");
        dataList.add("Chiko");
        dataList.add("Defia");
        dataList.add("Elsa");

        // Tampilkan data yang terdapat pada list
        System.out.println("Data asli:");
        System.out.println(dataList);

        // Balik data yang terdapat pada list dan tampilkan
        Collections.reverse(dataList);
        System.out.println("\nData setelah dibalik:");
        System.out.println(dataList);

        // Acak data yang terdapat pada list dan tampilkan
        Collections.shuffle(dataList);
        System.out.println("\nData setelah diacak:");
        System.out.println(dataList);

        // Urutkan data yang terdapat pada list dan tampilkan
        Collections.sort(dataList);
        System.out.println("\nData setelah diurutkan:");
        System.out.println(dataList);
    }
}
