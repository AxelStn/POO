package exilio;

public class Juego {
    private String estadoActual = "Inicio";
    private int hordaActual = 1;
    private int puntaje = 0;

    public Juego() {
    }

    public void iniciarJuego() {
        System.out.println("El juego a iniciado");
        this.estadoActual = "Jugando";
    }

    public void actualizarLogica() {
    }

    public void verificarColisiones() {
    }

    public void pasarSiguienteHorda() {
        System.out.println("Felicidades!!! pasaste la orda" + this.hordaActual);
        this.hordaActual = 1;
    }

    public void terminarJuego() {
        System.out.println("Partida terminada. Puntaje final: " + this.puntaje);
        this.estadoActual = "GAMEOVER";
    }
}