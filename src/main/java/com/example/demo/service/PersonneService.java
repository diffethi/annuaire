package com.example.demo.service;

import com.example.demo.entities.Personne;
import com.example.demo.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PersonneService {
    @Autowired
    PersonneRepository personneRepository;


        public List<Personne> getPersonnes(){
            return personneRepository.findAll();
        }

        public void addPersonne(Personne nouvellePersonne) {
            personneRepository.save(nouvellePersonne);
        }


    }


