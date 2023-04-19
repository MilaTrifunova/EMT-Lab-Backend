package com.example.emt_191131_lab.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String name;

    String continent;

    //konstruktor so argumenti
    public Country(String name, String continent){
        this.name = name;
        this.continent = continent;
    }

    //prazen konstruktor
    public Country(){ }

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

    public String getContinent(){
        return this.continent;
    }

    public void setContinent(String continent){
        this.continent = continent;
    }
}
