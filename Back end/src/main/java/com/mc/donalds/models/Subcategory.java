package com.mc.donalds.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subcategories")
public class Subcategory {
    @Id
    @GeneratedValue
    private Long Id;
    private Long id_category;
    private String subcategoryName;
    private String img;

    public Subcategory(Long id, Long id_category, String subcategoryName, String img) {
        Id = id;
        this.id_category = id_category;
        this.subcategoryName = subcategoryName;
        this.img = img;
    }

    public Subcategory() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getId_category() {
        return id_category;
    }

    public void setId_category(Long id_category) {
        this.id_category = id_category;
    }

    public String getSubcategoryName() {
        return subcategoryName;
    }

    public void setSubcategoryName(String subcategoryName) {
        this.subcategoryName = subcategoryName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Subcategory{" +
                "Id=" + Id +
                ", id_category='" + id_category + '\'' +
                ", subcategoryName='" + subcategoryName + '\'' +
                ", img='" + img + '\'' +
                '}';
    }

}
