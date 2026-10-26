package exilio.Habilidades;

import exilio.Modelo.Espada;
import exilio.Modelo.Personaje;

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
