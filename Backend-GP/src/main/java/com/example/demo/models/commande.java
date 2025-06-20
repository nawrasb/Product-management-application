package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    private double total;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    @ManyToOne
    produits produits;

    @ManyToOne
    client client;

    public com.example.demo.models.produits getProduits() {
        return produits;
    }

    public void setProduits(com.example.demo.models.produits produits) {
        this.produits = produits;
    }

    public com.example.demo.models.client getClient() {
        return client;
    }

    public void setClient(com.example.demo.models.client client) {
        this.client = client;
    }
}
