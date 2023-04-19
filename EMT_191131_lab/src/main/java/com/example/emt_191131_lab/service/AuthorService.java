package com.example.emt_191131_lab.service;

import com.example.emt_191131_lab.models.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    List<Author> findAll();

    Optional<Author> findById(Long id);

    Optional<Author> findByName(String name);

    Optional<Author> save(String name, String surname, Long country);

    Optional<Author> edit(Long id, String name, String surname, Long country);

    void deleteById(Long id);
}
