package exilio.Enemigos;

import exilio.Personaje;

public class Escorpiones extends Enemigo {
    private double velocidadMovimiento = 1.3;

    public Escorpiones(double posX, double posY) {
        super(posX, posY, 50, 15, 1.3);
    }

    @Override
    public void atacar(Personaje p) {
        this.dispararAgujas();
        p.recibirDanio(this.danio);
    }

    public void dispararAgujas() {
        System.out.println("El Escorpión dispara agujas!");
    }
}
