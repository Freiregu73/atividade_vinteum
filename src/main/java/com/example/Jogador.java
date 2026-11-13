package com.example;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private int pontos = 0;
    private List<Carta> cartas = new ArrayList<>();
    private boolean parou = false;

    public void receberCarta(Carta carta) {
        if (carta != null) {
            cartas.add(carta);
            int valor = carta.getNumero();
            if (valor > 10) {
                valor = 10; // J, Q, K valem 10
            } else if (valor == 1) {
                valor = 11; // Ás vale 11 inicialmente
            }
            pontos += valor;
        }
    }

    public void parar() {
        this.parou = true;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public int getPontos() {
        return pontos;
    }

    public boolean parou() {
        return parou;
    }
}