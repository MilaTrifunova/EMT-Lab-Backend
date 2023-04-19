package com.example.emt_191131_lab.service.impl;

import com.example.emt_191131_lab.exceptions.CountryNotFoundException;
import com.example.emt_191131_lab.models.Country;
import com.example.emt_191131_lab.repository.CountryRepository;
import com.example.emt_191131_lab.service.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> findAll() {
        return this.countryRepository.findAll();
    }

    @Override
    public Country findById(Long id) {
        return this.countryRepository.findById(id).orElseThrow(() -> new CountryNotFoundException(id));
    }

    @Override
    public Country findByName(String name) {
        return this.countryRepository.findByNameLike(name);
    }

    @Override
    public Country save(String name, String continent) {
        Country country = new Country(name, continent);
        this.countryRepository.save(country);
        return country;
    }

    @Override
    public Country edit(Long id, String name, String continent) {
        Country country = this.countryRepository.findById(id).orElseThrow( () -> new CountryNotFoundException(id));
        country.setName(name);
        country.setContinent(continent);
        this.countryRepository.save(country);
        return country;
    }

    @Override
    public void deleteById(Long id) {
        this.countryRepository.deleteById(id);
    }
}
