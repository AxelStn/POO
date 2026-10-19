package exilio.Enemigos;

import exilio.Personaje;

public class Arqueras extends Enemigo {
    private int rangoAtaque = 50;

    public Arqueras(double posX, double posY) {
    }

    public void atacar(Personaje p) {
        this.lanzaFlechas();
    }

    public void lanzaFlechas() {
    }
}
