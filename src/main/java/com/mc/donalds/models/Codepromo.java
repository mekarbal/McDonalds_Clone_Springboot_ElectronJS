package com.mc.donalds.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "codepromos")
public class Codepromo {

    @Id
    @GeneratedValue
    private Long id;
    private String code;
    private boolean codestatus;
    private int redu;

    public Codepromo(Long id, String code, boolean codestatus, Integer redu) {
        this.id = id;
        this.code = code;
        this.codestatus = codestatus;
        this.redu = redu;
    }


    public  Codepromo(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean getCodestatus() {
        return codestatus;
    }

    public void setCodestatus(boolean codestatus) {
        this.codestatus = codestatus;
    }

    public int getRedu() {
        return redu;
    }

    public void setRedu(int redu) {
        this.redu = redu;
    }

    @Override
    public String toString() {
        return "Codepromo{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", codestatus=" + codestatus +
                ", redu=" + redu +
                '}';
    }
}
