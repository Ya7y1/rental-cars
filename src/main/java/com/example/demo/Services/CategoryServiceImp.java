package com.example.demo.Services;

import com.example.demo.Models.Category;
import com.example.demo.Repositories.CategoryRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService {

    @Autowired
    CategoryRepostory categoryRepostory;
    @Override
    public Category Savecategory(Category category) {
        return categoryRepostory.save(category);
    }

    @Override
    public Category UpdateCategory(Category category) {
        return categoryRepostory.save(category);
    }

    @Override
    public Category getCategory(Long id) {
        return categoryRepostory.findById(id).get();
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepostory.findAll();
    }

    @Override
    public void DeleteCategory(Long id) {
        categoryRepostory.deleteById(id);

    }

    @Override
    public void DeleteAllCategory() {
         categoryRepostory.deleteAll();
    }
}
