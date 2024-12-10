package com.pbo;
//SESI 4

public class ClassBintangFilm {
        public static void main(String[] args) {
            BintangFilm siA = new BintangFilm("Budi", true);
            BintangFilm siB = new BintangFilm("Hani", false);
    
            System.out.println("siA: " + siA.perolehanNama() + ", " + siA.perolehJenisKelamin());
            System.out.println("siB: " + siB.perolehanNama() + ", " + siB.perolehJenisKelamin());  // Perbaikan variabel dari sib ke siB
        }
    }
    class BintangFilm {
        private String nama;
        private Boolean pria;
    
        // Constructor dengan tipe data Boolean yang benar
        BintangFilm(String nama, Boolean pria) {
            this.nama = nama;
            this.pria = pria;
        }
        // Method untuk mengisi data
        private void Isikan(String nama, Boolean pria) {
            this.nama = nama;
            this.pria = pria;
        }
        // Mengambil nama
        String perolehanNama() {
            return nama;
        }
        // Mengambil jenis kelamin
        String perolehJenisKelamin() {
            if (pria) {
                return "Laki-laki";
            } else {
                return "Perempuan";
            }
        }
    } 
