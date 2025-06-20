package com.example.demo.Controlleur;

import com.example.demo.DAO.Rcategorie;
import com.example.demo.models.categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Ccategorie {
    @Autowired
    private Rcategorie rcategorie;

    @PostMapping("/savecategorie")
    public categorie savecategorie(@RequestBody categorie c) {

        return rcategorie.save(c);
    }

    @GetMapping("/getallcategorie")
    public List<categorie> getAllcategorie() {

        return rcategorie.findAll();
    }

    @GetMapping("/getonecategorie/{id}")
    public categorie getcategorieById(@PathVariable long id) {
        return rcategorie.findById(id).orElse(null);
    }

    @DeleteMapping("/deletecategorie/{id}")
    public String delatecategorie(@PathVariable long id) {
        rcategorie.deleteById(id);
        return "categorie bien supprimer";
    }

    @PutMapping("/updatecategorie/{id}")
    public categorie updatecategorie(@PathVariable long id, @RequestBody categorie newcat) {
        categorie oldcat = rcategorie.findById(id).orElse(null);
        oldcat.setDescription(newcat.getDescription());
        oldcat.setTitre(newcat.getTitre());

        rcategorie.save(oldcat);
        return oldcat;
    }
}
