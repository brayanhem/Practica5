package JuegoCartas;

import java.util.Scanner;
import java.util.ArrayList;

public class Juego {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Mazo miMazo = new Mazo();
        ArrayList<Jugador> jugadores = new ArrayList<>();

        System.out.println("JUEGO DE CARTAS");
        System.out.println("El mazo ha sido creado con " + miMazo.obtenerCartasRestantes() + " cartas.");

        System.out.println("Barajando el mazo...");
        miMazo.barajar();
        System.out.println("Mazo listo\n");

        System.out.print("¿Cuantos jugadores van a participar?: ");
        int numJugadores = teclado.nextInt();
        teclado.nextLine(); // Limpiar el buffer del teclado

        for (int i = 1; i <= numJugadores; i++) {
            System.out.print("Ingresa el nombre del jugador " + i + ": ");
            String nombre = teclado.nextLine();
            jugadores.add(new Jugador(nombre));
        }

        System.out.print("\n¿Cuantas cartas quieres repartir a cada jugador?: ");
            int cartasPorJugador = teclado.nextInt();

        System.out.println("\nRepartiendo cartas...");

        for (int i = 0; i < jugadores.size(); i++) {
            jugadores.get(i).asignarCartas(miMazo.repartir(cartasPorJugador));
        }

        System.out.println("\nESTADO DE LOS JUGADORES");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println(jugadores.get(i).obtenerInformacion());
        }

            // Desplegar el estado del mazo[cite: 1]
            System.out.println("\nESTADO DEL MAZO");
            System.out.println("Cartas restantes en el mazo: " + miMazo.obtenerCartasRestantes());
            System.out.println("Primeras 3 cartas actuales del mazo:");
            miMazo.mostrarPrimerasCartas(3);

            // Gestionar la pila de cartas no repartidas (regresar cartas)[cite: 1]
        if (jugadores.size() > 0) {
            System.out.println("\nEl primer jugador devuelva 2 cartas al mazo.");
            ArrayList<Carta> cartasDevueltas = jugadores.get(0).deshacerseDeCartas(2);

            miMazo.regresarCartas(cartasDevueltas);
            System.out.println("Estado de " + jugadores.get(0).nombre + " despues de devolver:");
            System.out.println(jugadores.get(0).obtenerInformacion());

            System.out.println("\nCartas en el mazo tras recibir las devueltas: " + miMazo.obtenerCartasRestantes());
        }

            System.out.println("\nFIN DE LA PRUEBA");
            teclado.close();
    }
}
