package exilio;

import exilio.Habilidades.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestorHabilidades {
    private List<Habilidad> habilidadesDisponibles = new ArrayList<>();

    public GestorHabilidades() {
        this.habilidadesDisponibles.add(new FiloExtendido());
        this.habilidadesDisponibles.add(new DanioExtra());
        this.habilidadesDisponibles.add(new DobleEspada());
        this.habilidadesDisponibles.add(new EscudoTemporal());
        this.habilidadesDisponibles.add(new RegeneracionVida());
        this.habilidadesDisponibles.add(new Vampirismo());
        this.habilidadesDisponibles.add(new VelocidadGiro());
        this.habilidadesDisponibles.add(new VelocidadMovimiento());
    }

    public List<Habilidad> generarOpcionesAleatorias() {
        Collections.shuffle(this.habilidadesDisponibles);
        List<Habilidad> opcionesSeleccionadas = new ArrayList<>();
        int cantidad = Math.min(2, this.habilidadesDisponibles.size());

        for(int i = 0; i < cantidad; ++i) {
            opcionesSeleccionadas.add((Habilidad)this.habilidadesDisponibles.get(i));
        }

        this.habilidadesDisponibles.removeAll(opcionesSeleccionadas);

        return opcionesSeleccionadas;
    }

    public void aplicarSeleccion(Habilidad h, Personaje p, Espada e) {
        h.aplicarEfecto(p, e);
        this.habilidadesDisponibles.remove(h);
    }
}
