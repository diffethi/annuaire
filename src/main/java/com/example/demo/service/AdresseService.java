package com.example.demo.service;

import com.example.demo.entities.Adresse;
import com.example.demo.repository.AdresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdresseService {
    @Autowired
    AdresseRepository adresseRepository;


    public List<Adresse> getAdresses(){
        return adresseRepository.findAll();
    }
    public void addAdresse(Adresse nouvelleAdresse) {
        adresseRepository.save(nouvelleAdresse);
    }



}
