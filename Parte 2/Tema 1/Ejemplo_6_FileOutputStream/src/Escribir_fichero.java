import java.io.*;

public class Escribir_fichero {
    static FileOutputStream fescritura;

    public static void main(String[] args) {
        String nombre = "PEPE SANCHEZ";
        try {
           File carpeta = new File("src/ficheros");
           if(!carpeta.exists()) {
               carpeta.mkdir();
           }
           File archivo = new File(carpeta,"nombres.dat");
           fescritura = new FileOutputStream(archivo);
        }
        catch (IOException ioe) {
            System.out.println("ERROR GRAVE EN EL SISTEMA DE E/S EN EL ACCESO");
        }

        try {
            fescritura.write(nombre.getBytes(),0,nombre.length());
            System.out.println("SE HA ESCRITO EN EL FICHERO");
        }
        catch (IOException ioe) {
            System.out.println("ERROR DE E/S DE DATOS");
        }
        finally {
            if(fescritura != null) {
                try {
                    fescritura.close();
                }
                catch (IOException ioe) {
                    System.out.printf("NO SE HA PODIDO CERRAR EL FICHERO");
                }
            }
        }

    }
}
