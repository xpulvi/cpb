package com.manager_pbaibol.entitis.reading;


import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "reading")
public class Reading {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String cosaOLetto;

    private LocalDate today = LocalDate.now(); // get date now dey.
     //System.out.println("today toString " + today.toString());
    private String cosaLeggere;
    private String cosaMiColpitoLet;
    /* TODO: 21/09/2023 cosaMiColpitoLet annotare
    giorno in qui si e caricato i dati cosaOletto, cosaMiColpitoLet, cosaLeggere.
     */
    private String cheDomandeHo;
    private String rispoteTrovata;

    public Reading(String cosaOLetto /*, LocalDate today */, String cosaLeggere,
                   String cosaMiColpitoLet, String cheDomandeHo, String rispoteTrovata) {

        this.cosaOLetto = cosaOLetto;
        this.today = today;
       //TODO today LocalDate.now(); non devo inserirlo a mano
        this.cosaLeggere = cosaLeggere;
        this.cosaMiColpitoLet = cosaMiColpitoLet;
        this.cheDomandeHo = cheDomandeHo;
        this.rispoteTrovata = rispoteTrovata;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCosaOLetto() {
        return cosaOLetto;
    }

    public void setCosaOLetto(String cosaOLetto) {
        this.cosaOLetto = cosaOLetto;
    }

    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
    }

    public String getCosaLeggere() {
        return cosaLeggere;
    }

    public void setCosaLeggere(String cosaLeggere) {
        this.cosaLeggere = cosaLeggere;
    }

    public String getCosaMiColpitoLet() {
        return cosaMiColpitoLet;
    }

    public void setCosaMiColpitoLet(String cosaMiColpitoLet) {
        this.cosaMiColpitoLet = cosaMiColpitoLet;
    }

    public String getCheDomandeHo() {
        return cheDomandeHo;
    }

    public void setCheDomandeHo(String cheDomandeHo) {
        this.cheDomandeHo = cheDomandeHo;
    }

    public String getRispoteTrovata() {
        return rispoteTrovata;
    }

    public void setRispoteTrovata(String rispoteTrovata) {
        this.rispoteTrovata = rispoteTrovata;
    }
}
