package com.mc.donalds.models;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private Long id_ingredient;
    private Long id_subcategory;
    private String productName;
    private int productPrice;
    private String img;

    public Product(Long id, Long id_ingredient, Long id_subcategory, String productName, int productPrice, String img) {
        this.id = id;
        this.id_ingredient = id_ingredient;
        this.id_subcategory = id_subcategory;
        this.productName = productName;
        this.productPrice = productPrice;
        this.img = img;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_ingredient() {
        return id_ingredient;
    }

    public void setId_ingredient(Long id_ingredient) {
        this.id_ingredient = id_ingredient;
    }

    public Long getId_subcategory() {
        return id_subcategory;
    }

    public void setId_subcategory(Long id_subcategory) {
        this.id_subcategory = id_subcategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", id_ingredient=" + id_ingredient +
                ", id_subcategory=" + id_subcategory +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", img='" + img + '\'' +
                '}';
    }
}
