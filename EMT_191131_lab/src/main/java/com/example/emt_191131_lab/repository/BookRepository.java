package com.example.emt_191131_lab.repository;

import com.example.emt_191131_lab.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByNameLike(String name);
}
