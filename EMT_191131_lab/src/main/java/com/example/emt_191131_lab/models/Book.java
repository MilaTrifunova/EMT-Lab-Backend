package com.example.emt_191131_lab.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated
    private Category category;

    @ManyToMany
    List<Author> author;

    private Integer availableCopies;

    // konstruktor so argumenti
    public Book(String name, Category category, List<Author> author, Integer availableCopies){
        this.name = name;
        this.category = category;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    //prazen konstruktor
    public Book() { }

    // Geteri i seteri

    public Long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Category getCategory(){
        return this.category;
    }

    public void setCategory(Category category){
        this.category = category;
    }

    public List<Author> getAuthors(){
        return this.author;
    }

    public void setAuthors(List<Author> author){
        this.author = author;
    }

    public Integer getAvailableCopies(){
        return this.availableCopies;
    }

    public void setAvailableCopies(Integer availableCopies){
        this.availableCopies = availableCopies;
    }
}
