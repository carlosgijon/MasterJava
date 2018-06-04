/**
 * Objeto que contiene los datos y operaciones de una
 * Ficha de la agenda
 */
package pruebawaitnotify;

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
}
