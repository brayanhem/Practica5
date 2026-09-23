package JuegoCartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
    private ArrayList<Carta> cartas;

    public Mazo() {
        cartas = new ArrayList<>();
        inicializar();
    }

    public void inicializar() {
        cartas.clear();
        for (Carta.Figura figura : Carta.Figura.values()) {
            for (int i = 1; i <= 13; i++) {
                cartas.add(new Carta(i, figura));
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public ArrayList<Carta> repartir(int numCartas) {
        ArrayList<Carta> cartasRepartidas = new ArrayList<>();
        for (int i = 0; i < numCartas; i++) {
            if (!cartas.isEmpty()) {
                cartasRepartidas.add(cartas.remove(0)); // Quita la carta de arriba
            }
        }
        return cartasRepartidas;
    }

    public void regresarCartas(ArrayList<Carta> cartasDevueltas) {
        cartas.addAll(cartasDevueltas);
    }

    public int obtenerCartasRestantes() {
        return cartas.size();
    }

    public void mostrarPrimerasCartas(int cantidad) {
        int limite = Math.min(cantidad, cartas.size());
        for (int i = 0; i < limite; i++) {
            System.out.print(cartas.get(i).toString() + " ");
        }
        System.out.println();
    }
}
