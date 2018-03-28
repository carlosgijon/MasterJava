package personasempresa;

public class Empleado {
    private String nombre;
    private int salario;
    protected int salarioMinimo;

    //CONSTRUCTOR
    public Empleado() {
        this.nombre = "";
        this.salario = 0;
        this.salarioMinimo = 600;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int sal) {
        if(sal > salarioMinimo) {
            this.salario = sal;
        }
        else {
            this.salario = this.salarioMinimo;
        }
    }

}
