package ejemplo1estructuraejb;

public class ClaseEJB implements InterfazEJB {

    public void GetMensaje(String nombre) {
        System.out.println("Primer EJB, Bienvenido a la tecnología " + nombre);
    }
}
