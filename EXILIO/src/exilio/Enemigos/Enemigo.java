package exilio.Enemigos;

import exilio.Personaje;

public class Enemigo {
    private double posY;
    private double posX;
    private int vida;
    private int danio;
    private double velicidad;

    public Enemigo() {
    }

    public void moverse(int targetX, int targetY) {
    }

    public void atacar(Personaje p) {
    }

    public void recibirDanio(int danio) {
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public int getDanio() {
        return this.danio;
    }
}
