import java.util.*;

public class Enumerados {
    static public enum posicion {
        PORTERO,
        DEFENSA,
        CENTROCAMPISTA,
        DELANTERO
    }

    public static void main(String[] params) {
        posicion[] arrayJugadores = new posicion[4];

        arrayJugadores[0] = posicion.DEFENSA;
        arrayJugadores[1] = posicion.CENTROCAMPISTA;
        arrayJugadores[2] = posicion.DELANTERO;
        arrayJugadores[3] = posicion.PORTERO;

        int count = 0;

        for (posicion jugador : arrayJugadores) {

            System.out.println("El jugador que ocupa la posicion " + count + " es " + jugador);
            count++;
        }

    }
}
