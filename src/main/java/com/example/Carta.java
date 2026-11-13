package com.example;

public class Carta {
    private int numero;
    private Naipe naipe;

    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public String imagePath() {
        String nomeCarta = "";
        switch (numero) {
            case 1:  nomeCarta = "Ace"; break;
            case 11: nomeCarta = "Jack"; break;
            case 12: nomeCarta = "Queen"; break;
            case 13: nomeCarta = "King"; break;
            default: nomeCarta = String.valueOf(numero); break;
        }
        return "classic-cards/" + nomeCarta + this.naipe + ".png";
    }

    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }
}