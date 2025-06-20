package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class provider extends user{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomSociete;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getNomSociete() {
        return nomSociete;
    }

    public void setNomSociete(String nomSociete) {
        this.nomSociete = nomSociete;
    }
@JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy="provider")
    private List<produits> produits;

    public List<com.example.demo.models.produits> getProduits() {
        return produits;
    }

    public void setProduits(List<com.example.demo.models.produits> produits) {
        this.produits = produits;
    }
}
