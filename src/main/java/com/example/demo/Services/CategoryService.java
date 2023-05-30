package com.example.demo.Services;

import com.example.demo.Models.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService  {
    Category Savecategory(Category category);
    Category UpdateCategory (Category category);
    Category getCategory(Long id);
    List<Category> getAllCategory();
    void DeleteCategory(Long id);
    void DeleteAllCategory();


}
