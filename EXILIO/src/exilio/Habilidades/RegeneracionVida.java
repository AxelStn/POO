package exilio.Habilidades;

import exilio.Modelo.Espada;
import exilio.Modelo.Personaje;

public class RegeneracionVida extends Habilidad {
    private int curacion;

    public RegeneracionVida() {
        super("Segundo Aliento", "Recupera una porción de vida instantáneamente.");
        this.curacion = 25;
    }

    @Override
    public void aplicarEfecto(Personaje p, Espada e) {
        p.curar(this.curacion);
    }
}
