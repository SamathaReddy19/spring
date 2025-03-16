package com.example.jpaDemo2.controller;

import com.example.jpaDemo2.model.Book;
import com.example.jpaDemo2.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping
    public Optional<Book> saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @GetMapping
    public List<Book> findBooks() {
        return bookService.findBooks();
    }

    @GetMapping("/{id}")
    public Optional<Book> findBookById(@PathVariable("id") Long id) {
        return bookService.findBookById(id);
    }

    @GetMapping("/name")
    public Optional<Book> findBookByName(@RequestParam("name") String name) {
        return bookService.findBookByName(name);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
        bookService.deleteBook(id);
    }


}
