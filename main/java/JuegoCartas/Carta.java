package JuegoCartas;

public class Carta {

    public enum Figura{
        CORAZONES,DIAMANTES,TREBOLES,ESPADAS
    }
    private int valor;
    private Figura tipo;

    public Carta(int valor, Figura tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public String toString() {
        String valorLetra;
        switch (valor) {
            case 1: valorLetra = "AS";
            break;
            case 11: valorLetra = "JOTA";
            break;
            case 12: valorLetra = "REINA";
            break;
            case 13: valorLetra = "REY";
            break;
            default: valorLetra = String.valueOf(valor);
        }
        return "[" + valorLetra + " de " + tipo + "]";
    }

    public int getValor() {
        return valor;
    }

    public Figura getTipo() {
        return tipo;
    }
}
