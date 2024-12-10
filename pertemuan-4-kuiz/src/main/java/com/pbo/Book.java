package com.pbo;
//PBO SESI 4 KUIZ KP

public class Book {
    String title;
    String author;
    int yearPublished;

    // Constructor
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Method untuk menampilkan informasi buku
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
    }
    
}
