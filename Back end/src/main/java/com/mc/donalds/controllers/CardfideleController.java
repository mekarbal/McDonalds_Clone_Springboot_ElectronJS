package com.mc.donalds.controllers;

import com.mc.donalds.models.Cardfidele;
import com.mc.donalds.services.serviceImpl.CardfideleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CardfideleController {


    @Autowired
    CardfideleServiceImpl cardfideleService;

    @GetMapping("/cardfidele")
    public List<Cardfidele> getAllCards(){
        return cardfideleService.getAllCard();
    }

    @PostMapping("/cardfidele")
    public String addCard(@RequestBody Cardfidele cardfidele){
        return cardfideleService.saveCard(cardfidele);
    }
    @GetMapping("/cardfidele/{id}")
    public Cardfidele getCard(@PathVariable Long id){
        return cardfideleService.getOneCard(id);
    }
    @PatchMapping("/cardfidele/{id}")
    public Cardfidele updateCard(@PathVariable Long id,@RequestBody Cardfidele cardfidele){
        return cardfideleService.updateCard(id,cardfidele);
    }

    @DeleteMapping("/cardfidele/{id}")
    public String deleteCord(@PathVariable Long id){
        return cardfideleService.deleteCard(id);

    }

}
