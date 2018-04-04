// EL programa generara 10 números del 0 al 10

import java.util.*;

public class PruebaSet {
    public static void main(String[] args) {
        Random rnd = new Random();
        TreeSet numeros_ordenados = new TreeSet();  // El tipo de objeto TreeSet crea el set numeros_ordenados
        TreeSet numeros_primitiva = new TreeSet();


        for(int i = 0; i < 10; i++) {
            int numero_aleatorio = (int)(rnd.nextDouble() * 10);
            numeros_ordenados.add(numero_aleatorio);  // Añade el valor de numero aleatorio al set numeros_ordenados
        }

        Iterator item = numeros_ordenados.iterator();

        while(item.hasNext()) {  // Mientras haya un item despues
            System.out.println(item.next());  // printará el siguiente objeto de Iterator
        }

        // Probar los métodos de Set
        System.out.println("Primer número del Set: " +numeros_ordenados.first());
        System.out.println("Último número del Set: " +numeros_ordenados.last());
        System.out.println("Número de elementos en la colección: " +numeros_ordenados.size());

        System.out.println();  // Un espacio en blanco

        // Se me ha ocurrido que este programa valdría para la primitiva, agrero un bucle do / while para que generé 6 números
        System.out.println("============================================");
        System.out.println("=             Prueba primitiva             =");
        System.out.println("============================================");
        do {
            int numero_aleatorio = (int)(rnd.nextDouble() * 50);
            numeros_primitiva.add(numero_aleatorio);
        } while(numeros_primitiva.size() < 6);

        Iterator item_primitiva = numeros_primitiva.iterator();

        while(item_primitiva.hasNext()) {
            System.out.println(item_primitiva.next());
        }
    }
}
