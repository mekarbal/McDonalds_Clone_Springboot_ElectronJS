package com.mc.donalds.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cardfidele {

    @Id
    @GeneratedValue
    private Long id;
    private String pin;
    private Integer points;

    public Cardfidele() {
    }

    public Cardfidele(Long id, String pin, Integer points) {
        this.id = id;
        this.pin = pin;
        this.points = points;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Caardfidele{" +
                "id=" + id +
                ", pin='" + pin + '\'' +
                ", points=" + points +
                '}';
    }
}
