package CasinoALS;
public class Carta {

    // Enumeración para los palos de la baraja
    public enum Palo {
        CORAZONES, DIAMANTES, PICAS, TREBOL
    }

    // Atributos de la carta
    private Palo palo; // Palo de la carta
    private int valor; // Valor de la carta (1-13)

    // Constructor de la carta
    public Carta(Palo palo, int valor) {
        this.palo = palo;
        this.valor = valor;
    }

    // Obtiene el valor de la carta
    // Si el valor es 1, devuelve 11.
    // Si el valor está entre 11 y 13, devuelve 10.
    // En caso contrario, devuelve el valor original.
    public int getValor() {
        if (valor == 1) {
            return 11;
        } else if (valor >= 11 && valor <= 13) {
            return 10;
        } else {
            return valor;
        }
    }

    // Devolver la lectura del valor de la carta
    // Si el valor es 1, devuelve "AS".
    // Si el valor está entre 11 y 13, devuelve "J", "Q" o "K" según corresponda.
    // En caso contrario, devuelve el valor original como una cadena.
    public String mostrarNumero() {
        if (valor == 1) {
            return "AS";
        } else if (valor >= 11 && valor <= 13) {
            switch (valor) {
                case 11:
                    return "J";
                case 12:
                    return "Q";
                case 13:
                    return "K";
                default:
                    return "";
            }
        } else {
            return String.valueOf(valor);
        }
    }

    // Obtiene una representación textual de la carta
    // La representación tiene el formato "[valor – palo]"
    @Override
    public String toString() {
        return "[" + mostrarNumero() + " – " + palo + "]";
    }
}
