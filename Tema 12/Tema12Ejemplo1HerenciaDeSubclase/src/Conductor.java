import java.io.*;

public class Conductor {
    public static void main(String[] args) throws IOException {
        BufferedReader leer_teclado = new BufferedReader(new InputStreamReader(System.in));
        // Coche c = new Coche(); // Comentar para probar deportivo
        Deportivo c = new Deportivo();
        int opcion = 0;

        while(opcion != 4) {
            c.mostrar_menu();
            opcion = Integer.parseInt(leer_teclado.readLine());
            switch (opcion) {
                case 1:
                    c.acelerar_coche();
                    break;

                case 2:
                    c.frenar_coche();
                    break;

                case 3:
                    c.cambiar_marcha();
                    break;
            }
        }
        System.out.println("Hasta pronto!!!");
    }
}
