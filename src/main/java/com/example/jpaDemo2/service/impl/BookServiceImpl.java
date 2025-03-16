package com.example.jpaDemo2.service.impl;

import com.example.jpaDemo2.model.Book;
import com.example.jpaDemo2.repository.BookRepository;
import com.example.jpaDemo2.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public Optional<Book> saveBook(Book book) {
        return Optional.of(bookRepository.save(book));
    }

    @Override
    public List<Book> findBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> findBookById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public Optional<Book> findBookByName(String name) {
        return bookRepository.findByName(name);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

}
