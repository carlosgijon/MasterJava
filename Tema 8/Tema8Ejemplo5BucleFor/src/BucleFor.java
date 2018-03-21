// El programa va a contar los numeros pares de 0 a 20

public class BucleFor {
    public static void main(String[] args) {
        System.out.println("Estoy al inicio del bucle");
        System.out.println("numeros pares");

        for(int i = 0; i < 20; i++) {
            if(i % 2 == 0) {
                System.out.println("Valor de i: " + i);
            }
        }
        System.out.println("Se sale del bucle, fin del programa");
    }
}