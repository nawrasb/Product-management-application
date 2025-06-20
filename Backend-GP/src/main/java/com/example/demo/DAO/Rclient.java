package com.example.demo.DAO;

import com.example.demo.models.client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rclient extends JpaRepository<client,Long> {
}
