package com.pbo.latihan;
//Latihan 1 : Penerapan konsep himpunan pada interface Set 

import java.util.HashSet;
import java.util.Set;

public class HimpunanSet {
    public static void main(String[] args) {
        // Definisikan himpunan A dan B
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        // Tambahkan elemen ke himpunan A
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);

        // Tambahkan elemen ke himpunan B
        B.add(5);
        B.add(6);
        B.add(7);
        B.add(8);
        B.add(9);
        B.add(10);

        // Tampilkan A dan B
        System.out.println("A: " + A);
        System.out.println("B: " + B);

        // 1. A - B (Selisih)
        Set<Integer> difference = new HashSet<>(A);
        difference.removeAll(B);
        System.out.println("A - B (Selisih): " + difference);

        // 2. A ∩ B (Irisan)
        Set<Integer> intersection = new HashSet<>(A);
        intersection.retainAll(B);
        System.out.println("A ∩ B (Irisan): " + intersection);

        // 3. A U B (Gabungan)
        Set<Integer> union = new HashSet<>(A);
        union.addAll(B);
        System.out.println("A U B (Gabungan): " + union);

        // 4. A ⊆ B (Apakah A subset dari B)
        boolean isSubset = B.containsAll(A);
        System.out.println("A ⊆ B (Apakah A subset dari B): " + isSubset);
    }
}
