package com.mc.donalds.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commandes")
public class Commande {
    @Id
    @GeneratedValue
    private Long id;
    private Long productid;
    private int price;
    private int quantite;
    private String tableserv;
    private String promocode;
    private String cardfidele;
    private String way;

    public Commande(Long id, Long productid, int price, int quantite, String tableserv, String promocode, String cardfidele, String way) {
        this.id = id;
        this.productid = productid;
        this.price = price;
        this.quantite = quantite;
        this.tableserv = tableserv;
        this.promocode = promocode;
        this.cardfidele = cardfidele;
        this.way = way;
    }

    public Commande() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getTableserv() {
        return tableserv;
    }

    public void setTableserv(String tableserv) {
        this.tableserv = tableserv;
    }

    public String getPromocode() {
        return promocode;
    }

    public void setPromocode(String promocode) {
        this.promocode = promocode;
    }

    public String getCardfidele() {
        return cardfidele;
    }

    public void setCardfidele(String cardfidele) {
        this.cardfidele = cardfidele;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", productid='" + productid + '\'' +
                ", price=" + price +
                ", quantite=" + quantite +
                ", tableserv='" + tableserv + '\'' +
                ", promocode='" + promocode + '\'' +
                ", cardfidele='" + cardfidele + '\'' +
                ", way='" + way + '\'' +
                '}';
    }
}
