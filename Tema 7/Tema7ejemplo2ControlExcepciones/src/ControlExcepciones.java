import java.io.BufferedReader;
import java.io.*;

class ControlExcepciones {
    public static void main(String[] args) throws IOException{
        int num1, num2, resultado;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Control de Excepciones: division entre 0");
            System.out.println("-------------------------------------------------");
            System.out.println("Introduzca un numero:");
            num1 = Integer.parseInt(entradaTeclado.readLine());
            System.out.println("Introduzca otro numero (0 para ver una excepcion)");
            num2 = Integer.parseInt(entradaTeclado.readLine());

            resultado = num1 / num2;
            System.out.println("El resultado es " + resultado);
        }
        catch(ArithmeticException exc) {
            System.out.println("No se puede dividir entre 0");
            System.out.println("la excepcion que da es: " + exc);
        }
    }

}
