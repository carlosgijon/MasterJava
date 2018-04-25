package ejemplos;

import java.io.*;
import Utilidades.*;

public class Escritura {
    public static ObjectOutputStream f_escritura;
    static File archivo, carpeta;

    public static void main(String[] args){
        carpeta = new File("src/Clientes");
        if(!carpeta.exists()) {
            carpeta.mkdir();
        }
        archivo = new File(carpeta,"Correos.txt");
        try {
            f_escritura = new ObjectOutputStream(new FileOutputStream(archivo));
            f_escritura.writeObject(new Persona("Pepe", "Salas Pérez", "91622314", "pepesalas@gmail.com"));
            System.out.println("SE HA ESCRITO EN EL FICHERO " +archivo);
        }
        catch(IOException exc) {
            System.out.println("NO SE HA PODIDO ESCRIBIR LA INFORMACIÓN EN EL FICHERO");
        }
        finally {
            try {
                if(f_escritura != null) {
                    f_escritura.close();
                }
            }
            catch (IOException exc) {
                System.out.println("NO SE HA PODIDO CERRAR CORRECTAMENTE EL FLUJO ASOCIADO AL FICHERO " +archivo);
            }
        }
    }
}
