package exilio.Enemigos;

import exilio.Personaje;

public class JefeFinal extends Enemigo {
    private int faseActual = 1;
    private int barraVidaEspecial;

    public JefeFinal(double posX, double posY) {
    }

    public void atacar(Personaje p) {
        this.lanzarEnergiaOscura();
    }

    public void lanzarEnergiaOscura() {
    }

    public void cambiarFase(int nuevaFase) {
        this.faseActual = nuevaFase;
    }
}
