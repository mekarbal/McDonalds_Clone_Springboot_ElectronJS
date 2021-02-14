package com.mc.donalds.controllers;

import com.mc.donalds.models.Commande;
import com.mc.donalds.services.serviceImpl.CommandeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommandeController {


    @Autowired
    CommandeServiceImpl commandeServiceImpl;


    @GetMapping("/commande")
    public List<Commande> getAllCommandes(){
        return commandeServiceImpl.getAll();
    }

    @GetMapping("/commande/{id}")
    public Commande getCommande(@PathVariable Long id){
        return commandeServiceImpl.getOne(id);
    }

    @DeleteMapping("/commande/{id}")
    public String deleteCommande(@PathVariable Long id){
        return commandeServiceImpl.deleteOne(id);
    }
    @PostMapping("/commande")
    public String addCommande(@RequestBody Commande commande){
         commandeServiceImpl.addOne(commande);
         return "commande added";
    }
}
