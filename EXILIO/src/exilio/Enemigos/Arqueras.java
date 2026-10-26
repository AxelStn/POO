package exilio.Enemigos;

import exilio.Personaje;

public class Arqueras extends Enemigo {
    private int rangoAtaque = 50;

    public Arqueras(double posX, double posY) {
        super(posX, posY, 40, 10, 1.0);
    }

    @Override
    public void atacar(Personaje p) {
        this.lanzaFlechas();
        p.recibirDanio(this.danio);
    }

    public void lanzaFlechas() {
        System.out.println("La arquera lanza una flecha!");
    }
}
