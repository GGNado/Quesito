package com.quesito;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Quesito {

    private String domanda;
    private String rispostaCorretta;
    private int punteggio;

    public Quesito(String domanda, String rispostaCorretta, int punteggio) {
        this.domanda = domanda;
        this.rispostaCorretta = rispostaCorretta;
        this.punteggio = punteggio;
    }

    public String getDomanda() {
        return domanda;
    }

    public void setDomanda(String domanda) {
        this.domanda = domanda;
    }

    public String getRispostaCorretta() {
        return rispostaCorretta;
    }

    public void setRispostaCorretta(String rispostaCorretta) {
        this.rispostaCorretta = rispostaCorretta;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    public int ask(String risposta){
        if (risposta.equalsIgnoreCase(this.rispostaCorretta)){
            System.out.println("Risposta Corretta, +" + this.punteggio);
            return this.punteggio;
        } else {
            System.out.println("Risposta Sbagliata! La risposta corretta era: " + this.rispostaCorretta);
            return 0;
        }
    }
}
