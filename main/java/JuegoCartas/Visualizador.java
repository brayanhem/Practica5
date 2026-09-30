package JuegoCartas;

public class Visualizador {

    public static void carta(Posicion p, Carta c){
        Square marco = new Square();
        marco.changeSize(100);
        marco.changeColor("Black");
        marco.moveHorizontal(p.getX());
        marco.moveVertical(p.getY());
        marco.makeVisible();

        Square fondo = new Square();
        fondo.changeSize(90);
        fondo.changeColor("White");
        fondo.moveHorizontal(p.getX()+5);
        fondo.moveVertical(p.getY()+5);
        fondo.makeVisible();

        Circle centro = new Circle();
        centro.changeSize(30);

        String representacion=c.toString().toLowerCase();
        if(representacion.contains("corazon")||representacion.contains("diamantes")||representacion.contains("rojo")){
        centro.changeColor("red");
        }else{
        centro.changeColor("black");
        }

        centro.moveHorizontal(p.getX()+35);
        centro.moveVertical(p.getY()+35);
        centro.makeVisible();
    }
}
