import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coche {
    static boolean estado = false;
    static int velocidad = 0;
    static int VMAXIMA = 120;

    public static void menu() {
        System.out.println("1.- Montar en el coche");
        System.out.println("2.- Comenzar");
        System.out.println("3.- Parar");
        System.out.println("4.- Salir del coche");
        System.out.println("");  // Una linea en blanco
        System.out.println("introduzca una opción");
    }

    public static void montar() {
        if (estado == false) {
            System.out.println("Te has montado en el coche");
            estado = true;
        }
        else {
            System.out.println("Ya estabas montado, no intentes subir otra vez");
        }
        menu();
    }

    public static void comenzar() {
        if (estado == false) {
            System.out.println("Primero debes subir al coche");
        }
        else if (velocidad == VMAXIMA) {
            System.out.println("Vas a la velocidad maxima, no puedes correr mas");
        }
        else {
            ++velocidad;
            System.out.println("Velocidad actual " + velocidad);
        }
        menu();
    }

    public static void parar() {
        if (velocidad == 0) {
            System.out.println("Si estas parado, no hace falta que frenes");
        }
        else {
            System.out.println("El frenado se hace de golpe");
            velocidad = 0;
        }
        menu();
    }

    public static void salirCoche() {
        if (estado == false) {
            System.out.println("¿No te has subido y ya te bajas?");
        }
        else if(velocidad != 0) {
            System.out.println("primero debes frenar");
        }
        else {
            System.out.println("Acabas de bajar del coche");
        }
        menu();
    }

    public static void main(String args[]) throws IOException {

        BufferedReader i = new BufferedReader(new InputStreamReader(System.in));
        String opcion;

        menu();

        do {
            opcion = i.readLine();
            try {
                switch (Integer.parseInt(opcion)) {
                    case 1:
                        montar();
                    break;

                    case 2:
                        comenzar();
                    break;

                    case 3:
                        parar();
                    break;

                    case 4:
                        salirCoche();
                    System.exit(0);  // Con el estado 0 sirve para salir del programa

                    default:
                        System.out.println("No existe la opcion");
                }
            }
            catch(NumberFormatException e) {
                System.out.println("La opcion debe ser un numero");
            }
        }
        while(true);
    }
}
