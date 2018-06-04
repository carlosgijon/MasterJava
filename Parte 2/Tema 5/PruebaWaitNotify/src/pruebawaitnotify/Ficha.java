/**
 * Objeto que contiene los datos y operaciones de una
 * Ficha de la agenda
 */
package pruebawaitnotify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ficha implements java.io.Serializable {
    protected String nombre;
    protected String apellidos;
    protected String direccion;
    protected int telefono;
    
    // Construye una ficha nueva con sus datos
    public Ficha(String nombre, String apellidos, 
            String direccion, int telefono) {
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
    }
        
    // Devuelve el texto con el contenido de la ficha
    public String texto() {
        String texto = "________________________________________\n"+
                       "Nombre: " +nombre+ "\n"+
                       "Apellidos: " +apellidos+ "\n"+
                       "Direccion: " +direccion+ "\n"+
                       "Telefono: " +telefono+ "\n"+
                       "________________________________________\n";
        return texto;
    }
    
    public synchronized void operar(int opcion) {
        BufferedReader escribir_teclado_syn = new BufferedReader (
                                new InputStreamReader(System.in));
        switch(opcion) {
            case 1: 
                try {
                    System.out.println("Introduzca nombre: ");
                    this.nombre = escribir_teclado_syn.readLine();
                    
                    System.out.println("Introduzca apellido: ");
                    this.apellidos = escribir_teclado_syn.readLine();
                    
                    System.out.println("Introduzca direccion: ");
                    this.direccion = escribir_teclado_syn.readLine();
                    
                    System.out.println("Introduzca telefono: ");
                    this.telefono = Integer.parseInt(
                            escribir_teclado_syn.readLine());
                    
                    
                }
                catch(IOException e) {
                    System.out.println("Error");
                }
                break;
                
            case 2:
                System.out.println("Saliendo del método operar");
                break;
        }
    }
}
