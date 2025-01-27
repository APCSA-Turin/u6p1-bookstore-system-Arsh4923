package com.example.project;

public class Book {
    //requires 5 attributes String title, String author, int yearPublished, String isbn, int quantity
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;
    private int quantity;

    //requires 1 constructor with 5 arguments that initialize the attributes of the class.
    public Book(String title, String author, int yearPublished, String isbn, int quantity) {
        this.title = title; // Initialize title
        this.author = author; // Initialize author
        this.yearPublished = yearPublished; // Initialize year published
        this.isbn = isbn; // Initialize ISBN
        this.quantity = quantity; // Initialize quantity
    }

    public String getTitle() {
        return title; // Get title
    }

    public void setTitle(String title) {
        this.title = title; // Set title
    }

    public String getAuthor() {
        return author; // Get author
    }

    public void setAuthor(String author) {
        this.author = author; // Set author
    }

    public int getYearPublished() {
        return yearPublished; // Get year published
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished; // Set year published
    }

    public String getIsbn() {
        return isbn; // Get ISBN
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn; // Set ISBN
    }

    public int getQuantity() {
        return quantity; // Get quantity
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity; // Set quantity
    }

    public String bookInfo() {
        return "Title: " + title + ", Author: " + author + ", Year: " + yearPublished + ", ISBN: " + isbn + ", Quantity: " + quantity;
    } //returns "Title: [], Author: [], Year: [], ISBN: [], Quantity: []"
}
