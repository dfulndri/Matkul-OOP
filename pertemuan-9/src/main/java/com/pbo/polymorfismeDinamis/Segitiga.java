package com.pbo.polymorfismeDinamis;

public class Segitiga  extends Bentuk {
    protected void gambar(){
        System.out.println("subclas -> menggambar segitiga");
    }
    protected void hapus(){
        System.out.println("subclass -> menghapus gambar segitiga");
    }
}