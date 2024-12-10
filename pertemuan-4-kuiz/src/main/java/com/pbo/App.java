package com.pbo;
//PBO SESI 4 KUIZ KP

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning) {
            // Menampilkan menu pilihan
            System.out.println("Pilih program yang ingin dijalankan:");
            System.out.println("1. Informasi Seseorang (Person)");
            System.out.println("2. Informasi Buku (Book)");
            System.out.println("3. Informasi Hewan (Animal)");
            System.out.println("4. Perhitungan Bangun Datar (2 Dimensi)");
            System.out.println("5. Perhitungan Bangun Ruang (3 Dimensi)");
            System.out.println("6. Exit/Keluar");
            System.out.print("Masukkan pilihan (1-6): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    runPerson();
                    break;
                case 2:
                    runBook();
                    break;
                case 3:
                    runAnimal();
                    break;
                case 4:
                    runDuaDimensional();
                    break;
                case 5:
                    runTreeDimensional();
                    break;
                case 6:
                    continueRunning = false;
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

            if (continueRunning) {
                System.out.print("Apakah Anda ingin melanjutkan? (y/n): ");
                char continueChoice = scanner.next().charAt(0);
                continueRunning = (continueChoice == 'y' || continueChoice == 'Y');
            }
        }

        scanner.close();
    }

    // Fungsi untuk menjalankan perhitungan bangun datar
    public static void runDuaDimensional() {
        Scanner scanner = new Scanner(System.in);
        DuaDimensional calc = new DuaDimensional();

        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        System.out.print("Masukkan pilihan (1-3): ");
        int shapeChoice = scanner.nextInt();

        switch (shapeChoice) {
            case 1:
                System.out.print("Masukkan panjang sisi persegi: ");
                double sisi = scanner.nextDouble();
                System.out.println("Luas Persegi: " + calc.luasPersegi(sisi));
                System.out.println("Keliling Persegi: " + calc.kelilingPersegi(sisi));
                break;
            case 2:
                System.out.print("Masukkan radius lingkaran: ");
                double radius = scanner.nextDouble();
                System.out.println("Luas Lingkaran: " + calc.luasLingkaran(radius));
                System.out.println("Keliling Lingkaran: " + calc.kelilingLingkaran(radius));
                break;
            case 3:
                System.out.print("Masukkan panjang alas segitiga: ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggi = scanner.nextDouble();
                System.out.print("Masukkan panjang sisi lain segitiga (2 sisi lainnya): ");
                double sisi2 = scanner.nextDouble();
                double sisi3 = scanner.nextDouble();
                System.out.println("Luas Segitiga: " + calc.luasSegitiga(alas, tinggi));
                System.out.println("Keliling Segitiga: " + calc.kelilingSegitiga(alas, sisi2, sisi3));
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }

    // Fungsi untuk menampilkan informasi seseorang
    public static void runPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String name = scanner.next();
        System.out.print("Masukkan umur: ");
        int age = scanner.nextInt();
        System.out.print("Masukkan gender (Male/Female): ");
        String gender = scanner.next();
        System.out.print("Masukkan hobi: ");
        String hobby = scanner.next();

        Person person = new Person(name, age, gender, hobby);
        person.displayInfo();

        scanner.close();
    }

    // Fungsi untuk menampilkan informasi buku
    public static void runBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan judul buku: ");
        String title = scanner.next();
        System.out.print("Masukkan nama penulis: ");
        String author = scanner.next();
        System.out.print("Masukkan tahun terbit: ");
        int yearPublished = scanner.nextInt();

        Book book = new Book(title, author, yearPublished);
        book.displayBookInfo();

        scanner.close();
    }

    // Fungsi untuk menampilkan informasi hewan
    public static void runAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama hewan: ");
        String name = scanner.next();
        System.out.print("Masukkan suara hewan: ");
        String sound = scanner.next();
        System.out.print("Masukkan makanan hewan: ");
        String food = scanner.next();

        Animal animal = new Animal(name, sound, food);
        animal.displayAnimalInfo();

        scanner.close();
    }

    // Fungsi untuk menjalankan perhitungan bangun ruang
    public static void runTreeDimensional() {
        Scanner scanner = new Scanner(System.in);
        TreeDimensional calc = new TreeDimensional();

        System.out.println("Pilih bangun ruang:");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Bola");
        System.out.print("Masukkan pilihan (1-3): ");
        int shapeChoice = scanner.nextInt();

        switch (shapeChoice) {
            case 1:
                System.out.print("Masukkan panjang sisi kubus: ");
                double sisi = scanner.nextDouble();
                System.out.println("Volume Kubus: " + calc.volumeKubus(sisi));
                System.out.println("Luas Permukaan Kubus: " + calc.luasPermukaanKubus(sisi));
                break;
            case 2:
                System.out.print("Masukkan panjang balok: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar balok: ");
                double lebar = scanner.nextDouble();
                System.out.print("Masukkan tinggi balok: ");
                double tinggi = scanner.nextDouble();
                System.out.println("Volume Balok: " + calc.volumeBalok(panjang, lebar, tinggi));
                System.out.println("Luas Permukaan Balok: " + calc.luasPermukaanBalok(panjang, lebar, tinggi));
                break;
            case 3:
                System.out.print("Masukkan radius bola: ");
                double radius = scanner.nextDouble();
                System.out.println("Volume Bola: " + calc.volumeBola(radius));
                System.out.println("Luas Permukaan Bola: " + calc.luasPermukaanBola(radius));
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
        scanner.close();
    }
}