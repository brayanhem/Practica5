package JuegoCartas;

public class Main {
    public static void main(String[] args) {
        Carta carta1 = new Carta(1, Carta.Figura.CORAZONES);
        Visualizador.carta(carta1, new Posicion(20, 20));

        Carta carta2 = new Carta(13, Carta.Figura.ESPADAS);
        Visualizador.carta(carta2, new Posicion(110, 20));

        Carta carta3 = new Carta(11, Carta.Figura.TREBOLES);
        Visualizador.carta(carta3, new Posicion(20, 150));

        Carta carta4 = new Carta(12, Carta.Figura.DIAMANTES);
        Visualizador.carta(carta4, new Posicion(110, 150));

        Carta carta5 = new Carta(5, Carta.Figura.TREBOLES);
        Visualizador.carta(carta5, new Posicion(200, 20));
    }
}
