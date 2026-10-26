package exilio.Enemigos;

import exilio.Personaje;

public class JefeFinal extends Enemigo {
    private int faseActual = 1;
    private int barraVidaEspecial;

    public JefeFinal(double posX, double posY) {
        super(posX, posY, 300, 35, 1.2);
    }

    @Override
    public void atacar(Personaje p) {
        if (this.vida <= 150 && this.faseActual == 1) {
            this.cambiarFase(2);
            this.danio += 10;
            System.out.println("¡El Jefe Final entró en la Fase 2 y aumentó su daño!");
        }
        this.lanzarEnergiaOscura();
        p.recibirDanio(this.danio);
    }

    public void lanzarEnergiaOscura() {
        System.out.println("El Jefe Final ataca con energía oscura!");
    }

    public void cambiarFase(int nuevaFase) {
        this.faseActual = nuevaFase;
    }
}
