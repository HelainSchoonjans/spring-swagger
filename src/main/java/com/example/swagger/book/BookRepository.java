package com.example.swagger.book;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;

@Component
public class BookRepository {

    public Optional<Book> findById(Long id) {
        if(id == 1) {
            return Optional.of(new Book());
        } else {
            return Optional.empty();
        }
    }

    public Collection<Book> getBooks() {
        return List.of(new Book(), new Book());
    }

}
