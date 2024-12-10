package com.pbo;
//SESI 5

class Mobil {
    public String merk; // Public: bisa diakses dari mana saja
    protected int tahunProduksi; // Protected: bisa diakses dari dalam package dan subclass
    private double harga;
  
    // constructor
    public Mobil(String merk, int tahunProduksi, double harga) {
      this.merk = merk;
      this.tahunProduksi = tahunProduksi;
      this.harga = harga;
    }
  
    // Getter utk atribut private harga
    public double getHarga() {
      return harga;
    }
  
    // Setter untuk atribut private harga
    public void setHarga(double hargaBaru) {
      if (hargaBaru > 0) {
        this.harga = hargaBaru;
      } else {
        System.out.println("Harga harus lebih bedar dari 0");
      }
    }
  
    // metode
    public void tampilkanInfoMobil() {
      System.out.println("Merk: " + merk);
      System.out.println("Tahun produksi: " + tahunProduksi);
      System.out.println("Harga: " + harga);
    }
  }
  
  // Kelas Utama utk menjalan kan program
  public class MobilCek {
    public static void main(String[] args) {
      // membuat objek mobil
      Mobil mobil1 = new Mobil("Toyota", 2022, 30000000);
  
      // mengakses atribut public
      System.out.println("Merk Mobil: " + mobil1.merk); // output: toyota
  
      // Mengakses atribut protected (dapat diakses dalam package)
      System.out.println("Tahun produksi Mobil: " + mobil1.tahunProduksi); // output: 2022
  
      // mengakses atribut private menggunakan getter
      System.out.println("Harga Mobil: " + mobil1.getHarga()); // output:30000000.0
  
      // mengubah nilai atribut private menggunakan setter
      mobil1.setHarga(350000000);
      System.out.println("Harga Mobil setelah diubah: " + mobil1.getHarga()); // output: 350000000
  
      // Menampilkan informasi lengkap mobil
      mobil1.tampilkanInfoMobil();
    }
  }
