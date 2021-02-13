package com.mc.donalds.services.serviceImpl;

import com.mc.donalds.models.Product;
import com.mc.donalds.repositories.ProductRepo;
import com.mc.donalds.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productService;

    @Override
    public List<Product> getAll() {
        return productService.findAll();
    }

    @Override
    public Optional<Product> getOne(Long id) {
        return productService.findById(id);
    }

    @Override
    public String addOne(Product product) {
         productService.save(product);
        return "product added";
    }

    @Override
    public String updateOne(Long id, Product product) {
        Product findedPro=productService.findById(id).orElse(null);
        findedPro.setProductPrice(product.getProductPrice());
        findedPro.setProductName(product.getProductName());
        findedPro.setImg(product.getImg());
        findedPro.setId_ingredient(product.getId_ingredient());
        findedPro.setId_subcategory(product.getId_subcategory());

        productService.save(findedPro);
        return "Product Updated";
    }

    @Override
    public String deleteOne(Long id) {
         productService.deleteById(id);
        return "Product deleted";
    }

    @Override
    public List<Product> getProductBySubCategoryId(Long id) {
        return productService.findProductById_subcategory(id);
    }
}
