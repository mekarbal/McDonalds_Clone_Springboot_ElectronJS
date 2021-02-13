package com.mc.donalds.controllers;

import com.mc.donalds.models.Codepromo;
import com.mc.donalds.services.serviceImpl.CodepromoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CodepromoController {

    @Autowired
    CodepromoServiceImpl codepromoService;


    @GetMapping("/codepromo")
    public List<Codepromo> getAllPromos(){
        return  codepromoService.getAll();
    }

    @GetMapping("/codepromo/{id}")
    public Codepromo getCodePromo(@PathVariable Long id){
        return codepromoService.getOne(id).orElse(null);
    }

    @PostMapping("/codepromo")
    public String addCodePromo(@RequestBody Codepromo codepromo){
        return codepromoService.addOne(codepromo);
    }

    @PutMapping("/codepromo/{id}")
    public String updateCodePromo(@PathVariable Long id,@RequestBody Codepromo codepromo){
        return codepromoService.updateOne(id, codepromo);
    }

    @DeleteMapping("/codepromo/{id}")
    public String deleteCodePromo(@PathVariable Long id){
        return  codepromoService.deleteOne(id);
    }
}
