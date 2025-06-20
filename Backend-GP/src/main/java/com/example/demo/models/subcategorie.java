package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class subcategorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titre;
    private  String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToOne
    categorie categorie;
@JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy="subcategorie")
    private List<produits> produits;

    public com.example.demo.models.categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(com.example.demo.models.categorie categorie) {
        this.categorie = categorie;
    }

    public List<com.example.demo.models.produits> getProduits() {
        return produits;
    }

    public void setProduits(List<com.example.demo.models.produits> produits) {
        this.produits = produits;
    }
}
