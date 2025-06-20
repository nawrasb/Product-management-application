package com.example.demo.Controlleur;

import com.example.demo.DAO.Rcategorie;
import com.example.demo.DAO.Rsubcategorie;
import com.example.demo.models.categorie;
import com.example.demo.models.subcategorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Csubcategorie {
    @Autowired
    private Rsubcategorie rsubcategorie;
    @Autowired
    private Rcategorie rcategorie;

    @PostMapping("/savesubcategorie/{idc}")
    public subcategorie savesubcategorie(@RequestBody subcategorie sc,@PathVariable Long idc) {
        categorie c=rcategorie.findById(idc).orElse(null);

       sc.setCategorie(c);
        return rsubcategorie.save(sc);
    }

    @GetMapping("/getallsubcategorie")
    public List<subcategorie> getAllsubcategorie(){

        return rsubcategorie.findAll();
    }

    @GetMapping("/getonesubcategorie/{id}")
    public subcategorie getsubcategorieById(@PathVariable long id)
    {
        return rsubcategorie.findById(id).orElse(null);
    }

    @DeleteMapping("/deletesubcategorie/{id}")
    public String delatesubcategorie( @PathVariable long id) {
        rsubcategorie.deleteById(id);
        return "subcategorie bien supprimer";
    }
   @PutMapping("/updatesubcategorie/{id}")
    public subcategorie updatesubcategorie(@PathVariable long id , @RequestBody subcategorie newsub){
       subcategorie oldsub = rsubcategorie.findById(id).orElse(null);
       oldsub.setDescription(newsub.getDescription());
       oldsub.setTitre(newsub.getTitre());


       rsubcategorie.save(oldsub);
       return oldsub;
   }
}
