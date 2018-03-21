import java.io.*;

public class EjemploSwitch {
    public static void main(String[] args) throws IOException {
        // Entrada por teclado
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduzca un número del 1 al 10:");
        int i = Integer.parseInt(entradaTeclado.readLine());
        String mensaje = "";

        switch (i) {
            case 1:
                mensaje = "El numero es uno";
                break;
            case 2:
                mensaje = "El numero es dos";
                break;
            case 3:
                mensaje = "El numero es tres";
                break;
            case 4:
            case 5:
            case 6:
                mensaje = "El numero es cuatro, cinco o seis";
                break;
            default:
                mensaje = "Ese numero no es evaluado en el switch";
                break;
        }
        System.out.println("He salido del switch");
        System.out.println(mensaje);
    }
}
