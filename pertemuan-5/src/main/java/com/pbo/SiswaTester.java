package com.pbo;
//SESI 5

class Siswa {
    private String nama; // private: hanya bisa diakses dalam kelas ini
    private int nilaiUjian; // private: hanya bisa diakses dalam kelas ini
  
    // Constructor
    public Siswa(String nama, int nilaiUjian) {
      this.nama = nama;
      setNilaiUjian(nilaiUjian); // gunakan setter utk validasi nilai awal
    }
  
    // getter utk nama
    public String getnama() {
      return nama;
    }
  
    // setter utk nama
    public void setNama(String nama) {
      this.nama = nama;
    }
  
    // Nilai utk nilai Ujian
    public int getNilaiUjian() {
      return nilaiUjian;
    }
  
    // setter utk Nilai ujian
    public void setNilaiUjian(int nilaiUjian) {
      // Validasi nilai (0-100)
      if (nilaiUjian >= 0 && nilaiUjian <= 100) {
        this.nilaiUjian = nilaiUjian;
      } else {
        System.out.println("Nilai harus antara 0 dan 100.");
      }
    }
  
    // metode utk menampilkan informasi siswa
    public void tampilkanInfo() {
      System.out.println("Nama Siswa: " + nama);
      System.out.println("Nilai Ujian: " + nilaiUjian);
    }
  }
  
  // kelas utama untuk menjalankan program
  public class SiswaTester {
    public static void main(String[] args) {
      // membuat objek siswa
      Siswa siswa1 = new Siswa("Andi", 85);
      siswa1.tampilkanInfo();
  
      // menggunakan setter utk mengubah nama dan nilai ujian
      siswa1.setNama("Budi");
      siswa1.setNilaiUjian(95);
  
      // Menampilkan informasi yg telah diperbarui
      System.out.println("\nSetelah diubah: ");
      siswa1.tampilkanInfo();
  
      // menguji validasi dengan memasukan nilai yg tidak valid
      siswa1.setNilaiUjian(105); // Output: Nilai Harus antara 0 dan 100
    }
  }