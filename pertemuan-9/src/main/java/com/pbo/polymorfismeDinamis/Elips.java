package com.pbo.polymorfismeDinamis;

public class Elips extends Bentuk{
    protected void gambar(){
        System.out.println("subclass -> menggambar Elips");
    }
    
    protected void hapus(){
        System.out.println("subclass -> menghapus gambar Elips");
    }
}