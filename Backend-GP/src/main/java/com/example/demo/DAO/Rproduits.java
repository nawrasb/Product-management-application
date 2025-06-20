package com.example.demo.DAO;

import com.example.demo.models.produits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rproduits extends JpaRepository<produits,Long> {
}
