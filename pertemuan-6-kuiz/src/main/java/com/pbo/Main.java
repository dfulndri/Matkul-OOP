package com.pbo;
//KUIZ KP SESI 6 UML 

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Membuat objek produk
        Products product1 = new Products();
        product1.setDetails("Bolpon", 10, 2000);
        
        Products product2 = new Products();
        product2.setDetails("Pensil", 10, 1000);
        
        Products product3 = new Products();
        product3.setDetails("Penghapus", 10, 500); // Menggunakan product3 untuk setDetails

        // Membuat objek customer
        Customer customer1 = new Customer(101, "Andi", "andi@example.com");

        // Menambahkan produk yang dibeli oleh customer
        customer1.addProduct(product1);
        customer1.addProduct(product2);
        customer1.addProduct(product3);

        // Menampilkan informasi customer
        System.out.println("=== CUSTOMERS DETAILS ===");
        System.out.println(customer1.getCustomerDetails());

        // Menampilkan produk yang dibeli oleh customer
        System.out.println("\n=== PEMBELIAN PRODUK ALAT TULIS ===");
        List<Products> purchasedProducts = customer1.getPurchasedProducts();
        for (Products product : purchasedProducts) {
            System.out.println(product.getDetails());
        }
         // Menampilkan total harga keseluruhan
        System.out.println("\nTotal Harga Keseluruhan: " + customer1.getTotalHargaKeseluruhan());
    }
}
