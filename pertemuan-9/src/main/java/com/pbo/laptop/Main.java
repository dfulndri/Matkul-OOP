package com.pbo.laptop;

//final class
public final class Main {
    //final variabel/konstanta
    private final String barang = "Laoptop";

    //final method
    private final void cetak(Laptop[] ob, String pemilik){
        System.err.println("Nama Barang : " +barang);
        System.err.println(" ");

        //polimorfisme
        for (int i = 0; i<ob.length; i++){
            ob[i].getMerk();
            ob[i].setPemilik(pemilik);
            ob[i].getPemilik();
            ob[i].tampil();
            ob[i].hapus();
            System.out.println("--------------------------------");
        }
        ob = null;
        pemilik = null;
    }
    public static void main (String [] args){
        String pemilik = "Defia ";
        Laptop[] ob = {
            new Asus ("Asus"),
            new Dell ("Dell"),
            new Toshiba ("Toshiba")
        };
        Main main = new Main();
        main.cetak(ob, pemilik);
        
        pemilik = null;
        ob = null;
        main = null;
    }
    
}
