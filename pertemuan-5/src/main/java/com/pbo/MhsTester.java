package com.pbo;
//SESI 5

class Mahasiswa {
    public String nama; // public bisa diakses dari mana saj
    protected int usia; // protected bisa diakses dari dalam package dan subclass
    private String jurusan;
  
    // constructor
    public Mahasiswa(String nama, int usia, String jurusan) {
      this.nama = nama;
      this.usia = usia;
      this.jurusan = jurusan;
    }
  
    // getter untuk atribut private jurusan
    public String getJurusan() {
      return jurusan;
    }
  
    // Setter utk atribut private jurusan
    public void setJurusan(String jurusanBaru) {
      this.jurusan = jurusanBaru;
    }
  
    // Metode utk menampilkan informasi
    public void tampilkanInfo() {
      System.out.println("Nama " + nama);
      System.out.println("Usia " + usia);
      System.out.println("Jurusan " + jurusan);
    }
  }
  
  // Kelas utama utk menjalankan program
  public class MhsTester {
    public static void main(String[] args) {
      // Membuat objek Mahasiswa
      Mahasiswa mahasiswa1 = new Mahasiswa("Andi", 21, "Teknik Informatika");
  
      // Mengakses atribut public
      System.out.println("Nama Mahasiswa: " + mahasiswa1.nama); // output:Andi
  
      // Mengakases atribut protected (dapat diakses dalam package yg sama)
      System.out.println("Usia Mahasiswa: " + mahasiswa1.usia); // output:21
  
      // Mengakses atribut private menggunakan getter
      System.out.println("Jurusan Mahasiswa: " + mahasiswa1.getJurusan()); // Output: Teknik Informatika
  
      // Mengubah nilai atribut private menggunakan getter
      mahasiswa1.setJurusan("Sistem Informasi");
      System.out.println("Jurusan Mahasiswa setelah diubah: " + mahasiswa1.getJurusan()); // output: Sistem Informasi
  
      // Menampilkan Informasi lengkap mahasiswa
      mahasiswa1.tampilkanInfo();
    }
  }