package com.mc.donalds.repositories;

import com.mc.donalds.models.Product;
import com.mc.donalds.models.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Long> {
    @Query("FROM Product where id_subcategory=:id")
    public List<Product> findProductById_subcategory(@Param("id") long id);
}
