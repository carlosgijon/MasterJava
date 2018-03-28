import personasempresa.*;

class Ejecutivo extends Empleado {
    public Ejecutivo() {
        this.salarioMinimo = 1250;
    }
}

public class PruebaEncapsulacion {
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        Ejecutivo ejc = new Ejecutivo();
        ejc.setSalario(1000);

        System.out.println(ejc.getSalario());
        // emp.SalarioMinimo = 200;  NO COMPILAAAAA porque no hereda de la clase Empleado (aunque use un objeto de esa clase).
    }
}
