import java.util.*;
import java.io.*;

class EjemploProperties {
    public static void main(String[] args) throws IOException{
        Properties objeto_prop = new Properties();
        InputStream objeto_is = null;
        BufferedReader leer_teclado =new BufferedReader(new InputStreamReader(System.in));
        String clave, valor;

        // Se crea un flujo de entrada a traves del fichero configuración.properties y se carga con el método load para que lea las propiedades
        try {
           objeto_is = new FileInputStream("/Users/carlos/IdeaProjects/MasterJava/MasterJava/Parte 2/Tema 1/Ejemplo_3_Recuperación_de_properties/src/configuracion.properties");
           objeto_prop.load(objeto_is);
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }

        // Accedemos a las propiedades por su nombre
        System.out.println("Propiedades por nombre");
        System.out.println("--------------------------------------------");
        System.out.println(objeto_prop.getProperty("servidor.nombre"));
        System.out.println(objeto_prop.getProperty("servidor.usuario"));
        System.out.println(objeto_prop.getProperty("servidor.password"));
        System.out.println();
        System.out.println("Vamos a incluir una propiedad");
        System.out.println("--------------------------------------------");
        System.out.println("Introduzca la clave de la nueva propiedad:");
        clave = leer_teclado.readLine();
        System.out.println("Introduzca ahora el valor");
        valor = leer_teclado.readLine();
        objeto_prop.setProperty(clave,valor);
        System.out.println();
        System.out.println("Recorrer las propiedades sin saber su nombre");
        System.out.println("--------------------------------------------");
        for(Enumeration e = objeto_prop.keys(); e.hasMoreElements();) {
            Object objeto = e.nextElement();
            System.out.println(objeto + ": " + objeto_prop.getProperty(objeto.toString()));
        }
    }
}
