package com.example.demo.DAO;

import com.example.demo.models.provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rprovider extends JpaRepository<provider,Long> {
}
