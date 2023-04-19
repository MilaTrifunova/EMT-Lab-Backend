package com.example.emt_191131_lab.service;

import com.example.emt_191131_lab.models.Book;
import com.example.emt_191131_lab.models.Category;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();

    Optional<Book> findById(Long id);

    Optional<Book> findByName(String name);

    Optional<Book> save(String name, Category category, List<Long> authors, Integer availableCopies);

    Optional<Book> edit(Long id, String name, Category category, List<Long> authors, Integer availableCopies);

    void deleteById(Long id);

    Book markAsTaken(Long id);
}
