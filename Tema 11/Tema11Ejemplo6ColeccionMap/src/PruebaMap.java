// Aunque no venga en el libro voy a hacer un ejemplo de mapas como el que hice en Swift
// Habra un Map que sea el nombre de una persona y una clave que se le asigna automáticamente

import java.io.*;
import java.util.*;

public class PruebaMap {
    public static void main(String[] args) throws IOException{
        BufferedReader introducir_por_teclado = new BufferedReader(new InputStreamReader(System.in));
        TreeMap personas = new TreeMap();
        int numero_personas = 0;

        // Vamos a introducir el nombre de cuatro personas y se va a asignar una clave automática incremental

        while(numero_personas < 4) {
            System.out.println("Introduzca el nombre de una persona (se le asignará la clave " +numero_personas+ ")");
            String nombre_persona = introducir_por_teclado.readLine();
            personas.put(numero_personas,nombre_persona);
            numero_personas++;
        }

        // Ahora vamos a printar todas las personas y su campo clave
        System.out.println("=========================================================");
        System.out.println("=                  PERSONAS INTRODUCIDAS                =");
        System.out.println("=========================================================");
        System.out.println("|\tCLAVE\t|\t\t\t\t\tPERSONA\t\t\t\t\t|");
        System.out.println("=========================================================");

        // Vamos a recorrer el map
        for(int i = 0; i < personas.size(); i++) {
            System.out.println("|\t"+i+"\t\t|\t\t\t\t\t"+personas.get(i)+"\t\t\t\t\t|");
            System.out.println("---------------------------------------------------------");
        }

    }
}
