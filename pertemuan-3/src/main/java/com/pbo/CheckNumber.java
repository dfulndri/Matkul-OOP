package com.pbo;
//PBO SESI 3 KUIZ DI KERTAS

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");

        int angka = scanner.nextInt();

        if (angka > 0) {
            System.out.println(angka + " Ini Angka Positif");
        } else if (angka < 0) {
            System.out.println(angka + " Ini Angka Negatif");
        } else {
            System.out.println(angka + " Ini Nol");
        }

        scanner.close();
    }
}
