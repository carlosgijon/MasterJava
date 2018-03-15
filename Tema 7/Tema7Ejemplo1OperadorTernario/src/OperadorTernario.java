import java.io.*;

public class OperadorTernario {
    public static void main(String[] args) throws IOException, InterruptedException{
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        String mensaje;
        int i;
        boolean flag = true;
        System.out.println("introduzca un numero, para salir introduzca cualquier letra: ");

        while(flag) {
            try {
                i = Integer.parseInt(entradaTeclado.readLine());

                mensaje = i > 0 ? "positivo" : "negativo";

                System.out.println("El numero " + i + " Es " + mensaje);
                System.out.println();
                System.out.println("introduzca otro numero, para salir introduzca cualquier otra tecla: ");
            }
            catch(NumberFormatException exc) {
                System.out.print("Saliendo");
                Thread.sleep(150);
                System.out.print(".");
                Thread.sleep(150);
                System.out.print(".");
                Thread.sleep(150);
                System.out.print(".");
                Thread.sleep(150);
                System.out.print(".");
                Thread.sleep(150);
                System.out.print(".");
                flag = false;
            }
        }

    }
}
