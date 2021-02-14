package com.mc.donalds.services;

import com.mc.donalds.models.Ingerdient;
import com.mc.donalds.models.Subcategory;

import java.util.List;


public interface IngredientService {
  public List<Ingerdient> getAll();
  public Ingerdient getOne(Long id);
  public String addOne(Ingerdient ingerdient);
  public String updateOne(Long id,Ingerdient ingerdient);
  public String deleteOne(Long id);
}
