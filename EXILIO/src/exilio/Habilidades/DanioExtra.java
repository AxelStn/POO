package exilio.Habilidades;

import exilio.Espada;
import exilio.Habilidad;
import exilio.Personaje;

public class DanioExtra extends Habilidad {
    private double aumentoDanio;

    public DanioExtra() {
        super("Gran Espada", "Aumenta el daño a los enemigos");
        this.aumentoDanio = 1.5;
    }
    @Override
    public void aplicarEfecto(Personaje p, Espada e) {
        double danioActual = e.getDanio();
        e.setDanio(danioActual + this.aumentoDanio);
    }
}
