package ejemplo_9_relacion_cliente_servidor;

import java.rmi.server.*;
import java.rmi.*;


class ElSirvienteImplementaLaInterfaz extends UnicastRemoteObject implements LaInterfaz {
    int valor;
    
    public ElSirvienteImplementaLaInterfaz(int n) throws RemoteException {
        valor = n;
        System.out.println("Estoy en ElSirvienteImplementaLaInterfaz");
    }
    
    //-----------------------------------------
    public String cuadrado() throws RemoteException {
        int x = factorial(valor);
        x = x*x;
        return "EL FACTORIAL AL CUADRADO DE " +valor+ " ES " +x;
    }
    //-----------------------------------------
    public int factorial(int n) {
        int resultado = 1;
        
        for(int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
