package com.example.demo.controller;

import com.example.demo.service.AdresseService;
import com.example.demo.entities.Adresse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AdresseController {
    @Autowired
    AdresseService adresseService;

    @GetMapping("adresse")
    public List<Adresse> afficherLesAdresse() {
        return adresseService.getAdresses();
    }
    @PostMapping("adresse")
    public void createadress(@RequestBody Adresse nouvelleAdresse) {
        System.out.println(nouvelleAdresse.getId_ad());
        adresseService.addAdresse(nouvelleAdresse);

    }



}
