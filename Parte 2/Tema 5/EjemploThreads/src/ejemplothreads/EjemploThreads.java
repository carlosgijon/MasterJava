package ejemplothreads;

public class EjemploThreads {

    public static void main(String[] args) {
        // La clase teclado y hora se crearán despues
        Teclado hilo_1 = new Teclado();
        Hora hilo_2 = new Hora();
        
        // Iniciamos los dos hilos
        hilo_2.start();
        new Thread(hilo_1).start();
        
    }
    
}
