package CasinoALS;
import java.util.Scanner;

public class Juego {
    //Main para ejecutar el programa
    public static void main(String[] args) {
        //Objeto para que el usuario introduzca el dato
        Scanner scanner = new Scanner(System.in);
        //Aqui estaran las barajas de cartas del juego
        Mazo mazo = new Mazo();
        //En esta línea barajamos el mazo para que no haya ningún problema
        mazo.barajar();
        //Aquí creamos el objeto mano para representar al jugador en el juego
        Mano manoJugador = new Mano();

        while (true) {
            System.out.println("¿Quieres jugar una carta? (s/n)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                try {
                    manoJugador.pedirCarta(mazo);
                } catch (IllegalStateException e) {
                    System.out.println("No hay más cartas en el mazo");
                    break;
                }
                System.out.println("Mano del jugador: ");
                System.out.println(manoJugador);
                if (manoJugador.finDeJuego()) {
                    System.out.println("¡Te has pasado de 21! Has perdido.");
                    break;
                }
            } else if (respuesta.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Respuesta no válida. Introduce 's' para sí y 'n' para no.");
            }
        }
        System.out.println("Tu mano inicial:");
        System.out.println(manoJugador);

        //Cuando el mazo del jugador sea superior a 21 mostrara un mensaje
        if (manoJugador.finDeJuego()) {
            System.out.println("Te has pasado de 21. Has perdido.");
            //la puntuacion del jugador se mostrara aqui
        } else {
            System.out.println("Te plantaste con una puntuación de: "
                    + manoJugador.valorMano());
        }
        //El resultado se mostrara aqui
        Resultados.Resultado resultadoJugador = new Resultados.Resultado();
        Resultados resultados = new Resultados();
        resultados.agregarResultado(resultadoJugador);
        //Aquí vamos a guardar los resultados en un archivo XML
        resultados.guardarResultadosXML();
        //Nota: la parte de XML no se ha podido producir
    }
}
