package ejemplo_9_relacion_cliente_servidor;

import java.rmi.*;
import java.rmi.server.*;

class ElServidor {
    public static void main(String[] args) {
        try {
            System.out.println("Implementando la clase servidor");
            
            ElSirvienteImplementaLaInterfaz n = new ElSirvienteImplementaLaInterfaz(5);
            
            System.out.println("Escribiendo en el servicio de nombres");
            
            // Hacemos referencia al nombre con Naming
            Naming.rebind("Numero", n);
            System.out.println("Esperando llamadas del cliente");
        }
        catch(Exception exc) {
            System.out.println(exc.toString());
        }
    }
}
