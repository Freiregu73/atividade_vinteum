package com.example;

public class Computador extends Jogador {

    @Override
    public boolean parou() {
        if (this.getPontos() > 16) {
            return true;
        }
        return super.parou();
    }
}