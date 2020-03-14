package ejemplo_3_metodos_socket;

import java.io.*;
import java.net.*;

public class MetodosSocket {

    public static void main(String[] args) {
        try {
            Socket mi_socket = new Socket("localhost",8810);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(mi_socket.getInputStream()));
            
            // Leer los datos
            String texto = entrada.readLine();
            System.out.println(texto);
            
            PrintWriter out = new PrintWriter(mi_socket.getOutputStream(), true);
            
            out.println("Hola");
            
            InetAddress a = mi_socket.getInetAddress();
            System.out.println("mi_socket.getInetAddress(): " +a);
            System.out.println("Puerto al que estamos conectados: " +mi_socket.getPort());
            
            a = mi_socket.getLocalAddress();
            System.out.println("mi_socket.getLocalAddress: " +a);
            System.out.println("Puerto desde el que estamos conectados: " +mi_socket.getLocalPort());
            
            // Cerramos el socket
            mi_socket.close();
        }
        catch(UnknownHostException exc_unknow_host) {
            System.out.println("No se encuentra el servidor");
        }
        
        catch(IOException exc_io) {
            System.out.println("Error E/S");
        }
        
    }

}
