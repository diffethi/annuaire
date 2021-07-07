package com.example.demo.repository;

import com.example.demo.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PersonneRepository extends JpaRepository<Personne, Long> {




}
