package exilio.Modelo;
import exilio.Enemigos.Enemigo;

public class Espada {
    private double danio;
    private double radioOrbita;
    private double anguloRotacion;
    private double velocidadGiro;
    private int cantidadEspada;

    public Espada() {
        this.danio = 20.0;
        this.radioOrbita = 30.0;
        this.anguloRotacion= 0.0;
        this.velocidadGiro=2.0;
        this.cantidadEspada = 1;
    }

    public void girar() {
        this.anguloRotacion += this.velocidadGiro;
        if (this.anguloRotacion > 360){
            this.anguloRotacion = 0.0;
        }
    }

    public void actualizarPosicion(double centrox, double centroy) {
        this.girar();
    }

    public void impactar(Enemigo e) {
        e.recibirDanio((int) this.danio);
    }

    public void setDanio(double danio) {
        this.danio = danio;
    }

    public double getDanio() {
        return this.danio;
    }

    public void setRadioOrbita(double radio) {
        this.radioOrbita = radio;
    }

    public double getRadioOrbita() {
        return this.radioOrbita;
    }

    public void setVelocidadGiro(double velocidad) {
        this.velocidadGiro = velocidad;
    }

    public double getVelocidadGiro() {
        return this.velocidadGiro;
    }

    public void setCantidadEspadas(int cantidad) {
        this.cantidadEspada = cantidad;
    }

    public int getCantidadEspadas() {
        return this.cantidadEspada;
    }
}
