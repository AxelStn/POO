package exilio.Habilidades;

import exilio.Personaje;

public class FiloExtendido extends Habilidad {
    private double radioExtendido;

    public FiloExtendido() {
        this.nombre = "Filo Extendido";
        this.descripcion = "Aumenta el radio de alcance de la espada";
        this.radioExtendido = (double)15.0F;
    }

    public void aplicarEfecto(Personaje p, Espada e) {
        double radioActual = e.getRadioOrbita();
        e.setRadioOrbita(radioActual + this.radioExtendido);
    }
}
