package ejemplo_9_relacion_cliente_servidor;

import java.rmi.*;
import java.rmi.server.*;

public class ElCliente {

    public static void main(String[] args) {
        String url = "rmi://localhost/";
        
        try {
            LaInterfaz inter = (LaInterfaz) Naming.lookup(url + "Numero");
            System.out.println("inter.cuadrado()");
        }
        catch(Exception exc) {
            System.out.println(exc.toString());
        }
        
    }

}
