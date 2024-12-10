package com.pbo;
//SESI 5

class Waktu {
    private int menitWaktu; // Menyimpan jumlah menit sejak jam 00.00
  
    // Constructor
    public Waktu() {
      this.menitWaktu = 0;
    }
  
    // Method untuk mengambil bagian jam dari menitWaktu
    public int getJam() {
      return menitWaktu / 60;
    }
  
    // Method untuk mengambil bagian menit dari menitWaktu
    public int getMenit() {
      return menitWaktu % 60;
    }
  
    // Method untuk menambah jam tanpa mempengaruhi bagian menit
    public void setJam(int j) {
      this.menitWaktu = j * 60 + getMenit();
    }
  
    // Method untuk menambah menit tanpa mempengaruhi bagian jam
    public void setMenit(int m) {
      this.menitWaktu = getJam() * 60 + m;
    }
  
    // Method untuk mengambil nilai total menit
    public int getTotalMenit() {
      return this.menitWaktu;
    }
  
    // Method untuk menambah jam ke menitWaktu
    public void tambahJam(int j) {
      this.menitWaktu += j * 60;
    }
  
    // Method untuk menambah menit ke menitWaktu
    public void tambahMenit(int m) {
      this.menitWaktu += m;
    }
  
    // Method untuk menambah waktu dengan jam dan menit
    public void tambahWaktu(int j, int m) {
      this.menitWaktu += j * 60 + m;
    }
  
    // Method untuk menampilkan waktu dalam format jam dan menit
    public void tampilWaktu() {
      System.out.println("Waktu: " + getJam() + " jam " + getMenit() + " menit");
    }
  }
  
  public class WaktuTester {
    public static void main(String[] args) {
      Waktu waktu = new Waktu();
  
      // Mengatur jam dan menit awal
      waktu.setJam(5); // Set jam menjadi 5
      waktu.setMenit(30); // Set menit menjadi 30
      System.out.println("Pengujian setJam dan setMenit:");
      waktu.tampilWaktu(); // Output: Waktu: 5 jam 30 menit
  
      // Menambah jam
      waktu.tambahJam(2); // Tambah 2 jam
      System.out.println("\nPengujian tambahJam:");
      waktu.tampilWaktu(); // Output: Waktu: 7 jam 30 menit
  
      // Menambah menit
      waktu.tambahMenit(45); // Tambah 45 menit
      System.out.println("\nPengujian tambahMenit:");
      waktu.tampilWaktu(); // Output: Waktu: 8 jam 15 menit
  
      // Menambah jam dan menit sekaligus
      waktu.tambahWaktu(1, 50); // Tambah 1 jam 50 menit
      System.out.println("\nPengujian tambahWaktu:");
      waktu.tampilWaktu(); // Output: Waktu: 10 jam 5 menit
  
      // Menampilkan total menit
      System.out.println("\nPengujian getTotalMenit:");
      System.out.println("Total menit sejak jam 00:00 = " + waktu.getTotalMenit() + " menit");
    }
  }