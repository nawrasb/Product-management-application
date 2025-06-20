package com.example.demo.Controlleur;

import com.example.demo.DAO.Rclient;
import com.example.demo.DAO.Rcommande;
import com.example.demo.models.client;
import com.example.demo.models.commande;
import com.example.demo.models.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Cclient extends user {
    @Autowired
    private Rclient rclient;
    @Autowired
    private Rcommande rcommande;

    @PostMapping("/saveclient")

    public client saveclient(@RequestBody client cl) {

        return rclient.save(cl);
    }

    @GetMapping("/getallclient")
    public List<client> getAllclient(){

        return rclient.findAll();
    }

    @GetMapping("/getoneclient/{id}")
    public client getclientById(@PathVariable long id)
    {
        return rclient.findById(id).orElse(null);
    }

    @DeleteMapping("/deleteclient/{id}")
    public String delateclient( @PathVariable long id) {
        rclient.deleteById(id);
        return "client bien supprimer";
    }

    @PutMapping("/updateclient/{id}")
    public client updateclient(@PathVariable long id, @RequestBody client newclient) {
        client oldclient = rclient.findById(id).orElse(null);
        oldclient.setUsername(newclient.getUsername());
        oldclient.setPassword(newclient.getPassword());
        oldclient.setNom(newclient.getNom());
        oldclient.setPrenom(newclient.getPrenom());
        oldclient.setAdresse(newclient.getAdresse());

        rclient.save(oldclient);
        return oldclient;
    }
}
