package JuegoCartas;

import java.util.ArrayList;

public class Jugador {
    public String nombre;
    private ArrayList<Carta> mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
    }

    public void asignarCartas(ArrayList<Carta> nuevasCartas) {
        for (int i = 0; i < nuevasCartas.size(); i++) {
            mano.add(nuevasCartas.get(i));
        }
    }

    public ArrayList<Carta> deshacerseDeCartas(int cantidad) {
        ArrayList<Carta> cartasDevueltas = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            if (mano.size() > 0) {
                cartasDevueltas.add(mano.remove(0));
            }
        }
        return cartasDevueltas;
    }

    public String obtenerInformacion() {
        String info = nombre + " tiene: \n";
        for (int i = 0; i < mano.size(); i++) {
            info = info + "-" + mano.get(i).toString()+"\n";
        }
        return info;
    }
}