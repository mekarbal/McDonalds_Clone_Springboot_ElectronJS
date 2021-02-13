package com.mc.donalds.services.serviceImpl;

import com.mc.donalds.models.Subcategory;
import com.mc.donalds.repositories.SubcategoryRepo;
import com.mc.donalds.services.SubcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubcategoryServiceImpl implements SubcategoryService {

    @Autowired
    SubcategoryRepo subcategoryRepo;

    @Override
    public List<Subcategory> getAll() {
        return subcategoryRepo.findAll();

    }

    @Override
    public Subcategory getOne(Long id) {
        return subcategoryRepo.findById(id).orElse(null);
    }

    @Override
    public String addOne(Subcategory subcategory) {
         subcategoryRepo.save(subcategory);
        return "Subcartegory added";
    }

    @Override
    public String updateOne(Long id, Subcategory subcategory) {
        Subcategory findedOne=subcategoryRepo.findById(id).orElse(null);
        findedOne.setSubcategoryName(subcategory.getSubcategoryName());
        findedOne.setImg(subcategory.getImg());
        subcategoryRepo.save(findedOne);
        return "subcategory updated";
    }

    @Override
    public String deleteOne(Long id) {
        subcategoryRepo.deleteById(id);
        return "subcategory deleted";
    }

    @Override
    public List<Subcategory> getById(long id) {
        return subcategoryRepo.findSubcategoryById_category(id);
    }



}
