package com.quesito;

import java.util.Scanner;

public class QuesitoSiNo extends Quesito{

    public QuesitoSiNo(String domanda, String rispostaCorretta, int punteggio) {
        super(domanda, rispostaCorretta, punteggio);
    }

    @Override
    public int ask(String risposta){

        if (!risposta.equalsIgnoreCase("si") && !risposta.equalsIgnoreCase("no")){
            System.out.println("Risposta non valida, devi rispondere con Si o No");
            return 0;
        }
        
        if (risposta.equalsIgnoreCase(getRispostaCorretta())){
            System.out.println("Risposta Corretta, +" + getPunteggio());
            return getPunteggio();
        } else {
            System.out.println("Risposta Sbagliata! La risposta corretta era: " + getRispostaCorretta());
            return 0;
        }
    }
}
