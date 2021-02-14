package com.mc.donalds.services.serviceImpl;

import com.mc.donalds.models.Commande;
import com.mc.donalds.repositories.CommandeRepo;
import com.mc.donalds.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeServiceImpl implements CommandeService {


    @Autowired
    CommandeRepo commandeRepo;

    @Override
    public List<Commande> getAll() {
        return commandeRepo.findAll();
    }

    @Override
    public Commande getOne(Long id) {
        return commandeRepo.findById(id).orElse(null);
    }

    @Override
    public Commande addOne(Commande commande) {
        return commandeRepo.save(commande);
    }

    @Override
    public String deleteOne(Long id) {
         commandeRepo.deleteById(id);
        return "Commande deleted";
    }
}
