package com.example.demo.controller;

import com.example.demo.service.PersonneService;
import com.example.demo.entities.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonneController {
    @Autowired
    PersonneService personneService;
    @GetMapping("personne")
    public List<Personne> afficherLesPersonnes() {
        return personneService.getPersonnes();
    }
    @PostMapping("personne")
    public void createPerson(@RequestBody Personne nouvellePersonne) {
        System.out.println(nouvellePersonne.getId_per());
        personneService.addPersonne(nouvellePersonne);

    }




}
