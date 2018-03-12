abstract class Empleado {

    String rut;
    String nombre;
    boolean perfil;
    String colorperfil;

    // Creo un metodo static para contar los objetos. se añadira 1 cada vez que se use el constructor
    static int numeroObjetos = 0;

    Empleado() {
        // Contructor vacio
    }

    // Metodos abstractos que se tienen que implementar en clase Programador
    public abstract String vacaciones();
    public abstract String pagas();

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
        numeroObjetos++;  // sirve para sumar +1 cada vez que se crea un objeto y así almacenar el numero de objetos en una variable static
    }

    Programador(String nm) {
        super(nm);  // Hereda del constructor de la clase Empleado
        numeroObjetos++;  // sirve para sumar +1 cada vez que se crea un objeto y así almacenar el numero de objetos en una variable static
    }

    // Se implementan los métodos abstractos
    public String vacaciones() {
        return "SI";
    }

    public String pagas() {
        return "SI";
    }

    public void setApellido(String ap) {
        this.apellido = ap;
    }

    public String getNombre() {
        return this.nombre + " " + this.apellido;
    }

    private void printarTrabajador() {
        System.out.println("Programador " + numeroObjetos + " -->\t" + this.getNombre());
        System.out.println("Vacaciones:\t\t\t" + this.vacaciones());
        System.out.println("Pagas:\t\t\t\t" + this.pagas());
        System.out.println(""); // Una linea en blanco
    }

    public static void main(String[] args) {
        Programador programador = new Programador();
        programador.setNombre("Pepe");
        programador.setApellido("Gómez");
        programador.printarTrabajador();

        Programador programador2 = new Programador("Pepe");
        programador2.setApellido("Pillos");
        programador2.printarTrabajador();
    }
}
