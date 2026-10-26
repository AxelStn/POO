package exilio;

import exilio.Enemigos.Enemigo;
import exilio.Habilidades.GestorHabilidades;
import exilio.Habilidades.Habilidad;
import exilio.Modelo.Horda;
import exilio.Modelo.Personaje;
import java.util.List;
import java.util.Scanner;

public class Juego {
    private String estadoActual = "Inicio";
    private int hordaActual = 1;
    private int puntaje = 0;
    private Personaje personaje;
    private Horda horda;
    private GestorHabilidades gestorHabilidades;
    private Scanner scanner = new Scanner(System.in);

    public Juego() {
        this.personaje = new Personaje();
        this.horda = new Horda(this.hordaActual);
        this.gestorHabilidades = new GestorHabilidades();
    }

    public void iniciarJuego() {
        System.out.println("=== EL JUEGO EXILIO HA INICIADO ===");
        System.out.println("=== TU ESTADO INICIAL ===");
        System.out.println("Vida: " + this.personaje.getVida() + " - Escudo: " + this.personaje.getDefensa());
        this.estadoActual = "Jugando";
        while (this.estadoActual.equals("Jugando")) {
            this.actualizarLogica();
        }
    }

    public void actualizarLogica() {
        this.personaje.getEspada().girar();
        this.verificarColisiones();

        if (!this.personaje.estaVivo()) {
            System.out.println("FIN DEL JUEGO - PERDISTE!");
            this.terminarJuego();
            return;
        }

        if (this.horda.estaCompleto()) {
            if (this.hordaActual < 4) {
                this.pasarSiguienteHorda();
            } else {
                System.out.println("¡VICTORIA! - ¡Has logrado derrotar al jefe final!");
                this.terminarJuego();
            }
        }
    }

    public void verificarColisiones() {
        if (this.horda.getEnemigos().isEmpty()) {
            return;
        }
        Enemigo enemigoActual = this.horda.getEnemigos().get(0);

        int golpes = this.personaje.getEspada().getCantidadEspadas();
        for (int i = 0; i < golpes; i++) {
            this.personaje.getEspada().impactar(enemigoActual);
        }

        if (enemigoActual.estaVivo()) {
            enemigoActual.atacar(this.personaje);
            System.out.println("=== TU ESTADO ACTUAL ===");
            System.out.println("Vida: " + this.personaje.getVida() + " - Escudo: " + this.personaje.getDefensa());
        } else {
            System.out.println("Enemigo derrotado 🥶");
            this.horda.eliminarEnemigo(enemigoActual);
            this.puntaje += 100;
        }
    }

    public void pasarSiguienteHorda() {
        System.out.println("\n¡Felicidades! Pasaste la Horda " + this.hordaActual);

        List<Habilidad> opciones = this.gestorHabilidades.generarOpcionesAleatorias();
        if (!opciones.isEmpty()) {
            System.out.println("Seleccioná una habilidad: ");
            for (int i = 0; i < opciones.size(); i++) {
                System.out.println((i + 1) + ". " + opciones.get(i).getNombre() + " - " + opciones.get(i).getDescripcion());
            }

            Habilidad elegida = null;
            boolean opcionValida = false;
            while (!opcionValida) {
                try {
                    System.out.println("Seleccionar habilidad (1 o 2):");
                    int numero = Integer.parseInt(scanner.nextLine());
                    elegida = opciones.get(numero - 1);
                    opcionValida = true;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Tenés que ingresar un número, no letras.");
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Error: Esa opción no existe. Elegí 1 o 2.");
                } finally {
                    System.out.println("--------------------------");
                }
            }
            this.gestorHabilidades.aplicarSeleccion(elegida, this.personaje, this.personaje.getEspada());

            System.out.println("Activaste: " + elegida.getNombre() + "!\n");

            this.hordaActual++;
            this.horda = new Horda(this.hordaActual);
            System.out.println("=== Entrando a la Horda " + this.hordaActual + " (" + this.horda.getBioma() + ") ===");
        }
    }

    public void terminarJuego() {
        System.out.println("Partida terminada. Puntaje final: " + this.puntaje);
        this.estadoActual = "GAMEOVER";
    }
}