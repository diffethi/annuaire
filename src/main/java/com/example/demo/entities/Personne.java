package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name="personnes")
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String name,firstName;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="id_ad")
    private Adresse adresse;

    public Personne() {

    }

    public Personne(int id, String name, String firstName, Adresse adress) {

        this.name = name;
        this.firstName = firstName;
        this.adresse = adresse;
    }

    public long getId_per() {
        return id;
    }

    public void setId_per(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdress(String adress) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                '}';
    }
}
