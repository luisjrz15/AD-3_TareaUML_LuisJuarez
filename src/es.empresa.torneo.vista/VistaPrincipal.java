package es.empresa.torneo.vista;

import es.empresa.torneo.control.GestorEquipos;
import es.empresa.torneo.modelo.Jugador;
import java.util.Scanner;

public class VistaPrincipal {
    private GestorEquipos gestor;
    private Scanner scanner;

    public VistaPrincipal() {
        gestor = new GestorEquipos();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion = 0;
        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Registrar equipo");
            System.out.println("2. Añadir jugador a un equipo");
            System.out.println("3. Mostrar equipos y jugadores");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    registrarEquipo();
                    break;
                case 2:
                    añadirJugador();
                    break;
                case 3:
                    gestor.mostrarEquiposYJugadores();
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }

    private void registrarEquipo() {
        System.out.print("Ingrese nombre del equipo: ");
        String nombre = scanner.nextLine();
        gestor.registrarEquipo(nombre);
    }

    private void añadirJugador() {
        System.out.print("Ingrese nombre del equipo: ");
        String nombreEquipo = scanner.nextLine();
        System.out.print("Ingrese nombre del jugador: ");
        String nombreJugador = scanner.nextLine();
        System.out.print("Ingrese edad del jugador: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        gestor.añadirJugadorAEquipo(nombreEquipo, new Jugador(nombreJugador, edad));
    }
}