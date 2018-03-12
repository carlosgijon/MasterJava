import java.io.*;

public class LecturaTeclado {
    public static void main(String[] args) throws IOException {  // Siempre que se trabaja con I/O se pone esta excepcion
        String nombreUsuario;

        System.out.println("Introduzca un nombre:");

        // Se crea un objeto de la clase BufferedReader
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        // Se utliza el metodo readLine() para introducir una linea de caracteress. Con el método read() solo se introduce un caracter
        nombreUsuario = lector.readLine();
        System.out.println("Bienvenido a nuestra aplicacion " +nombreUsuario+ "!!!");

        // Voy a hacer un cambio para probar github
    }
}
