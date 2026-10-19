package exilio.Habilidades;

import exilio.Personaje;

public abstract class Habilidad {
    protected String nombre;
    protected String descripcion;

    public Habilidad() {
    }

    public abstract void aplicarEfecto(Personaje var1, Espada var2);

    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
}
