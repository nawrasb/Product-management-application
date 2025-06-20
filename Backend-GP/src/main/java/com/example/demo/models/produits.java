package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class produits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long code;
    private String nomproduit;
    private double prix;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getNomproduit() {
        return nomproduit;
    }

    public void setNomproduit(String nomproduit) {
        this.nomproduit = nomproduit;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @ManyToOne
    subcategorie subcategorie;
    @ManyToOne
    provider provider;
@JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy="produits")
    private List<commande> commande;

    public com.example.demo.models.subcategorie getSubcategorie() {
        return subcategorie;
    }

    public void setSubcategorie(com.example.demo.models.subcategorie subcategorie) {
        this.subcategorie = subcategorie;
    }

    public com.example.demo.models.provider getProvider() {
        return provider;
    }

    public void setProvider(com.example.demo.models.provider provider) {
        this.provider = provider;
    }

    public List<com.example.demo.models.commande> getCommande() {
        return commande;
    }

    public void setCommande(List<com.example.demo.models.commande> commande) {
        this.commande = commande;
    }
}
