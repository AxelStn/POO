package exilio.Enemigos;

import exilio.Personaje;

public class Escorpiones extends Enemigo {
    private double velocidadMovimiento = 1.3;

    public Escorpiones(double posX, double posY) {
    }

    public void atacar(Personaje p) {
        this.dispararAgujas();
    }

    public void dispararAgujas() {
    }
}
