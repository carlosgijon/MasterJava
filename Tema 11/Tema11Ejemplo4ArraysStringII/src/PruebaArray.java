import java.io.*;

public class PruebaArray {
    static char[] caracteres = new char[255];

    public static String seleccionar_letra(int posicion) {
        String letra = String.valueOf(caracteres[posicion]);
        return letra;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader leer_datos_teclado = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 0;
        int posicion = 0;
        String dato_teclado;

        for(int i = 0; i < caracteres.length; i++) {
            caracteres[i] = (char)i;
        }

        System.out.println("Elementos almacenados...");

        do {
            System.out.println("1.- Mostrar todos los caracteres");
            System.out.println("2.- Seleccionar una posición ASCII");
            System.out.println("3.- Salir");
            System.out.println("Seleccione una opcion:");

            dato_teclado = leer_datos_teclado.readLine();
            opcion = Integer.parseInt(dato_teclado);

            switch(opcion) {
                case 1:
                    System.out.println(caracteres);
                    break;
                case 2:
                    System.out.println("Introduzca una posición");
                    dato_teclado = leer_datos_teclado.readLine();
                    posicion = Integer.parseInt(dato_teclado);
                    String letra = seleccionar_letra(posicion);
                    System.out.println("La letra ASCII de " +posicion+ " es " +letra);
            }

        }while(opcion != 3);
        System.out.println("Fin del programa");
    }
}
