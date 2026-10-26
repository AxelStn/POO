package exilio.Enemigos;

import exilio.Personaje;

public class SlimeFuego extends Enemigo {
    private int areaExplosion;

    public SlimeFuego(double posX, double posY) {
        super(posX, posY, 70, 20, 0.9);
    }

    @Override
    public void atacar(Personaje p) {
        this.lanzarBolasFuego();
        p.recibirDanio(this.danio);
    }

    public void lanzarBolasFuego() {
        System.out.println("El Slime de Fuego lanza una bola de fuego!");
    }
}
