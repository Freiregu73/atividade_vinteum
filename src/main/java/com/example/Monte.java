package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monte {
    private List<Carta> cartas = new ArrayList<>();

    public Monte() {
        for (int i = 1; i <= 13; i++) {
            cartas.add(new Carta(i, Naipe.Hearts));
            cartas.add(new Carta(i, Naipe.Spades));
            cartas.add(new Carta(i, Naipe.Diamonds));
            cartas.add(new Carta(i, Naipe.Clubs));
        }
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public Carta virar() {
        if (!cartas.isEmpty()) {
            return cartas.remove(0);
        }
        return null;
    }
}