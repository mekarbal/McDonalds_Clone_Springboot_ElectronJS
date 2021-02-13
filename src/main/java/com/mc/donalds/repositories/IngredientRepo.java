package com.mc.donalds.repositories;

import com.mc.donalds.models.Ingerdient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepo extends JpaRepository<Ingerdient,Long> {
}
