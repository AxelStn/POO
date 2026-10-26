package exilio.Enemigos;

import exilio.Personaje;

public class Enemigo {
    protected double posY;
    protected double posX;
    protected int vida;
    protected int danio;
    protected double velocidad;

    public Enemigo(double posX, double posY, int vida, int danio, double velocidad) {
        this.posX = posX;
        this.posY = posY;
        this.vida = vida;
        this.danio = danio;
        this.velocidad = velocidad;
    }

    public void moverse(double targetX, double targetY) {
        if (this.posX < targetX) {
            this.posX += this.velocidad;
        } else if (this.posX > targetX) {
            this.posX -= this.velocidad;
        }
        if (this.posY < targetY) {
            this.posY += this.velocidad;
        } else if (this.posY > targetY) {
            this.posY -= this.velocidad;
        }
    }

    public void atacar(Personaje p) {
    }

    public void recibirDanio(int danio) {
        this.vida -= danio;
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public int getDanio() {
        return this.danio;
    }
}
