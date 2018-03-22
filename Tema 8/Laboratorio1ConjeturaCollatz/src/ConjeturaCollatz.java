import java.io.*;

public class ConjeturaCollatz {
    private int numero = 0;
    private BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));

    // CONSTRUCTOR
    public ConjeturaCollatz() throws IOException{
        System.out.println("=================================================");
        System.out.println("=             SECUENCIA DE COLLATZ              =");
        System.out.println("=================================================");
        IntroducirNumero();
    }

    public int escribir() throws IOException {
        numero = Integer.parseInt(entradaTeclado.readLine());
        return numero;
    }

    public void calculoConjetura() {
        System.out.println("Has introducido el numero " + numero + ", Empezamos los calculos:");
        do {
            if(numero % 2 == 0) {

                numero = numero / 2;
            }
            else {
                numero = (numero * 3) + 1;
            }

            System.out.println(numero);

        } while (numero > 1);
        System.out.println("Fin del programa");
    }

    public void IntroducirNumero() throws IOException{
        boolean esNumero;  // Flag para salir del bucle
        do {
            try {
                System.out.println("Introduce un número: ");
                numero = escribir();
                esNumero = true;
            }
            catch(NumberFormatException exc) {
                System.out.println("Has escrito una letra, debes escribir un numero, prueba de nuevo.");
                esNumero = false;
            }
        } while(!esNumero);
        calculoConjetura();
    }

    public static void main(String[] args) throws IOException, NumberFormatException{
        new ConjeturaCollatz();
    }
}
