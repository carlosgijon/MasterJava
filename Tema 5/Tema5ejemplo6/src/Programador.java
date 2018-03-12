class Empleado {

    String rut;
    String nombre;
    boolean perfil;
    String colorperfil;

    Empleado() {
        // Contructor vacio
    }

    Empleado(String nm) {
        this.nombre = nm;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nm) {
        this.nombre = nm;
    }

}

public class Programador extends Empleado{
    private String apellido;

    // Constructor
    Programador() {
        super();  // Hereda del constructor de la clase Empleado
    }

    Programador(String nm) {
        super(nm);  // Hereda del constructor de la clase Empleado
    }

    public void setApellido(String ap) {
        this.apellido = ap;
    }

    public String getNombre() {
        return this.nombre + " " + this.apellido;
    }

    public static void main(String[] args) {
        Programador programador = new Programador();
        programador.setNombre("Pepe");
        programador.setApellido("Gómez");

        Programador programador2 = new Programador("Pepe");
        programador2.setApellido("Pillos");

        System.out.println("Programador 1 -->\t" + programador.getNombre());
        System.out.println("Programador 2 -->\t" + programador2.getNombre());
    }
}
