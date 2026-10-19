package exilio.Habilidades;

import exilio.Personaje;

public class VelocidadMovimiento extends Habilidad {
    private double aumentoVelocidad;

    public VelocidadMovimiento() {
        this.nombre = "Botas Ligeras";
        this.descripcion = "Aumenta la velocidad de movimiento del personaje.";
        this.aumentoVelocidad = 0.8;
    }

    public void aplicarEfecto(Personaje p, Espada e) {
        double velActual = p.getVelocidad();
        p.setVelocidad(velActual + this.aumentoVelocidad);
    }
}
