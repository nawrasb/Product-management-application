package com.example.demo.Controlleur;

import com.example.demo.DAO.*;
import com.example.demo.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Cproduits {
    @Autowired
    private Rproduits rproduits;
    @Autowired
    private Rsubcategorie rsubcategorie;
    @Autowired
    private Rprovider rprovider;

    @PostMapping("/savecproduit/{idsub}/{idprov}")
    public produits saveproduit(@RequestBody produits P,@PathVariable long idsub,@PathVariable long idprov ) {

        subcategorie sub=rsubcategorie.findById(idsub).orElse(null);

        P.setSubcategorie(sub);

        provider prov=rprovider.findById(idprov).orElse(null);

        P.setProvider(prov);


        return rproduits.save(P);
    }

    @GetMapping("/getallproduit")
    public List<produits> getAllproduit(){

        return rproduits.findAll();
    }

    @GetMapping("/getoneproduit/{id}")
    public produits getproduitById(@PathVariable long id)
    {
        return rproduits.findById(id).orElse(null);
    }

    @DeleteMapping("/deleteproduit/{id}")
    public String delateproduit( @PathVariable long id) {
        rproduits.deleteById(id);
        return "produit bien supprimer";
    }

    @PutMapping("/updateproduit/{id}")
    public produits updateproduit(@PathVariable long id, @RequestBody produits newpro) {
        produits oldprod = rproduits.findById(id).orElse(null);
        oldprod.setCode(newpro.getCode());
        oldprod.setNomproduit(newpro.getNomproduit());
        oldprod.setPrix(newpro.getPrix());

        rproduits.save(oldprod);
        return oldprod;
    }
}
