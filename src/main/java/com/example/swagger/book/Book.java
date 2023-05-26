package com.example.swagger.book;

public class Book {

    private String name;
    private String isbn;

    public String getName() {
        return name;
    }

    @SuppressWarnings("unused")
    public void setName(String name) {
        this.name = name;
    }

    @SuppressWarnings("unused")
    public String getIsbn() {
        return isbn;
    }

    @SuppressWarnings("unused")
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
