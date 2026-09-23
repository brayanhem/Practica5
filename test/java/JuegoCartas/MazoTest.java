package JuegoCartas;

import JuegoCartas.Carta;
import JuegoCartas.Mazo;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MazoTest {

    public void pruebaCreacionMazo() {
        Mazo mazo = new Mazo();
        // El mazo debe iniciar con 52 cartas
        assertEquals(52, mazo.obtenerCartasRestantes());
    }

    public void pruebaRepartirYRegresarCartas() {
        Mazo mazo = new Mazo();

        // Repartimos 5 cartas[cite: 1]
        ArrayList<Carta> cartasRepartidas = mazo.repartir(5);

        // Verificamos que se entregaron 5 cartas
        assertEquals(5, cartasRepartidas.size());

        // Verificamos que el mazo ahora tiene 47
        assertEquals(47, mazo.obtenerCartasRestantes());

        // Regresamos las cartas al mazo[cite: 1]
        mazo.regresarCartas(cartasRepartidas);

        // El mazo debe volver a tener 52
        assertEquals(52, mazo.obtenerCartasRestantes());
    }
}