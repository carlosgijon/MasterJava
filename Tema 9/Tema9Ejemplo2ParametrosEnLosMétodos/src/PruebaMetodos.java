import java.io.*;

class ClaseMatematicas {
    public int multiplicar(int numero) {
        numero = numero * 2;
        return numero;
    }
}

public class PruebaMetodos {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada_teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un numero para saber el doble: ");
        int num = Integer.parseInt(entrada_teclado.readLine());

        final int NUMERO_INTRODUCIDO = num;

        ClaseMatematicas c = new ClaseMatematicas();
        num = c.multiplicar(num);
        System.out.println("El doble de " + NUMERO_INTRODUCIDO + " es " + num);
    }
}
