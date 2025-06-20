package com.example.demo.DAO;

import com.example.demo.models.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ruser extends JpaRepository<user,Long>{
}
