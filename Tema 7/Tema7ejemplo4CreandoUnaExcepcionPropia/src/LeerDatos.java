import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class OpcionErroneaException extends Exception {
    public OpcionErroneaException() {
        mensaje();
    }
    public String mensaje() {
        return ("OPCION ERRONEA");
    }
}

public class LeerDatos {
    public static void main(String[] args) throws IOException{
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        String numero = "";
        String continua = "";
        try {
            do {
                System.out.println("Introduzca un numero:");
                numero = entradaTeclado.readLine();
                int num = Integer.parseInt(numero);
                if (num % 2 == 0) {
                    System.out.println("El numero " +num+ " es par");
                }
                else {
                    System.out.println("El numero " +num+ " es impar");
                }
                System.out.println("¿Desea continuar (s/n)?");
                continua = entradaTeclado.readLine();
                if(!continua.equals("s") || !continua.equals("n")) {
                    throw new OpcionErroneaException();
                }
            }
            while (continua.equals("s") || continua.equals("S"));
        }
        catch (NumberFormatException exc) {
            System.out.println("Debe introducir numeros");
        }
        catch (OpcionErroneaException exc) {
            System.out.println(exc.mensaje());
        }

    }
}
