package es.empresa.torneo.control;

import es.empresa.torneo.modelo.Equipo;
import es.empresa.torneo.modelo.Jugador;
import java.util.ArrayList;
import java.util.List;

public class GestorEquipos {
    private List<Equipo> listaEquipos;

    public GestorEquipos() {
        this.listaEquipos = new ArrayList<>();
    }

    public void registrarEquipo(String nombre) {
        listaEquipos.add(new Equipo(nombre));
    }

    public void añadirJugadorAEquipo(String nombreEquipo, Jugador jugador) {
        for (Equipo equipo : listaEquipos) {
            if (equipo.getNombre().equals(nombreEquipo)) {
                equipo.agregarJugador(jugador);
                break;
            }
        }
    }

    public void mostrarEquiposYJugadores() {
        for (Equipo equipo : listaEquipos) {
            System.out.println("Equipo: " + equipo.getNombre());
            for (Jugador jugador : equipo.getListaJugadores()) {
                System.out.println("  Jugador: " + jugador.getNombre() + ", Edad: " + jugador.getEdad());
            }
        }
    }
}