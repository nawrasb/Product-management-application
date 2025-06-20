package com.example.demo.DAO;

import com.example.demo.models.subcategorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rsubcategorie extends JpaRepository<subcategorie,Long> {
}
