package com.mc.donalds.services.serviceImpl;

import com.mc.donalds.models.Ingerdient;
import com.mc.donalds.repositories.IngredientRepo;
import com.mc.donalds.services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    IngredientRepo ingredientRepo;


    @Override
    public List<Ingerdient> getAll() {
        return ingredientRepo.findAll();
    }

    @Override
    public Ingerdient getOne(Long id) {
        return ingredientRepo.findById(id).orElse(null);
    }

    @Override
    public String addOne(Ingerdient ingerdient) {
         ingredientRepo.save(ingerdient);
        return "Ingredient addedd";
    }

    @Override
    public String updateOne(Long id,Ingerdient ingerdient) {
        Ingerdient findedOne=ingredientRepo.findById(id).orElse(null);

        findedOne.setIngredientName(ingerdient.getIngredientName());
        ingredientRepo.save(findedOne);
        return "ingredient updated";
    }

    @Override
    public String deleteOne(Long id) {
        ingredientRepo.deleteById(id);
        return "ingredient deleted";
    }
}
