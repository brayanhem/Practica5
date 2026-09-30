package JuegoCartas;

public class Main {
    public static void main(String[] args) {

        Carta carta1=new Carta (1, Carta.Figura.CORAZONES);

        Square square = new Square();
        square.changeColor("blue");
        square.makeVisible();
        Circle circle = new Circle();
        circle.changeColor("red");
        circle.makeVisible();
        Person person = new Person();
        person.changeColor("green");
        person.makeVisible();

        Visualizador.carta(new Posicion(20,40), carta1);
    }
}
