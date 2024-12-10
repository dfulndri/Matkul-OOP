package com.pbo;
//PBO SESI 3 KUIZ DI KERTAS

import java.util.Scanner;

public class InputZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("Masukkan Angka: ");
            num = scanner.nextInt();
        } while (num!= 0);
        System.out.println("Program terminated.");

        scanner.close();
    }
}