package com.example.demo.Controlleur;

import com.example.demo.DAO.Rprovider;
import com.example.demo.models.provider;
import com.example.demo.models.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Cprovider extends user {
    @Autowired
    private Rprovider rprovider;

    @PostMapping("/savecprovider")
    public provider saveprovider(@RequestBody provider p) {

        return rprovider.save(p);
    }

    @GetMapping("/getallprovider")
    public List<provider> getAllprovider(){

        return rprovider.findAll();
    }

    @GetMapping("/getoneprovider/{id}")
    public provider getproviderById(@PathVariable long id)
    {
        return rprovider.findById(id).orElse(null);
    }

    @DeleteMapping("/deleteprovider/{id}")
    public String delateprovider( @PathVariable long id) {
        rprovider.deleteById(id);
        return "provider bien supprimer";
    }

    @PutMapping("/updateprovider/{id}")
    public provider updateprovider(@PathVariable long id , @RequestBody provider newpro){
        provider oldpro = rprovider.findById(id).orElse(null);
        oldpro.setNomSociete(newpro.getNomSociete());

        rprovider.save(oldpro);
        return oldpro;
    }
}
