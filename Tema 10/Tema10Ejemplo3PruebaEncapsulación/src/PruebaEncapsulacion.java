class Empleado {
    private String nombre;
    private String apellidos;
    private String NIF;
    private int salario;

    // Constructor
    public Empleado() {
        this.nombre = "";
        this.apellidos = "";
        this.NIF = "";
        this.salario = 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nmb) {
        this.nombre = nmb;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String ape) {
        this.apellidos = ape;
    }

    public String getNIF() {
        return this.NIF;
    }

    public void setNIF(String nif) {
        this.NIF = nif;
    }

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int sal) {
        if(sal > 800) {
            this.salario = sal;
        }
        else {
            this.salario = 800;
        }
    }
}

public class PruebaEncapsulacion {
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        emp.setNombre("Jose María");
        emp.setApellidos("Gutierrez Hernandez");
        emp.setNIF("14141238G");
        emp.setSalario(-2000);  // Salario no puede ser negativo, ha de ser minimo 800 euros

        System.out.println("Nombre empleado: " +emp.getNombre());
        System.out.println("Apellidos empleado: " +emp.getApellidos());
        System.out.println("NIF empleado: " +emp.getNIF());
        System.out.println("Salario empleado: " +emp.getSalario());
    }
}