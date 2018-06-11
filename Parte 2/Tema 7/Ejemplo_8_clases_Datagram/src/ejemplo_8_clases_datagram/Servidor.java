package ejemplo_8_clases_datagram;

import java.net.*;
import java.io.*;


public class Servidor {
    public static void main(String[] args) {
        try {
            DatagramSocket socket_server = new DatagramSocket(5000);
            System.out.println("Escuchando el puerto 5000");
            
            // Creamos un bucle infinito para que este escuchando
            while(true) {
                DatagramPacket paquete = new DatagramPacket(new byte[20], 20);
                
                // Esperamos a recibir la información
                socket_server.receive(paquete);
                System.out.println("Recibida llamada por el puerto 5000");
                
                // reenviamos la información recibida, construyo un paquete
                // con este información
                DatagramPacket paquete_envio = new DatagramPacket(paquete.getData(), paquete.getLength(),paquete.getAddress(),paquete.getPort());
                
                socket_server.send(paquete_envio);
            }
        }
        catch(IOException exc_io) {
            System.out.println(exc_io.toString());
        }
    }

}
