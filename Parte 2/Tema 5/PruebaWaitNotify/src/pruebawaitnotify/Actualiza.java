package pruebawaitnotify;

import java.io.*;

public class Actualiza extends Thread {
    BufferedReader escritura_teclado;
    Ficha[] fichas;
    
    public Actualiza(Ficha[] fichas) {
        System.out.println("Constructor de actualiza");
        escritura_teclado = new BufferedReader(
                new InputStreamReader(System.in));
        this.fichas = fichas;
    }
    
    @Override
    public void run() {
        System.out.println("Método run de Actualiza");
        actualiza();
    }
    
    // Los métodos wait y notify deben estar dentro de un método 
    // Sincronizado. Controlamo si hay wait o notify con una variable
    // boolean.
    
    public synchronized void sincronizar(boolean b) {
        if(b) {
            try {
                wait();
            }
            catch(InterruptedException e) {
                System.out.println(e.toString());
            }
        }
        else {
            notifyAll();
        }
    }
    
    public void actualiza() {
        String linea = "";
        System.out.println("Comenzando actualización");
        
        try {
            System.out.println("Introduzca nombre:");
            fichas[0].nombre = escritura_teclado.readLine();
            
            System.out.println("Introduzca apellidos:");
            fichas[0].apellidos = escritura_teclado.readLine();
            
            System.out.println("Introduzca direccion:");
            fichas[0].direccion = escritura_teclado.readLine();
            
            System.out.println("Introduzca telefono:");
            fichas[0].telefono = Integer.parseInt(escritura_teclado.readLine());
            
            // ponemos sincronizar para que notifique a los hilos
            sincronizar(false);
        }
        catch(IOException e) {
            System.out.println("ERROR");
        }
    }
}
