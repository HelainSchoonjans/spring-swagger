package com.example.swagger.book;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Book {

    private String name;
    @NotBlank
    @Size(min = 0, max = 30)
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
