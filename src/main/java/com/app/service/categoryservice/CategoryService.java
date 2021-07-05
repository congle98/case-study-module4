package com.app.service.categoryservice;

import com.app.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CategoryService implements ICategoryService{
    @Autowired
    ICategoryService categoryService;

    @Override
    public Iterable<Category> findAll() {
        return categoryService.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryService.findById(id);
    }

    @Override
    public void save(Category category) {
        categoryService.save(category);

    }

    @Override
    public void remove(Long id) {
        categoryService.remove(id);
    }
}
