package com.pbo.polymorfismeDinamis;

public class Main {
    private void tampil(Bentuk[] obj){
        //polimorfisme
        //memanggil method yang sama yaitu method gambar() dan hapus()
        //pada masing-masing class

        for (int i=0; i<obj.length; i++){
            obj[i].gambar();
            obj[i].hapus();
            System.out.println("====================");
        }
    }

    public static void main (String[]args){
        Bentuk[] obj = {
            new Lingkaran(),
            new Elips(),
            new Segitiga()
        };
        Main cetak = new Main(); 

        //Menampilkan method gambar() & hapus() pada class bentuk (superclass)
        cetak.gambar();
        cetak.hapus();
        System.out.println("==================");
                        
        //Overloading
        //menumpuk method gambar() & hapus() pada class bentuk (superclass)
        //dengan method gambar() & hapus() pada subclass-nya
        //yaitu  class Lingkungan, Elips dan Segitiga
                                
        cetak.tampil(obj);
        }
                        
        private void hapus() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hapus'");
        }
                
        private void gambar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gambar'");
        }
}
