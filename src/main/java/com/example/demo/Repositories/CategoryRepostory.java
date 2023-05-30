package com.example.demo.Repositories;

import com.example.demo.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepostory extends JpaRepository<Category ,Long> {

}
