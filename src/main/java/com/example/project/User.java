package com.example.project;

public class User {
    //requires 3 private attributes String name, String Id, Book book that is initialized to empty
    private String name;
    private String Id;
    private Book[] bookList = new Book[5];

    //requires 1 constructor with two parameters that will initialize the name and id
    public User(String name, String Id) {
        this.name = name; // Initialize name
        this.Id = Id; // Initialize Id
    }

    public String getName() {
        return name; // Get name
    }

    public void setName(String name) {
        this.name = name; // Set name
    }

    public String getId() {
        return Id; // Get Id
    }

    public void setId(String Id) {
        this.Id = Id; // Set Id
    }

    public Book[] getBooks() {
        return bookList; // Get books
    }

    public void setBooks(Book[] bookList) {
        this.bookList = bookList; // Set books
    }

    public String bookListInfo() {
        String result = ""; // Initialize result
        for (Book book : bookList) { // Loop through books
            if (book == null) {
                result += "empty\n"; // If book is null
            } else {
                result += book.bookInfo() + "\n"; // Add book info
            }
        }
        return result;
    }

    public String userInfo() {
        return "Name: " + name + "\nId: " + Id + "\nBooks: \n" + bookListInfo(); // User info
    }
}
