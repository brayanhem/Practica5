package JuegoCartas;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartaTest {

    public void pruebaValoresEspeciales() {
        // Probamos que el 1 se convierta en AS
        Carta cartaAs = new Carta(1, Carta.Figura.CORAZONES);
        assertEquals("[AS de CORAZONES]", cartaAs.toString());

        // Probamos que el 11 se convierta en JOTA
        Carta cartaJota = new Carta(11, Carta.Figura.TREBOLES);
        assertEquals("[JOTA de TREBOLES]", cartaJota.toString());

        // Probamos un valor normal
        Carta cartaNormal = new Carta(5, Carta.Figura.ESPADAS);
        assertEquals("[5 de ESPADAS]", cartaNormal.toString());
    }
}