package com.mc.donalds.services;

import com.mc.donalds.models.Commande;

import java.util.List;

public interface CommandeService {
    public List<Commande> getAll();
    public Commande getOne(Long id);
    public Commande addOne(Commande commande);
    public String deleteOne(Long id);
}
