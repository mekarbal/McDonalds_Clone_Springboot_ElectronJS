package com.mc.donalds.services;

import com.mc.donalds.models.Subcategory;

import java.util.List;

public interface SubcategoryService {

    public List<Subcategory> getAll();
    public Subcategory getOne(Long id);
    public String addOne(Subcategory subcategory);
    public String updateOne(Long id,Subcategory subcategory);
    public String deleteOne(Long id);
    public List<Subcategory> getById(long id);
}
