package com.pbo;
//SESI 5

class Nilai {
    private double quis;
    private double uts;
    private double uas;
  
    // Constructor untuk kelas Nilai
    public Nilai(double quis, double uts, double uas) {
      this.quis = quis;
      this.uts = uts;
      this.uas = uas;
  }
  
    // Getter dan setter untuk quis
    public double getQuis() {
      return quis;
    }
  
    public void setQuis(double quis) {
      this.quis = quis;
    }
  
    // Getter dan setter untuk uts
    public double getUts() {
      return uts;
    }
  
    public void setUts(double uts) {
      this.uts = uts;
    }
  
    // Getter dan setter untuk uas
    public double getUas() {
      return uas;
    }
  
    public void setUas(double uas) {
      this.uas = uas;
    }
  
    // Metode untuk menghitung nilai akhir
    public double hitungNilaiAkhir() {
      return (quis * 0.2) + (uts * 0.3) + (uas * 0.5);
    }
  
    // Metode untuk menampilkan informasi nilai
    public void tampilkanNilai() {
      System.out.println("Nilai Quis: " + quis);
      System.out.println("Nilai UTS: " + uts);
      System.out.println("Nilai UAS: " + uas);
      System.out.println("Nilai Akhir: " + hitungNilaiAkhir());
    }
  }
  
  // Kelas utama untuk menjalankan program
  public class NilaiTester {
    public static void main(String[] args) {
      // Membuat objek Nilai
      Nilai nilai1 = new Nilai(80, 85, 90);
  
      // Menampilkan informasi nilai
      nilai1.tampilkanNilai();
  
      // Mengubah nilai quis, uts, dan uas
      nilai1.setQuis(88);
      nilai1.setUts(92);
      nilai1.setUas(95);
  
      // Menampilkan kembali setelah perubahan
      System.out.println("\nSetelah nilai diubah:");
      nilai1.tampilkanNilai();
    }
  }