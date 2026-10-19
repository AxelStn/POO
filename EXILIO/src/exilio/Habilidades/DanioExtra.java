package exilio.Habilidades;

import exilio.Personaje;

public class DanioExtra extends Habilidad {
    private double aumentoDanio;

    public DanioExtra() {
        this.nombre = "Gran Espada";
        this.descripcion = "Aumenta el daño a los enemigos";
        this.aumentoDanio = (double)1.5F;
    }

    public void aplicarEfecto(Personaje p, Espada e) {
        double danioActual = e.getDanio();
        e.setDanio(danioActual + this.aumentoDanio);
    }
}
