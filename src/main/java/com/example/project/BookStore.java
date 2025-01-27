package com.example.project;

public class BookStore {

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users)
    private Book[] books = new Book[0];
    private User[] users = new User[10];

    //requires 1 empty constructor
    public BookStore() {}

    public User[] getUsers() {
        return users; // Get users
    }

    public void setUsers(User[] users) {
        this.users = users; // Set users
    }

    public Book[] getBooks() {
        return books; // Get books
    }

    public void addUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user; // Add user
                consolidateUsers();
                return;
            }
        }
    }

    public void removeUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == user) {
                users[i] = null; // Remove user
                consolidateUsers();
                return;
            }
        }
    }

    public void consolidateUsers() {
        int nextEmpty = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (i != nextEmpty) {
                    users[nextEmpty] = users[i]; // Consolidate users
                    users[i] = null;
                }
                nextEmpty++;
            }
        }
    }

    public void addBook(Book book) {
        int newLength = books.length + 1;
        Book[] newBooks = new Book[newLength];
        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i]; // Copy books
        }
        newBooks[newLength - 1] = book; // Add book
        books = newBooks;
    }

    public void insertBook(Book book, int index) {
        Book[] newBooks = new Book[books.length + 1];
        for (int i = 0; i < index; i++) {
            newBooks[i] = books[i]; // Copy books up to index
        }
        for (int i = index + 1; i < newBooks.length; i++) {
            newBooks[i] = books[i - 1]; // Shift books
        }
        newBooks[index] = book; // Insert book
        books = newBooks;
    }

    public void removeBook(Book book) {
        int index = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == book) {
                index = i; // Find book
                // no break statement used here
            }
        }
        if (index != -1) {
            if (books[index].getQuantity() == 1) {
                Book[] newList = new Book[books.length - 1];
                for (int i = 0; i < index; i++) {
                    newList[i] = books[i]; // Copy books up to index
                }
                for (int i = index + 1; i < books.length; i++) {
                    newList[i - 1] = books[i]; // Shift books
                }
                books = newList;
            } else {
                books[index].setQuantity(books[index].getQuantity() - 1); // Decrease quantity
            }
        }
    }

    public String bookStoreBookInfo() {
        String result = "";
        for (int i = 0; i < books.length; i++) {
            result += books[i].bookInfo() + "\n"; // Get book info
        }
        return result;
    } //you are not tested on this method but use it for debugging purposes

    public String bookStoreUserInfo() {
        String result = "";
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                result += users[i].userInfo() + "\n"; // Get user info
            }
        }
        return result;
    } //you are not tested on this method but use it for debugging purposes

}
