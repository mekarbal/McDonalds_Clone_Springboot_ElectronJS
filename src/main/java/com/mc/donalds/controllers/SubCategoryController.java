package com.mc.donalds.controllers;

import com.mc.donalds.models.Subcategory;
import com.mc.donalds.services.serviceImpl.SubcategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubCategoryController {

    @Autowired
    SubcategoryServiceImpl subcategoryServiceImpl;


    @GetMapping("/subcategory")
    public List<Subcategory> getAllSubCategories(){
        return subcategoryServiceImpl.getAll();
    }
    @GetMapping("/subcategory/{id}")
    public Subcategory getOneCategory(@PathVariable Long id){
        return subcategoryServiceImpl.getOne(id);
    }

    @PostMapping("/subcategory")
    public String addSubCategory(@RequestBody Subcategory subcategory){
         subcategoryServiceImpl.addOne(subcategory);
        return "SubCategory added";
    }

    @PutMapping("/subcategory/{id}")
    public String updateSubCategory(@PathVariable Long id,@RequestBody Subcategory subcategory){
        subcategoryServiceImpl.updateOne(id,subcategory);
        return "subcategory updated";
    }

    @DeleteMapping("/subcategory/{id}")
    public String deleteSubCategory(@PathVariable Long id){
        subcategoryServiceImpl.deleteOne(id);
        return "SubCategory Deleted";
    }

    @GetMapping("/subcategory/findsubCatByCatId/{id}")
    public List<Subcategory> getAllSubCategoriesByID(@PathVariable Long id){
        return (List<Subcategory>) subcategoryServiceImpl.getById(id);
    }
}
