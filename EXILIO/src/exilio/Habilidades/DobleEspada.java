package exilio.Habilidades;

import exilio.Personaje;

public class DobleEspada extends Habilidad {
    public DobleEspada() {
        this.nombre = "Doble Filo";
        this.descripcion = "Agrega una segunda espada orbital para duplicar los ataques.";
    }

    public void aplicarEfecto(Personaje p, Espada e) {
        e.setCantidadEspadas(2);
    }
}
