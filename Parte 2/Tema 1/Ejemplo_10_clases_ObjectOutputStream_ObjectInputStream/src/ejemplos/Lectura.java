package ejemplos;

import java.io.*;
import Utilidades.*;

public class Lectura {
    public static ObjectInputStream f_lectura;
    public static File archivo;

    public static void main(String[] args) {
        archivo = new File("src/Clientes","Correos.txt");

        try {
            f_lectura = new ObjectInputStream(new FileInputStream(archivo));
            Persona obj = (Persona) f_lectura.readObject();
            System.out.println("NOMBRE: " +obj.obtener_nombre());
            System.out.println("APELLIDOS: " +obj.obtener_apellidos());
            System.out.println("TELEFONO: " +obj.obtener_telefono());
            System.out.println("EMAIL: " +obj.obtener_email());
        }
        catch(ClassNotFoundException cexc) {
            System.out.println("NO SE HA PODIDO CONVERTIR LA INFORMACION");
        }
        catch(IOException exc) {
            System.out.println("NO SE HA PODIDO LEER LA INFORMACIÓN DEL FICHERO");
        }
        finally {
            try {
               if(f_lectura != null) {
                   f_lectura.close();
               }
            }
            catch(IOException exc) {
                System.out.println("NO SE HA PODIDO CERRAR EL FLUJO CORRECTAMENTE");
            }
        }
    }
}
