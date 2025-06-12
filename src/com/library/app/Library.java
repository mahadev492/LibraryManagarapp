package com.library.app;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    public Book searchBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    public boolean deleteBook(int id) {
        Book b = searchBook(id);
        if (b != null) {
            books.remove(b);
            return true;
        }
        return false;
    }

    public boolean updateBook(int id, String newTitle, String newAuthor) {
        Book b = searchBook(id);
        if (b != null) {
            b.setTitle(newTitle);
            b.setAuthor(newAuthor);
            return true;
        }
        return false;
    }
}
