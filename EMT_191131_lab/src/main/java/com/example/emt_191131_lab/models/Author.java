package com.example.emt_191131_lab.models;

import jakarta.persistence.*;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    @ManyToOne
    private Country country;

    //konstruktor so argumenti
    public Author(String name, String surname, Country country){
        this.name = name;
        this.surname = surname;
        this.country = country;
    }

    //prazen konstruktor
    public Author(){ }

    //geteri i seteri

    public Long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public Country getCountry(){
        return this.country;
    }

    public void setCountry(Country country){
        this.country = country;
    }
}
