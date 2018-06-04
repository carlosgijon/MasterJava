package pruebawaitnotify;

import java.io.*;

public class Leer extends Thread {
    Ficha[] fichas;
    Actualiza ac;
    
    // Constructor
    Leer(Ficha[] fichas, Actualiza ac) {
        System.out.println("Constructor de leer");
        this.fichas = fichas;
        this.ac = ac;
    }
    
    // Se sobrescribe el método run
    public void run() {
        System.out.println("Método run() de leer");
        leer();
    }
    
    public void leer() {
        try{
            ac.sincronizar(true);
            
            // Se llama al método texto() de la clase Ficha
            // ya que fichas es un array de objetos de Ficha
            System.out.println(fichas[0].texto());
            sleep(5000);
        }
        catch(InterruptedException iexc) {
            System.out.println(iexc.toString());
        }
    }
}
