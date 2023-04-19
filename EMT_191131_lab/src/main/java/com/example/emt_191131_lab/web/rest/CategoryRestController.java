package com.example.emt_191131_lab.web.rest;

import com.example.emt_191131_lab.models.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryRestController {
    @GetMapping
    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();

        categories.add(Category.BIOGRAPHY);
        categories.add(Category.CLASSICS);
        categories.add(Category.DRAMA);
        categories.add(Category.FANTASY);
        categories.add(Category.HISTORY);
        categories.add(Category.NOVEL);
        categories.add(Category.THRILER);
        return categories;
    }
}
