package com.example.demo.entities;

import com.example.demo.entities.Personne;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="adresse")
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_ad;
    private int num,zip;
    private String rue, ville;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Personne> personnes= new HashSet<>();

    public Adresse() {
    }

    public Adresse(long id_ad, int num, int zip, String rue, String ville) {
        this.id_ad = id_ad;
        this.num = num;
        this.zip = zip;
        this.rue = rue;
        this.ville = ville;
    }

    public long getId_ad() {
        return id_ad;
    }

    public void setId_ad(long id_ad) {
        this.id_ad = id_ad;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "id_ad=" + id_ad +
                ", num=" + num +
                ", zip=" + zip +
                ", rue='" + rue + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
