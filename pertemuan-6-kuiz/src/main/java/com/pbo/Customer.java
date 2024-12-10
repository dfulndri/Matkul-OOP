package com.pbo;
//KUIZ KP SESI 6 UML 

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String nameCustomer;
    private String email;
    private List<Products> purchasedProducts;

    // Constructor untuk mengatur detail customer
    public Customer(int customerId, String nameCustomer, String email) {
        this.customerId = customerId;
        this.nameCustomer = nameCustomer;
        this.email = email;
        this.purchasedProducts = new ArrayList<>();
    }

    // Metode untuk mendapatkan detail customer
    public String getCustomerDetails() {
        return "Customer ID: " + this.customerId + "\n" +
               "Name: " + this.nameCustomer + "\n" +
               "Email: " + this.email;
    }

    // Metode untuk menambahkan produk ke daftar produk yang dibeli
    public void addProduct(Products product) {
        this.purchasedProducts.add(product);
    }

    // Metode untuk mendapatkan daftar produk yang dibeli
    public List<Products> getPurchasedProducts() {
        return this.purchasedProducts;
    }

        // Metode untuk mendapatkan total harga keseluruhan dari semua produk yang dibeli
        public int getTotalHargaKeseluruhan() {
            int totalHarga = 0;
            for (Products product : purchasedProducts) {
                totalHarga += product.getTotalHarga();
            }
            return totalHarga;
        }
}