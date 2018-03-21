import java.io.*;

public class PruebaAserciones {

    private int dato, x, contadorObjetos = 0;

    private PruebaAserciones() throws InterruptedException {
        contadorObjetos++;
        Conectar();
    }

    public boolean Conectar() throws InterruptedException{  // Nada mas crear un objeto el programa debe conectar
       if(contadorObjetos != 0) {
           System.out.print(".");
           Thread.sleep(300);
           System.out.print(".");
           Thread.sleep(300);
           System.out.print(".");
           Thread.sleep(300);
           System.out.println("El programa ha conectado");
           return true;
       }
       else {
           return false;
       }
    }


    public static void main(String[] args) throws IOException,InterruptedException {
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        PruebaAserciones objetoAserciones = new PruebaAserciones();
        assert objetoAserciones.Conectar();

        System.out.println("Introduzca un numero para el parametro dato (para que el programa funcione debe ser mayor que 15): ");
        objetoAserciones.dato = Integer.parseInt(entradaTeclado.readLine());
        assert objetoAserciones.dato > 15;

        System.out.println("Introduzca un numero para el valor x (para que el programa funcione debe introducir " + (objetoAserciones.dato + 1) + ":");
        objetoAserciones.x = Integer.parseInt(entradaTeclado.readLine());
        assert objetoAserciones.dato == objetoAserciones.x + 1;

        System.out.println("El programa ha funcionado correctamente");
    }
}
