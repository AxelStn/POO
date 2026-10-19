package exilio.Habilidades;

import exilio.Personaje;

public class VelocidadGiro extends Habilidad {
    private double incrementoVelocidad;

    public VelocidadGiro() {
        this.nombre = "Incremento de Velocidad";
        this.descripcion = "Incrementa la velocidad de giro de la espada";
        this.incrementoVelocidad = (double)2.0F;
    }

    public void aplicarEfecto(Personaje p, Espada e) {
        double velocidadActual = e.getVelocidadGiro();
        e.setVelocidadGiro(velocidadActual + this.incrementoVelocidad);
    }
}
