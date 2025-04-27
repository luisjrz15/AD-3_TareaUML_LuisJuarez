package es.empresa.torneo.modelo;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
	
    private String nombre;
    private List<Jugador> listaJugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.listaJugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void agregarJugador(Jugador jugador) {
        listaJugadores.add(jugador);
    }
}
