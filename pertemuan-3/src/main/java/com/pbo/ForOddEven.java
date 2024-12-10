package com.pbo;
//PBO SESI 3 KUIZ DI KERTAS

import java.util.Scanner;

public class ForOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Batas Bawah: ");
        int batasBawah = input.nextInt();

        System.out.print("Masukkan Batas Atas: ");
        int batasAtas = input.nextInt();

        System.out.println("Bilangan Genap:");
        for (int i = batasBawah; i <= batasAtas; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nBilangan Ganjil:");
        for (int i = batasBawah; i<=batasAtas; i++){
            if(i%2 !=0){
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}