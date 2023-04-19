package com.example.emt_191131_lab.service;

import com.example.emt_191131_lab.models.Country;

import java.util.List;

public interface CountryService {

    List<Country> findAll();

    Country findById(Long id);

    Country findByName(String name);

    Country save(String name, String continent);

    Country edit(Long id, String name, String continent);

    void deleteById(Long id);
}
