package com.quesito;

public class Main {
    public static void main(String[] args) {
        Quesito quesito = new Quesito("Quanti alberi ci sono?", "nessuno", 10);
        quesito.ask("Nessuno");

        QuesitoSiNo quesitoSiNo = new QuesitoSiNo("5 x 2 è uguale a 10?", "Si", 2);
        quesitoSiNo.ask("nn");
    }
}
