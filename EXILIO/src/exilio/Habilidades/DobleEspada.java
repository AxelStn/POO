package exilio.Habilidades;

import exilio.Espada;
import exilio.Habilidad;
import exilio.Personaje;

public class DobleEspada extends Habilidad {

    public DobleEspada() {
        super("Doble Filo", "Agrega una segunda espada orbital para duplicar los ataques.");
    }

    @Override
    public void aplicarEfecto(Personaje p, Espada e) {
        e.setCantidadEspadas(2);
    }
}
