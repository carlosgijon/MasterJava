import java.io.*;

public class Ficheros {
    public static void main(String[] args) {
        // separador almacena el tipo de separador utilizado por el SO
        String separador = File.separator;

        // Em carpeta almaceno el path donde mirar los subelementos
        File carpeta = new File("/Users/carlos/IdeaProjects/MasterJava/MasterJava/Parte 2/Tema 1/Ejemplo_5_Clase_File/src/Trabajos");
        // En elementos almaceno un array con los nombres de los archivo dentro de carpeta
        String[] elementos = carpeta.list();

        // Recorremos el array y buscamos ficheros .txt
        System.out.println("Los ficheros txt son:\t");
        for(int i = 0; i < elementos.length; i++) {
            if(elementos[i].endsWith("txt") || elementos[i].endsWith("TXT")) {
                System.out.println("\t" + carpeta.getAbsolutePath() + separador + elementos[i]);
            }
        }
    }
}
