import java.io.*;

public class CreacionFicheros {
    public static void main(String[] args) {
        // Crear una carpeta solo
        File carpeta = new File("/Users/carlos/IdeaProjects/MasterJava/MasterJava/Parte 2/Tema 1/Ejemplo_3_Creacion_de_ficheros/src/carpeta_creada");

        // Crear un archivo dentro de una ruta
        File archivo = new File("/Users/carlos/IdeaProjects/MasterJava/MasterJava/Parte 2/Tema 1/Ejemplo_3_Creacion_de_ficheros/src/carpeta_creada", "archivo1.txt");

        // Crear un archivo poniendolo en la ruta directamente
        File archivo2 = new File("/Users/carlos/IdeaProjects/MasterJava/MasterJava/Parte 2/Tema 1/Ejemplo_3_Creacion_de_ficheros/src/carpeta_creada/archivo_creado_directamente.txt");

        // Crea un directorio dentro de la ruta donde se EJECUTA la aplicación
        File carpeta2 = new File("Ejemplos");

        // Crea un archivo dentro de la ruta donde se EJECUTA la aplicación
        File archivo_un_parametro = new File("archivo.txt");
    }
}
