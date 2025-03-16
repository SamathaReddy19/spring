package com.example.jpaDemo2.service;

import com.example.jpaDemo2.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Optional<Book> saveBook(Book book);

    List<Book> findBooks();

    Optional<Book> findBookById(Long id);

    Optional<Book> findBookByName(String name);

    void deleteBook(Long id);
}
