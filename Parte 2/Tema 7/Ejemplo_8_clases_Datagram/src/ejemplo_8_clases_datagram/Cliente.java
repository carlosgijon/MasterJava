package ejemplo_8_clases_datagram;

import java.net.*;
import java.io.*;

public class Cliente {

    public static void main(String[] args) {
        String servidor = "192.168.1.33";
        int puerto = 5000;
        String cadenaUDP = "Prueba ejemplo datagramas";  // Cadena a enviar
        byte[] envio = cadenaUDP.getBytes();
        
        try {
            InetAddress direccion_ip = InetAddress.getByName(servidor);
            DatagramPacket paquete = new DatagramPacket(envio, envio.length, direccion_ip, puerto);
            
            // Creamos objeto DatagramSocket
            DatagramSocket mi_socket = new DatagramSocket();
            
            // Enviamos la información
            mi_socket.send(paquete);
            byte[] recepcion = paquete.getData();
            
            // sobreescribo
            for(int i = 0; i < paquete.getLength(); i++) {
                recepcion[i] = (byte)'x';  // Lo lleno de x
            }
            
            System.out.println(new String(paquete.getData()));
            // Aqui mostraremos las x
            mi_socket.close();
        }
        catch(IOException exc_io) {
            System.out.println(exc_io.toString());
        }
    }

}
