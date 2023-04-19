package com.example.emt_191131_lab.repository;

import com.example.emt_191131_lab.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
    Country findByNameLike(String name);
}
