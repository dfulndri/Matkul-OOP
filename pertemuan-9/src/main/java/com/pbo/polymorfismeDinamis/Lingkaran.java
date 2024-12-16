package com.pbo.polymorfismeDinamis;

public class Lingkaran extends Bentuk{
    protected void gambar(){
        System.out.println ("subclass -> menggambar lingkaran");
    }

    protected void hapus(){
        System.out.println("subclass -> menghapus gambar lingkaran");
    }
    
}
