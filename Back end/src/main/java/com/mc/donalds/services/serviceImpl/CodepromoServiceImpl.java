package com.mc.donalds.services.serviceImpl;

import com.mc.donalds.models.Codepromo;
import com.mc.donalds.repositories.CodepromoRepo;
import com.mc.donalds.services.CodepromoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CodepromoServiceImpl implements CodepromoService{

    @Autowired
    CodepromoRepo codepromoRepo;

    @Override
    public List<Codepromo> getAll() {
        return codepromoRepo.findAll();
    }

    @Override
    public Optional<Codepromo> getOne(Long id) {
        return codepromoRepo.findById(id);
    }

    @Override
    public String addOne(Codepromo codepromo) {
         codepromoRepo.save(codepromo);
         return "Code promo added";
    }

    @Override
    public String updateOne(Long id, Codepromo codepromo) {
        Codepromo findedCode=codepromoRepo.findById(id).orElse(null);

        findedCode.setCode(codepromo.getCode());
        findedCode.setCodestatus(codepromo.getCodestatus());
        findedCode.setRedu(codepromo.getRedu());
        codepromoRepo.save(findedCode);
        return "code promo updated";
    }

    @Override
    public String deleteOne(Long id) {
         codepromoRepo.deleteById(id);
        return "code promo deleted";
    }
}
