package com.example.demo.DAO;

import com.example.demo.models.commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rcommande extends JpaRepository<commande,Long> {
}
