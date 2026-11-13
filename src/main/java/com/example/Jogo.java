package com.example;

public class Jogo {
    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Computador computador = new Computador();

    public Jogo() {
        monte.embaralhar();
    }

    public Carta distribuiCartaParaJogador(Jogador jogadorParam) {
        if (jogadorParam.parou()) {
            return null;
        }

        Carta cartaVirada = monte.virar();
        if (cartaVirada != null) {
            jogadorParam.receberCarta(cartaVirada);
        }
        return cartaVirada;
    }

    public boolean acabou() {
        boolean ambosPararam = jogador.parou() && computador.parou();
        boolean alguemEstourou = jogador.getPontos() > 21 || computador.getPontos() > 21;
        return ambosPararam || alguemEstourou;
    }

    public String resultado() {
        int ptsJog = jogador.getPontos();
        int ptsComp = computador.getPontos();

        if (ptsJog > 21 && ptsComp <= 21) return "Você perdeu!";
        if (ptsComp > 21 && ptsJog <= 21) return "Você ganhou!";
        if (ptsJog > 21 && ptsComp > 21) return "Empate!";

        if (ptsJog > ptsComp) return "Você ganhou!";
        if (ptsComp > ptsJog) return "Você perdeu!";

        return "Empate!";
    }

    public Computador getComputador() {
        return computador;
    }

    public Jogador getJogador() {
        return jogador;
    }
}