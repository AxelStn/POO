package exilio;

public class Espada {
    private double danio;
    private double radioOrbita;
    private double anguloRotacion;
    private double velocidadGiro;
    private int cantidadEspada;

    public Espada() {
    }

    public void girar() {
    }

    public void actualizarPosicion(double centrox, double centroy) {
    }

    public void impactar() {
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
