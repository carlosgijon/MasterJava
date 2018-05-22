package ejemplothreads;

import java.util.*;

public class Hora extends Thread {
    
    // Constructor
    public Hora() {
        System.out.println("Constructor de hora");
    }
    
    public void run() {
        Date fecha = new Date();
        System.out.println("Método Run de teclado");
        
        try {
            for(int i = 0; i < 15; ++i) {
                System.out.println("Fecha " + fecha.toString());
                sleep(5000);
            }
        }
        catch(InterruptedException iexc) {
            System.out.println("ERROR");
        }
    }
}
