package com.mc.donalds.services.serviceImpl;

import com.mc.donalds.models.Cardfidele;
import com.mc.donalds.repositories.CardfideleRepo;
import com.mc.donalds.services.CardfideleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardfideleServiceImpl implements CardfideleService {

    @Autowired
    CardfideleRepo cardfideleRepo;

    @Override
    public List<Cardfidele> getAllCard() {
        return cardfideleRepo.findAll();
    }


    public Cardfidele getOneCard(Long id) {
        return cardfideleRepo.findById(id).orElse(null);
    }

    @Override
    public String saveCard(Cardfidele cardfidele) {
        cardfideleRepo.save(cardfidele);
        return "card added";
    }


    @Override
    public String deleteCard(Long id) {
         cardfideleRepo.deleteById(id);
         return "Card deeleted";


    }

    @Override
    public Cardfidele updateCard(Long id,Cardfidele cardfidele) {
        Cardfidele cardFind=cardfideleRepo.findById(id).orElse(null);
    cardFind.setPoints(cardfidele.getPoints());
    cardFind.setPin(cardfidele.getPin());
   return   cardfideleRepo.save(cardFind);

    }




}
