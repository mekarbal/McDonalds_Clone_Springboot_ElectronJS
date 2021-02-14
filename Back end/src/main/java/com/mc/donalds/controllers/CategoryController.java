package com.mc.donalds.controllers;


import com.mc.donalds.models.Category;
import com.mc.donalds.services.serviceImpl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    CategoryServiceImpl categoryService;



    @GetMapping("/category")
    public List<Category> getAllCat(){
        return categoryService.geAllCAtegories();
    }

    @PostMapping("/category")
    public Category saveCat(@RequestBody Category category){
        return categoryService.saveCategory(category);
    }

    @GetMapping("/category/{id}")
    public Category getOneCat(@PathVariable Long id){
        return categoryService.getOneCategry(id);
    }
    @PutMapping("/category/{id}")
    public String updateCat(@PathVariable Long id,@RequestBody Category category){
        return categoryService.updateCategory(id,category);

    }
    @DeleteMapping("/category/{id}")
    public String deleteCat(@PathVariable Long id){
        return categoryService.deleteCategory(id);
    }
}
