class Empleado {
    public String nombre;
    public String apellidos;
    public String NIF;
    public int salario;

    // Constructor
    public Empleado() {
        this.nombre = "";
        this.apellidos = "";
        this.NIF = "";
        this.salario = 0;
    }
}

public class PruebaEncapsulacion {
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        emp.nombre = "Jose María";
        emp.apellidos = "Gutierrez Hernandez";
        emp.NIF = "14141238G";
        emp.salario = -2000;

        System.out.println("Nombre empleado: " +emp.nombre);
        System.out.println("Apellidos empleado: " +emp.apellidos);
        System.out.println("NIF empleado: " +emp.NIF);
        System.out.println("Salario empleado: " +emp.salario);
    }
}
