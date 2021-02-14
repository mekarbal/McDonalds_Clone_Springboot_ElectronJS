package com.mc.donalds.services;

import com.mc.donalds.models.Cardfidele;

import java.util.List;

public interface CardfideleService {
    public List<Cardfidele> getAllCard();
    public Cardfidele getOneCard(Long id);
    public String saveCard(Cardfidele cardfidele);
    public String deleteCard(Long id);
    public Cardfidele updateCard(Long id,Cardfidele cardfidele);

}
