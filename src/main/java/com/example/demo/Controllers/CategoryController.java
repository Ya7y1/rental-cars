package com.example.demo.Controllers;


import com.example.demo.Models.Category;
import com.example.demo.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;


@Controller
public  class CategoryController {
    @Autowired
    CategoryService categoryService;


    @RequestMapping("/createCategory")
    public String createCategory() {
        System.out.println("-------------");
        return "CreateCategory";

    }
    @RequestMapping("/Savecategory")
    public String saveCategory(@ModelAttribute("category") Category category , ModelMap modelMap){


        Category memo = categoryService.Savecategory(category);
        String messageController ="the category whose Id:"+
                memo.getId()+ "is saved";
        modelMap.addAttribute("messageJsp",messageController);


return"CreateCategory";
    }
    @RequestMapping("/categoryList")
    public String categoryList(ModelMap modelMap){
        List<Category> categoryController = categoryService.getAllCategory();
        modelMap.addAttribute("categoryJsp",categoryController);
        return "CategoryList";
    }
@RequestMapping("/deleteCategory")
    public String deleteCategory(@RequestParam("id") Long id , ModelMap modelMap){
        categoryService.DeleteCategory(id);
    List<Category> categoryController = categoryService.getAllCategory();
    modelMap.addAttribute("categoryJsp",categoryController);
    return "CategoryList";
}
    @RequestMapping("/showCategory")
    public String showCategory(@RequestParam("id") Long id , ModelMap modelMap){
       Category categorycontroller = categoryService.getCategory(id);
        modelMap.addAttribute("categoryJsp",categorycontroller);
        return "EditCategory";
    }
    @RequestMapping("/updatecategory")
    public String updateCategory(@ModelAttribute("category") Category category  , ModelMap modelMap){


        Category memo = categoryService.Savecategory(category);


        return"CreateCategory";
    }

}
