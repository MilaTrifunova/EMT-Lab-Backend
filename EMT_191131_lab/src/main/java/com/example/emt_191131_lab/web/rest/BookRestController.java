package com.example.emt_191131_lab.web.rest;

import com.example.emt_191131_lab.models.Book;
import com.example.emt_191131_lab.models.Category;
import com.example.emt_191131_lab.service.AuthorService;
import com.example.emt_191131_lab.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/books")
public class BookRestController {
    private final BookService bookService;
    private final AuthorService authorService;

    public BookRestController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @GetMapping
    private List<Book> findAll(){
        return this.bookService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> findById(@PathVariable Long id){
        return this.bookService.findById(id)
                .map(book -> ResponseEntity.ok().body(book))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/add")
    public ResponseEntity<Book> save(@RequestParam String name,
                                     @RequestParam Category category,
                                     @RequestParam(required = false) List<Long> authors,
                                     @RequestParam Integer copies){
        return this.bookService.save(name, category, authors, copies)
                .map(book -> ResponseEntity.ok().body(book))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Book> save(@PathVariable Long id,
                                     @RequestParam String name,
                                     @RequestParam Category category,
                                     @RequestParam(required = false) List<Long> authors,
                                     @RequestParam Integer copies){
        return this.bookService.edit(id, name, category, authors, copies)
                .map(book -> ResponseEntity.ok().body(book))
                .orElseGet( () -> ResponseEntity.badRequest().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteById(@PathVariable Long id){
        this.bookService.deleteById(id);
        if(this.bookService.findById(id).isEmpty()) return ResponseEntity.ok().build();
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/markAsTaken/{id}")
    public Book markAsTaken(@PathVariable Long id){
        return this.bookService.markAsTaken(id);
    }
}
