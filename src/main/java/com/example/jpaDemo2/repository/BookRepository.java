package com.example.jpaDemo2.repository;

import com.example.jpaDemo2.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByName(String name);
    Page<Book> findAll(Pageable pageable);
}
