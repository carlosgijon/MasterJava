import java.io.*;

public class Escribir_fichero {
    public static File carpeta = new File("src/carpeta");
    public static File archivo;
    public static DataOutputStream f_escritura;

    public static void main(String[] args) {
        // Antes de nada creamos carpeta si no existe
        if(!carpeta.exists()) {
            carpeta.mkdir();
        }

        String respuesta = "";
        System.out.println("INTRODUCE EL FICHERO DE CLAVES POR TECLADO");

        try {
            String nombre_fichero = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();
            archivo = new File(carpeta,nombre_fichero);

            if(archivo.exists()) {
                System.out.println("EL FICHERO YA EXISTE ¿DESEA SOBREESCRIBIRLO? (si/no)");
                respuesta = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();
            }

            if(respuesta.compareToIgnoreCase("si") == 0) {
                f_escritura = new DataOutputStream(new FileOutputStream(archivo));
            }
            else {
                f_escritura = new DataOutputStream(new FileOutputStream(archivo,true));
            }

            System.out.println("INTRODUCE EL NOMBRE DE USUARIO POR TECLADO");
            String nombre = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();

            System.out.println("INTRODUCE EL CODIGO DE USUARIO POR TECLADO");
            int codigo = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine().trim());

            f_escritura.writeInt(codigo);
            f_escritura.writeUTF(nombre);

            System.out.println("Se ha escrito el fichero " +archivo.getName()+ " en " +archivo.getCanonicalPath());
        }
        catch(IOException exc) {
            System.out.println("NO SE HA PODIDO ESCRIBIR LA INFORMACION EN EL FICHERO " +archivo.getName());
        }
        finally {
            try {
                if(f_escritura != null) f_escritura.close();
            }
            catch(IOException exc) {
                System.out.println("NO SE HA PODIDO CERRAR CORRECTAMENTE EL ARCHIVO " +archivo.getName());
            }
        }
    }
}

