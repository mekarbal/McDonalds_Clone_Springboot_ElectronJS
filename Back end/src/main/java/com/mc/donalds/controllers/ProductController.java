package com.mc.donalds.controllers;

import com.mc.donalds.models.Product;
import com.mc.donalds.services.serviceImpl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    ProductServiceImpl productServiceImpl;


    @GetMapping("/products")
    public List<Product> getAllProduccts(){
        return productServiceImpl.getAll();
    }
    @GetMapping("/products/{id}")
    public Optional<Product> getOneProduct(@PathVariable Long id){
        return productServiceImpl.getOne(id);
    }
    @PostMapping("/products")
    public String addOneProduct(@RequestBody Product product){
        productServiceImpl.addOne(product);
        return "Product Added";
    }
    @PutMapping("/products/{id}")
    public String updated(@PathVariable Long id,@RequestBody Product product){
        productServiceImpl.updateOne(id, product);
        return "product Updated";
    }
    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable Long id){
        productServiceImpl.deleteOne(id);
        return "Product Deleted";
    }
    @GetMapping("/products/Sub/{id}")
    public List<Product> getAllProductsBySubCat(@PathVariable Long id){
        return  productServiceImpl.getProductBySubCategoryId(id);
    }

}
