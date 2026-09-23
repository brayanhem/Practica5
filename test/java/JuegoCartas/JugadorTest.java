package JuegoCartas;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JugadorTest {

    public void pruebaNombreYAsignarCartas() {
        // Se puede accesar al nombre directamente[cite: 1]
        Jugador jugador = new Jugador("Carlos");
        assertEquals("Carlos", jugador.nombre);

        ArrayList<Carta> cartasNuevas = new ArrayList<>();
        cartasNuevas.add(new Carta(2, Carta.Figura.DIAMANTES));
        cartasNuevas.add(new Carta(13, Carta.Figura.CORAZONES));

        // Asignamos cartas[cite: 1]
        jugador.asignarCartas(cartasNuevas);

        // Comprobamos que su información incluye las cartas dadas
        String info = jugador.obtenerInformacion();
        assertTrue(info.contains("[2 de DIAMANTES]"));
        assertTrue(info.contains("[REY de CORAZONES]"));
    }
}