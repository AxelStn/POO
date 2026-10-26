package exilio.Habilidades;

import exilio.Modelo.Espada;
import exilio.Modelo.Personaje;

public class Vampirismo extends Habilidad {
    private int aumentoVidaMaxima;

    public Vampirismo() {
        super("Vampirismo", "Absorbe energía oscura para aumentar permanentemente tu vida máxima.");
        this.aumentoVidaMaxima = 30;
    }

    @Override
    public void aplicarEfecto(Personaje p, Espada e) {
        int vidaMaxActual = p.getVidaMaxima();
        p.setVidaMaxima(vidaMaxActual + this.aumentoVidaMaxima);
        int vidaActual = p.getVida();
        p.setVida(vidaActual + this.aumentoVidaMaxima);
    }
}
