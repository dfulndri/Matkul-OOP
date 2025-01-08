package com.pbo.tugas;
//Tugas 1 : Penggunaan class LinkedList pada interface List. 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WarnaList  {
    public static void main(String[] args) {
        // Buat objek List warna dengan ArrayList
        List<String> warna = new ArrayList<>(Arrays.asList("MAGENTA", "RED", "WHITE", "BLUE", "CYAN"));
        
        // Buat objek List warnaDihapus dengan ArrayList
        List<String> warnaDihapus = new ArrayList<>(Arrays.asList("RED", "WHITE", "BLUE"));
        
        // Hapus elemen yang ada pada warna yang terdapat pada warnaDihapus
        warna.removeAll(warnaDihapus);
        
        // Tampilkan hasil
        System.out.println("Warna: " + warna);
    }
}

