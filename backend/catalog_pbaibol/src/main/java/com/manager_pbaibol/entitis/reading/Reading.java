package com.manager_pbaibol.entitis.reading;


import java.time.LocalDate;

public class Reading {


    private String cosaOletto;
    private LocalDate today = LocalDate.now(); // get date now dey.
     //System.out.println("today toString " + today.toString());
    private String cosaLeggere;
    private String cosaMiColpitoLet;
    /* TODO: 21/09/2023 cosaMiColpitoLet annotare
    giorno in qui si e caricato i dati cosaOletto, cosaMiColpitoLet, cosaLeggere.
     */

    public Reading(String cosaOletto, String cosaLeggere, String cosaMiColpitoLet) {
        this.cosaOletto = cosaOletto;
        this.cosaLeggere = cosaLeggere;
        this.cosaMiColpitoLet = cosaMiColpitoLet;
    }

    public String getCosaOletto() {
        return cosaOletto;
    }

    public void setCosaOletto(String cosaOletto) {
        this.cosaOletto = cosaOletto;
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
}
