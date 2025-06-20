package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titre;
    private String description;

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

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy="categorie")
    private List<subcategorie> subcategories;

    public List<subcategorie> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<subcategorie> subcategories) {
        this.subcategories = subcategories;
    }
}
