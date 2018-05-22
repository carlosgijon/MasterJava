package ejemplothreads;

import java.io.*;

public class Teclado implements Runnable {
    BufferedReader escribir_teclado;
    
    // CONSTRUCTOR
    public Teclado() {
        new Thread().start();
        System.out.println("Constructor de teclado");
        escribir_teclado = new BufferedReader(new InputStreamReader(System.in));
    }
    
    @Override
    public void run() {
        String texto = "";
        System.out.println("Método run de teclado");
        
        try {
            for(int i = 0; i < 15; ++i) {
                System.out.println("Introduzca una linea de texto: ");
                texto = escribir_teclado.readLine();
                System.out.println("Has escrito: " + texto);
            }
        
        
        }
        catch(IOException iexc) {
            System.out.println("ERROR");
        }
    }
    
}
