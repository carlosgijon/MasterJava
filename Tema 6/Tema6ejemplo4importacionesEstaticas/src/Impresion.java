import static ejemplos.Jugador.*;

public class Impresion {
    public Impresion() {
        nombre += ", Iker";  // Con las importaciones estaticas no es necesario poner el nombre de la clase
        System.out.println("nombre: " +nombre);
        System.out.println("edad: " +edad);
        System.out.println("posicion: " +posicionjugador);
    }

    public static void main(String[] args) {
        new Impresion();
    }

}
