package com.mc.donalds.controllers;

import com.mc.donalds.models.Ingerdient;
import com.mc.donalds.services.serviceImpl.IngredientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IngredientController {


    @Autowired
    IngredientServiceImpl ingredientService;


    @GetMapping("/ingredient")
    public List<Ingerdient> getAllIngredients(){
        return ingredientService.getAll();
    }

    @GetMapping("/ingredient/{id}")
    public Ingerdient getOneIngredient(@PathVariable Long id){
        return ingredientService.getOne(id);
    }

    @PostMapping("/ingredient")
    public String addIngridient(@RequestBody Ingerdient ingerdient){
        return ingredientService.addOne(ingerdient);
    }
    @DeleteMapping("/ingredient/{id}")
    public String deleteIngredients(@PathVariable Long id){
        return ingredientService.deleteOne(id);
    }
    @PutMapping("/ingredient/{id}")
    public String updateigridient(@PathVariable Long id,@RequestBody Ingerdient ingerdient){
        return ingredientService.updateOne(id, ingerdient);

    }
}
