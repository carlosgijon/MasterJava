import java.io.*;

class ClaseMatematicas {
    public int multiplicar(int numero) {
        int resultado;
        resultado = numero * 2;
        return resultado;
    }

    public int multiplicar(int numero, int multiplicador) {
        int resultado;
        resultado = numero * multiplicador;
        return resultado;
    }
}

public class PruebaMetodos {
    public static void main(String[] args) throws IOException{
        BufferedReader entrada_teclado = new BufferedReader(new InputStreamReader(System.in));
        ClaseMatematicas c = new ClaseMatematicas();
        int num, resultado;

        System.out.println("Introduzca un numero para operar con el:");
        num = Integer.parseInt(entrada_teclado.readLine());
        System.out.println("El numero enviado es " + num);

        resultado = c.multiplicar(num);
        System.out.println("El resultado de multiplicar con un parametro: " + resultado);

        System.out.println("introduzca otro numero para multiplicar " + num + " por el:");
        resultado = c.multiplicar(num, (num = Integer.parseInt(entrada_teclado.readLine())));
        System.out.println("El resultado de multiplicar con varios parametros es: " + resultado);
    }
}
