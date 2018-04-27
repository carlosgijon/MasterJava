import java.io.*;

public class Ejemplo {
    public static void main(String[] args) throws IOException{
        String numero;
        BufferedReader leer_teclado = new BufferedReader(new InputStreamReader(System.in));
        int num;

        System.out.println("Introduzca un número:");
        numero = leer_teclado.readLine();
        num = Integer.parseInt(numero);

        if(num % 2 == 0) {
            System.out.println("El numero " + num + " es par");
        }
        else {
            System.out.println("El numero " + num + " es impar");
        }
    }
}
