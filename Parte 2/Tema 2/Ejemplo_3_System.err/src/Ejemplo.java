import java.io.*;

public class Ejemplo {
    public static void main(String[] args) throws IOException {
        int numero;
        BufferedReader leer_teclado = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduzca un número:");
        numero = Integer.parseInt(leer_teclado.readLine());

        if(numero % 2 == 0) {
            System.out.println("El numero " +numero+ " es par");
        }
        else {
            System.out.println("El numero " +numero+ " es impar");
            System.err.println("Dato impar, no se puede realizar la operacion");
        }
    }
}
