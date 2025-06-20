package com.example.demo.DAO;

import com.example.demo.models.categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rcategorie extends JpaRepository<categorie,Long>{
}
