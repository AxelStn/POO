package exilio.Modelo;

import exilio.Enemigos.*;
import java.util.ArrayList;
import java.util.List;

public class Horda {
    private int numHorda;
    private String bioma;
    private boolean completado;
    private List<Enemigo> enemigos;

    public Horda(int numHorda) {
        this.numHorda = numHorda;
        this.completado = false;
        this.enemigos = new ArrayList<>();
        this.generarEnemigos();
    }

    public void generarEnemigos() {
        switch (this.numHorda) {
            case 1:
                this.bioma = "Bosque";
                this.enemigos.add(new Arqueras(10, 10));
                this.enemigos.add(new Arqueras(20, 15));
                break;
            case 2:
                this.bioma = "Desierto";
                this.enemigos.add(new Escorpiones(15, 10));
                this.enemigos.add(new Escorpiones(25, 20));
                break;
            case 3:
                this.bioma = "Nieve";
                this.enemigos.add(new MagosHielo(15, 15));
                this.enemigos.add(new MagosHielo(30, 20));
                break;
            case 4:
                this.bioma = "Volcán";
                this.enemigos.add(new SlimeFuego(20, 20));
                this.enemigos.add(new JefeFinal(50, 50));
                break;
            default:
                throw new IllegalArgumentException("El número de horda " + this.numHorda + " no es válido (debe ser entre 1 y 4).");
        }
    }

    public void eliminarEnemigo(Enemigo e) {
        this.enemigos.remove(e);
        if (this.enemigos.isEmpty()) {
            this.completado = true;
        }
    }

    public boolean estaCompleto() {
        return this.completado;
    }

    public int getNumHorda() {
        return this.numHorda;
    }

    public String getBioma() {
        return this.bioma;
    }

    public List<Enemigo> getEnemigos() {
        return this.enemigos;
    }
}
