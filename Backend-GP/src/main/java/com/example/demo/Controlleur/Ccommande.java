package com.example.demo.Controlleur;

import com.example.demo.DAO.Rclient;
import com.example.demo.DAO.Rcommande;
import com.example.demo.DAO.Rproduits;
import com.example.demo.models.client;
import com.example.demo.models.commande;
import com.example.demo.models.produits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Ccommande {
    @Autowired
    private Rcommande rcommande;
    @Autowired
    private Rproduits rproduits;
    @Autowired
    private Rclient rclient;

    @PostMapping("/savecommande/{idp}/{idcl}")
    public commande savecommande(@RequestBody commande com,@PathVariable long idp,@PathVariable long idcl) {

        produits pro=rproduits.findById(idp).orElse(null);

        com.setProduits(pro);

        client cl=rclient.findById(idcl).orElse(null);

        com.setClient(cl);

        return rcommande.save(com);
    }

    @GetMapping("/getallcommande")
    public List<commande> getAllcommande(){

        return rcommande.findAll();
    }

    @GetMapping("/getonecommande/{id}")
    public commande getcommandeById(@PathVariable long id)
    {
        return rcommande.findById(id).orElse(null);
    }

    @DeleteMapping("/deletecommande/{id}")
    public String delatecommande( @PathVariable long id) {
        rcommande.deleteById(id);
        return "commande bien supprimer";
    }

    @PutMapping("/updatecommande/{id}")
    public commande updatecommande(@PathVariable long id, @RequestBody commande newcom) {
        commande oldcom = rcommande.findById(id).orElse(null);
        oldcom.setDate(newcom.getDate());
        oldcom.setTotal(newcom.getTotal());

        rcommande.save(oldcom);
        return oldcom;
    }
}
