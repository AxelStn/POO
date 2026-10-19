package exilio.Habilidades;

import exilio.Personaje;

public class EscudoTemporal extends Habilidad {
    private double aumentoDefensa;

    public EscudoTemporal() {
        this.nombre = "Armadura de Placas";
        this.descripcion = "Reduce el daño recibido por los enemigos.";
        this.aumentoDefensa = (double)5.0F;
    }

    public void aplicarEfecto(Personaje p, Espada e) {
        double defensaActual = p.getDefensa();
        p.setDefensa(defensaActual + this.aumentoDefensa);
    }
}
