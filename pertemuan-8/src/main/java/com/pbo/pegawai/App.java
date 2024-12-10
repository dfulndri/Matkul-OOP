package com.pbo.pegawai;

public class App {
    public static void main( String[] args )
    {
        Pegawai Pegawai = new Pegawai();
        Manager Manager = new Manager();
        Kasir Kasir = new Kasir();
        Koki Koki = new Koki();
        Pelayan Pelayan = new Pelayan();
        Satpam Satpam = new Satpam();

        //memasukkan nilai variabel menggunakan objek.
        Manager.nama = "Defia";
        Manager.id_pegawai = 1;
        Manager.gaji = "10 Juta";

        Kasir.nama = "Aldi";
        Kasir.id_pegawai = 2;
        Kasir.gaji = "i,2 Juta";

        Koki.nama = "Reza";
        Koki.id_pegawai = 3;
        Koki.gaji = "2 Juta";

        Pelayan.nama = "Dean";
        Pelayan.id_pegawai = 4;
        Pelayan.gaji = "1,2 Juta";

        Satpam.nama = "Ahmad";
        Satpam.id_pegawai = 2;
        Satpam.gaji = "1 Juta";

        //nilai tersebutakan dimasukkan kedalam variabel yang ada pada superclass.
        //memanggil fungsi pada superclass.

        Pegawai.menampilkan();
        //memanggil nlai variabel pada superclass dan memasukkan kedalam fugsi yang ad pada class.

        Manager.menampilkan();
        Manager.tugas();

        Kasir.menampilkan();
        Kasir.tugas();

        Koki.menampilkan();
        Koki.tugas();

        Pelayan.menampilkan();
        Pelayan.tugas();

        Satpam.menampilkan();
        Satpam.tugas();
    }
}
