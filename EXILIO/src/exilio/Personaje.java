package exilio;

public class Personaje {
    private double posY;
    private double posX;
    private int vida;
    private int vidaMaxima;
    private double velocidad;
    private double defensa;
    private Espada espada;

    public Personaje() {
        this.vida = 100;
        this.vidaMaxima=100;
        this.velocidad = 1;
        this.defensa = 0;
        this.espada = new Espada();
    }

    public void moverse(double dx, double dy) {
        this.posX += dx * this.velocidad;
        this.posY += dy * this.velocidad;
    }

    public void recibirDanio(int danio) {
        if (this.defensa >= danio) {
            this.defensa -= danio;
        } else {
            int danioRestante = (int) (danio - this.defensa);
            this.defensa = 0;
            this.vida -= danioRestante;
        }
    }

    public void curar(int monto) {
        this.vida += monto;
        if (this.vida > this.vidaMaxima) {
            this.vida = this.vidaMaxima;
        }
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public double getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getDefensa() {
        return this.defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public int getVidaMaxima() {
        return this.vidaMaxima;
    }

    public void setVidaMaxima(int nuevaVidaMaxima) {
        this.vidaMaxima = nuevaVidaMaxima;
    }

    public Espada getEspada() {
        return this.espada;
    }
}
