package com.mc.donalds.services;

import com.mc.donalds.models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public List<Product> getAll();
    public Optional<Product> getOne(Long id);
    public String addOne(Product Product);
    public String updateOne(Long id,Product Product);
    public String deleteOne(Long id);
    public List<Product> getProductBySubCategoryId(Long id);
}
