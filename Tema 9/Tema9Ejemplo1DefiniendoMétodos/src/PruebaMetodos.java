class ClaseMatematicas {
    private double PI = 3.1416;

    public int dividirNumero(int numero, int divisor) {
        int resultado;
        resultado = numero / divisor;

        return resultado;
    }

    public int devolverCuadrado(int numero) {
        int resultado;
        resultado = numero * numero;

        return resultado;
    }

    public int devolverCubo(int numero) {
        int resultado;
        resultado = numero * numero * numero;

        return resultado;
    }

    public void mostrarPI() {
        System.out.println("Número PI: " + this.PI);
    }
}

public class PruebaMetodos {
    public static void main(String[] args) {
        ClaseMatematicas c = new ClaseMatematicas();
        int num = 4;
        int resultado;

        System.out.println("El numero inicial es " + num);

        resultado = c.dividirNumero(num,2);
        System.out.println("El numero dividido entre dos es " +resultado);

        resultado = c.devolverCuadrado(num);
        System.out.println("El cuadrado del numero es " +resultado);

        resultado = c.devolverCubo(num);
        System.out.println("El cubo del numero es " +resultado);

        c.mostrarPI();
    }
}
