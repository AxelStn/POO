package exilio.Habilidades;

import exilio.Personaje;

public class RegeneracionVida extends Habilidad {
    private int curacion;

    public RegeneracionVida() {
        this.nombre = "Segundo Aliento";
        this.descripcion = "Recupera una porción de vida instantáneamente.";
        this.curacion = 25;
    }

    public void aplicarEfecto(Personaje p, Espada e) {
        int vidaActual = p.getVida();
        p.setVida(vidaActual + this.curacion);
    }
}
