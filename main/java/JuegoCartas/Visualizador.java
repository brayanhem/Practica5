package JuegoCartas;

public class Visualizador {

    public static void carta(Carta c, Posicion p) {
        int posX = p.getX();
        int posY = p.getY();

        dibujarBaseCarta(posX, posY);

        Carta.Figura tipo = c.getTipo();
        int centroX = posX + 40;
        int centroY = posY + 60;

        if (tipo == Carta.Figura.CORAZONES) {
            dibujarCorazon(centroX, centroY);
        }
        else if (tipo == Carta.Figura.DIAMANTES) {
            dibujarDiamante(centroX, centroY);
        }
        else if (tipo == Carta.Figura.ESPADAS) {
            dibujarEspada(centroX, centroY);
        }
        else if (tipo == Carta.Figura.TREBOLES) {
            dibujarTrebol(centroX, centroY);
        }

        String textoValor = obtenerTextoValor(c.getValor());
        String colorTexto = (tipo == Carta.Figura.CORAZONES || tipo == Carta.Figura.DIAMANTES) ? "red" : "black";

        Canvas.getCanvas().drawText(textoValor, posX + 12, posY + 25, colorTexto);
    }

    private static String obtenerTextoValor(int valor) {
        switch (valor) {
            case 1: return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            default: return String.valueOf(valor);
        }
    }

    private static void dibujarBaseCarta(int posX, int posY) {
        Square marcoSup = new Square();
        marcoSup.changeSize(80);
        marcoSup.changeColor("black");
        marcoSup.setPosition(posX, posY);
        marcoSup.makeVisible();

        Square marcoInf = new Square();
        marcoInf.changeSize(80);
        marcoInf.changeColor("black");
        marcoInf.setPosition(posX, posY + 40);
        marcoInf.makeVisible();

        Square fondoSup = new Square();
        fondoSup.changeSize(76);
        fondoSup.changeColor("white");
        fondoSup.setPosition(posX + 2, posY + 2);
        fondoSup.makeVisible();

        Square fondoInf = new Square();
        fondoInf.changeSize(76);
        fondoInf.changeColor("white");
        fondoInf.setPosition(posX + 2, posY + 42);
        fondoInf.makeVisible();
    }

    private static void dibujarCorazon(int cX, int cY) {
        Circle c1 = new Circle(); c1.changeSize(20); c1.changeColor("red"); c1.setPosition(cX - 18, cY - 16); c1.makeVisible();
        Circle c2 = new Circle(); c2.changeSize(20); c2.changeColor("red"); c2.setPosition(cX - 2, cY - 16); c2.makeVisible();
        Square s1 = new Square(); s1.changeSize(12); s1.changeColor("red"); s1.setPosition(cX - 12, cY - 2); s1.makeVisible();
        Square s2 = new Square(); s2.changeSize(12); s2.changeColor("red"); s2.setPosition(cX - 6, cY - 2); s2.makeVisible();
        Square s3 = new Square(); s3.changeSize(12); s3.changeColor("red"); s3.setPosition(cX, cY - 2); s3.makeVisible();
        Square punta = new Square(); punta.changeSize(12); punta.changeColor("red"); punta.setPosition(cX - 6, cY + 10); punta.makeVisible();
    }

    private static void dibujarDiamante(int cX, int cY) {
        int size = 6;
        Square r1 = new Square(); r1.changeSize(size); r1.changeColor("red"); r1.setPosition(cX - 3, cY - 18); r1.makeVisible();
        Square r21 = new Square(); r21.changeSize(size); r21.changeColor("red"); r21.setPosition(cX - 9, cY - 12); r21.makeVisible();
        Square r22 = new Square(); r22.changeSize(size); r22.changeColor("red"); r22.setPosition(cX - 3, cY - 12); r22.makeVisible();
        Square r23 = new Square(); r23.changeSize(size); r23.changeColor("red"); r23.setPosition(cX + 3, cY - 12); r23.makeVisible();
        Square r31 = new Square(); r31.changeSize(size); r31.changeColor("red"); r31.setPosition(cX - 15, cY - 6); r31.makeVisible();
        Square r32 = new Square(); r32.changeSize(size); r32.changeColor("red"); r32.setPosition(cX - 9, cY - 6); r32.makeVisible();
        Square r33 = new Square(); r33.changeSize(size); r33.changeColor("red"); r33.setPosition(cX - 3, cY - 6); r33.makeVisible();
        Square r34 = new Square(); r34.changeSize(size); r34.changeColor("red"); r34.setPosition(cX + 3, cY - 6); r34.makeVisible();
        Square r35 = new Square(); r35.changeSize(size); r35.changeColor("red"); r35.setPosition(cX + 9, cY - 6); r35.makeVisible();
        Square r41 = new Square(); r41.changeSize(size); r41.changeColor("red"); r41.setPosition(cX - 15, cY); r41.makeVisible();
        Square r42 = new Square(); r42.changeSize(size); r42.changeColor("red"); r42.setPosition(cX - 9, cY); r42.makeVisible();
        Square r43 = new Square(); r43.changeSize(size); r43.changeColor("red"); r43.setPosition(cX - 3, cY); r43.makeVisible();
        Square r44 = new Square(); r44.changeSize(size); r44.changeColor("red"); r44.setPosition(cX + 3, cY); r44.makeVisible();
        Square r45 = new Square(); r45.changeSize(size); r45.changeColor("red"); r45.setPosition(cX + 9, cY); r45.makeVisible();
        Square r51 = new Square(); r51.changeSize(size); r51.changeColor("red"); r51.setPosition(cX - 9, cY + 6); r51.makeVisible();
        Square r52 = new Square(); r52.changeSize(size); r52.changeColor("red"); r52.setPosition(cX - 3, cY + 6); r52.makeVisible();
        Square r53 = new Square(); r53.changeSize(size); r53.changeColor("red"); r53.setPosition(cX + 3, cY + 6); r53.makeVisible();
        Square r6 = new Square(); r6.changeSize(size); r6.changeColor("red"); r6.setPosition(cX - 3, cY + 12); r6.makeVisible();
    }

    private static void dibujarEspada(int cX, int cY) {
        Triangle t = new Triangle(); t.changeSize(26, 26); t.changeColor("black"); t.setPosition(cX, cY - 22); t.makeVisible();
        Circle c1 = new Circle(); c1.changeSize(16); c1.changeColor("black"); c1.setPosition(cX - 15, cY - 2); c1.makeVisible();
        Circle c2 = new Circle(); c2.changeSize(16); c2.changeColor("black"); c2.setPosition(cX - 1, cY - 2); c2.makeVisible();
        Square base = new Square(); base.changeSize(10); base.changeColor("black"); base.setPosition(cX - 5, cY + 10); base.makeVisible();
    }

    private static void dibujarTrebol(int cX, int cY) {
        Circle c1 = new Circle(); c1.changeSize(20); c1.changeColor("black"); c1.setPosition(cX - 10, cY - 22); c1.makeVisible();
        Circle c2 = new Circle(); c2.changeSize(20); c2.changeColor("black"); c2.setPosition(cX - 18, cY - 6); c2.makeVisible();
        Circle c3 = new Circle(); c3.changeSize(20); c3.changeColor("black"); c3.setPosition(cX - 2, cY - 6); c3.makeVisible();
        Square base = new Square(); base.changeSize(10); base.changeColor("black"); base.setPosition(cX - 5, cY + 10); base.makeVisible();
    }
}