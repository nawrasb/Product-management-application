package com.example.demo.Controlleur;

import com.example.demo.DAO.Ruser;
import com.example.demo.models.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class Cuser {
    @Autowired
    private Ruser ruser;

    @PostMapping("/saveuser1")
    public user saveuser(@RequestBody user u) {
        return ruser.save(u);
    }

    @GetMapping("/getalluser1")
    public List<user> getAlluser(){

        return ruser.findAll();
    }

    @GetMapping("/getoneuser1/{id}")
    public user getuserById(@PathVariable long id){

        return ruser.findById(id).orElse(null);
    }

    @DeleteMapping("/deleteuser1/{id}")
    public String delateuser( @PathVariable long id) {
        ruser.deleteById(id);
        return "user bien supprimer";
    }

    @PutMapping("/updateuser/{id}")
    public user updateuser(@PathVariable long id,@RequestBody user newuser){
        user olduser=ruser.findById(id).orElse(null);
        olduser.setPassword(newuser.getPassword());
        olduser.setUsername(newuser.getUsername());
        ruser.save(olduser);
        return olduser;
    }
}
