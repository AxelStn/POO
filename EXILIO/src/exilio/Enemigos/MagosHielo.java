package exilio.Enemigos;

import exilio.Modelo.Personaje;

public class MagosHielo extends Enemigo {
    private int radioCongelamiento;
    private int duracionRelentizacion;

    public MagosHielo(double posX, double posY) {
        super(posX, posY, 60, 15, 0.8);
    }

    @Override
    public void atacar(Personaje p) {
        this.lanzarBolasHielos();
        this.aplicarRelentizacion();
        p.recibirDanio(this.danio);
    }

    public void lanzarBolasHielos() {
        System.out.println("El Mago de Hielo lanza una bola de hielo!");
    }

    public void aplicarRelentizacion() {
        System.out.println("El ataque de hielo ralentiza al personaje!");
    }
}
