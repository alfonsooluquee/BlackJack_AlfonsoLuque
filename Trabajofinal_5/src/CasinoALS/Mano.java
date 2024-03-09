package CasinoALS;
class Mano extends Mazo {

    // Array para almacenar las cartas de la mano
    private Carta[] cartas = new Carta[0];

    public Mano() {
        super();
    }

    // Calcula el valor total de la mano
    public int valorMano() {
        int valor = 0;

        // Recorre todas las cartas de la mano
        for (Carta carta : cartas) {
            // Suma el valor de cada carta al valor total
            valor += carta.getValor();
        }

        return valor;
    }

    // Comprueba si la mano ha superado 21 puntos
    public boolean finDeJuego() {
        return valorMano() > 21;
    }

    // Obtiene una representación textual de la mano
    @Override
    public String toString() {
        return "Puntuación de la mano: " + valorMano() + "\n" + super.toString();
    }

    // Añade una carta a la mano desde un mazo
    public void pedirCarta(Mazo m) {
        Carta carta = m.solicitarCarta();
        cartas.clone();
    }
    //aqui me hubiese gustado poner .add pero por problemas que desconozco no me deja
}
