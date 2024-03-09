package CasinoALS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {

    // Lista para almacenar las cartas del mazo
    public List<Carta> cartas;

    public Mazo() {
        cartas = new ArrayList<>();

        // Recorre todos los palos de la baraja (enumeración Carta.Palo)
        for (Carta.Palo p : Carta.Palo.values()) {
            // Recorre todos los valores posibles de una carta (1-13)
            for (int i = 1; i <= 13; i++) {
                // Crea una nueva carta con el palo y valor actuales
                cartas.add(new Carta(p, i));
            }
        }

    }
    // Inicializa el mazo como ordenado
    public void barajar() {
        // Mezcla aleatoriamente las cartas del mazo utilizando Collections.shuffle
        Collections.shuffle(cartas);
    }

    public Carta solicitarCarta() {
        // Obtiene y elimina la primera carta del mazo (la de arriba)
        return cartas.remove(0);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        // Recorre todas las cartas del mazo
        for (Carta carta : cartas) {
            // Agrega la representación textual de cada carta a una cadena con saltos de línea
            result.append(carta).append("\n");
        }

        // Convierte el StringBuilder a String y lo retorna
        return result.toString();
    }
}
