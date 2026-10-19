package exilio.Habilidades;

import exilio.Espada;
import exilio.Habilidad;
import exilio.Personaje;

public class VelocidadGiro extends Habilidad {
    private double incrementoVelocidad;

    public VelocidadGiro() {
        super("Incremento de Velocidad", "Incrementa la velocidad de giro de la espada");
        this.incrementoVelocidad = 2.0;
    }

    @Override
    public void aplicarEfecto(Personaje p, Espada e) {
        double velocidadActual = e.getVelocidadGiro();
        e.setVelocidadGiro(velocidadActual + this.incrementoVelocidad);
    }
}
