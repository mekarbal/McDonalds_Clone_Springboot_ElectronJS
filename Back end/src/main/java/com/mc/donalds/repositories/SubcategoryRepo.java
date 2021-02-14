package com.mc.donalds.repositories;

import com.mc.donalds.models.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubcategoryRepo extends JpaRepository<Subcategory,Long> {
    @Query("FROM Subcategory  where id_category=:id")
    public List<Subcategory> findSubcategoryById_category(@Param("id") long id);
}
