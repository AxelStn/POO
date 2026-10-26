package exilio.Habilidades;

import exilio.Modelo.Espada;
import exilio.Modelo.Personaje;

public class EscudoTemporal extends Habilidad {
    private double aumentoDefensa;

    public EscudoTemporal() {
        super("Armadura de Placas", "Reduce el daño recibido por los enemigos.");
        this.aumentoDefensa = 50;
    }

    @Override
    public void aplicarEfecto(Personaje p, Espada e) {
        double defensaActual = p.getDefensa();
        p.setDefensa(defensaActual + this.aumentoDefensa);
    }
}
