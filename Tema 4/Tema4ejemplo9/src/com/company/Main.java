package com.company;

public class Main {

    public static void main(String[] args) {
        byte byte1;
        int int1 = 21;

        byte1 = (byte) int1;

        System.out.println("Valor de la conversion de byte1: " + byte1);

        // Ahora vamos a ver como pierde precision un tipo de datos al convertirlo a otro menor. Da excepcion en tiempo de ejecucion pero compila

        int1 = 222222;

        byte1 = (byte) int1;

        System.out.println("ahora, el valor de la conversion (que deberia ser 222222) de byte1 es: " + byte1);

    }
}
