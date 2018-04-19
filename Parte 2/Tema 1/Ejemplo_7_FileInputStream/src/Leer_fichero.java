import java.io.*;

public class Leer_fichero {
    public static FileInputStream f_lectura;
    public static File archivo;

    public static void main(String[] args) {
        try {
            archivo = new File("src" +File.separator+ "ficheros" +File.separator+ "nombres.dat");
            f_lectura = new FileInputStream(archivo);
        }
        catch(FileNotFoundException exc) {
            System.out.println("ERROR GRAVE: El fichero " +archivo.getAbsolutePath()+ " no esta disponible");
            return;  // Para salir del programa
        }

        try {
            // Se crea un array de lectura con new byte[longitud de los bytes de archivo convertido a bytes]
            byte[] array = new byte[(byte)archivo.length()];

            // Se crea una variable int para el método read
            int leidos = f_lectura.read(array,0,array.length);
            System.out.print("El fichero abierto (\"" +archivo.getAbsolutePath()+ "\") contiene: ");
            System.out.println(new String(array,0,leidos));
        }
        catch(IOException ioe) {
            System.out.println("ERROR DE E/S DE DATOS");
        }
        finally {
            if(f_lectura != null) {
                try {
                    f_lectura.close();
                }
                catch(IOException ioe) {
                    System.out.println("ERROR NO SE HA PODIDO CERRAR EL ARCHIVO");
                }
            }
        }
    }
}
