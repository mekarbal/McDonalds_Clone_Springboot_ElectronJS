package com.mc.donalds.services;

import com.mc.donalds.models.Codepromo;

import java.util.List;
import java.util.Optional;

public interface CodepromoService {

    public List<Codepromo> getAll();
    public Optional<Codepromo> getOne(Long id);
    public String addOne(Codepromo codepromo);
    public String updateOne(Long id,Codepromo codepromo);
    public String deleteOne(Long id);
}
