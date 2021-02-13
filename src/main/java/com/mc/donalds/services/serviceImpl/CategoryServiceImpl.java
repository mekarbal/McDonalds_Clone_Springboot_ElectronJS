package com.mc.donalds.services.serviceImpl;

import com.mc.donalds.models.Category;
import com.mc.donalds.repositories.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl {
    @Autowired
    CategoryRepo categoryRepo;


    public List<Category> geAllCAtegories(){
        return categoryRepo.findAll();
    }

    public Category getOneCategry(Long id){
        return categoryRepo.findById(id).orElse(null);
    }


    public Category saveCategory(Category category){
    return categoryRepo.save(category);
    }
    public String deleteCategory(Long id){
         categoryRepo.deleteById(id);
        return "Category deleted";
    }

    public String updateCategory(Long id,Category category){
        Category catFinded=categoryRepo.findById(id).orElse(null);
        catFinded.setCategoryname(category.getCategoryname());
        catFinded.setImg(category.getImg());
        categoryRepo.save(catFinded);
        return "category updated";
    }
}
