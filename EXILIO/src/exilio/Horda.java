package exilio;

import exilio.Enemigos.Enemigo;

import java.util.List;

public class Horda {
    private int numHorda;
    private String bioma;
    private boolean completado;
    private List<Enemigo> enemigos;

    public Horda() {
    }

    public void generarEnemigos() {
    }

    public void eliminarEnemigo(Enemigo e) {
    }

    public boolean estaCompleto() {
        return this.completado;
    }

    public int getNumHorda() {
        return this.numHorda;
    }
}
