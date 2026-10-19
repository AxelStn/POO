package exilio.Habilidades;

import exilio.Espada;
import exilio.Habilidad;
import exilio.Personaje;

public class VelocidadMovimiento extends Habilidad {
    private double aumentoVelocidad;

    public VelocidadMovimiento() {
        super("Botas Ligeras", "Aumenta la velocidad de movimiento del personaje.");
        this.aumentoVelocidad = 0.8;
    }
    @Override
    public void aplicarEfecto(Personaje p, Espada e) {
        double velActual = p.getVelocidad();
        p.setVelocidad(velActual + this.aumentoVelocidad);
    }
}
