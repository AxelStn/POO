package exilio.Habilidades;

import exilio.Espada;
import exilio.Habilidad;
import exilio.Personaje;

public class FiloExtendido extends Habilidad {
    private double radioExtendido;

    public FiloExtendido() {
        super("Filo Extendido", "Aumenta el radio de alcance de la espada");
        this.radioExtendido = 15.0;
    }

    @Override
    public void aplicarEfecto(Personaje p, Espada e) {
        double radioActual = e.getRadioOrbita();
        e.setRadioOrbita(radioActual + this.radioExtendido);
    }
}
