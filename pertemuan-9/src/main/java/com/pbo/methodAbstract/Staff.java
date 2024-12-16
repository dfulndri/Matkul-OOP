package com.pbo.methodAbstract;

public class Staff extends Pegawai{
    private String bagian;
    public Staff (String nama, String NIP, String bagian){
        super(nama,NIP);
        setBagian(bagian);
    }
    public void setBagian(String namabagian){
        bagian = namabagian;
    }
    public String getBagian(){
        return bagian;
    }
    public void kirimEmail(String to, String subjek, String isi){
        System.out.println("Kirim ke " +to+ "dengan judul " +subjek+ "dengan isi: " +isi);
    }  
}