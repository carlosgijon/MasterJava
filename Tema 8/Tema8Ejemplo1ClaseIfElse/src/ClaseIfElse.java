import java.io.*;

public class ClaseIfElse {
    public static void main(String[] args) throws IOException {
        // Entrada por teclado
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduzca un número para ver si es positivo o negativo:");
        int i = Integer.parseInt(entradaTeclado.readLine());  // Se parsea para que lea los negativos
        String mensaje = "";

        if(i > 0) {
            mensaje = "positivo";
        }
        else if (i < 0) {
            mensaje = "negativo";
        }
        else {
            mensaje = "cero";
        }

        System.out.println("El valor de i es " + mensaje);
    }
}
