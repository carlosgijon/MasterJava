import java.util.Scanner;

public class Laboratorio4 {

    public static void main(String[] args) {
        System.out.println("Casting entre tipos de datos");
        System.out.println("-----------------------------------------------------");
        String texto;
        int numero = 25;
        double decimal = 19.21;
        byte bit = (byte) 255;
        float f = 65.55F;
        boolean valor = true;
        texto = "22";
        numero = Integer.parseInt(texto);  // Pasa de String a int

        System.out.println("Convertido String a int: " + numero);

        // Cambiamos el numero de nuevo
        numero = 4567;
        texto = String.valueOf(numero);  // Pase de int a String

        System.out.println("Convertido int a String: " + texto);

        numero = (int) decimal;
        System.out.println("Convertirdo de double a int: " + numero);
        System.out.println("Perdida de precision del double: " + decimal);

        texto = String.valueOf(decimal);
        System.out.println("Convertido de double a String: " + texto);

        decimal = f;
        System.out.println("Conversion automatica de double a float: " + decimal);

        f = (float) decimal;
        System.out.println("Conversion de double a float: " + f);
        System.out.println("Perdida de precision de float: " +decimal);

        texto = String.valueOf(f);
        System.out.println("Conversion de float a String: " + texto);

        texto = String.valueOf(valor);
        System.out.println("Conversion de boolean a String: " + valor);

        System.out.println("-----------------------------------------------------");
        System.out.println("Fin del programa");
    }
}
