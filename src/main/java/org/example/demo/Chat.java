package org.example.demo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class Chat {
    private String nom;
    private String race;
    private String repasFavori;


    private LocalDate dateNaissance;

    public Chat(String nom, String race, String repasFavori, LocalDate dateNaissance) {
        this.nom = nom;
        this.race = race;
        this.repasFavori = repasFavori;
        this.dateNaissance = dateNaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getRepasFavori() {
        return repasFavori;
    }

    public void setRepasFavori(String repasFavori) {
        this.repasFavori = repasFavori;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int getAge() {
        if (dateNaissance == null) {
            return 0;
        }
        return Period.between(dateNaissance, LocalDate.now()).getYears();
    }

}
