package exilio.Habilidades;

import exilio.Personaje;

public class Vampirismo extends Habilidad {
    private int aumentoVidaMaxima;

    public Vampirismo() {
        this.nombre = "Vampirismo";
        this.descripcion = "Absorbe energía oscura para aumentar permanentemente tu vida máxima.";
        this.aumentoVidaMaxima = 30;
    }

    public void aplicarEfecto(Personaje p, Espada e) {
        int vidaMaxActual = p.getVidaMaxima();
        p.setVidaMaxima(vidaMaxActual + this.aumentoVidaMaxima);
        int vidaActual = p.getVida();
        p.setVida(vidaActual + this.aumentoVidaMaxima);
    }
}
