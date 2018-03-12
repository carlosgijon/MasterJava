class Clase1 {
    int edad = 35;
}

class Clase2 extends Clase1 {
     int edad1 = 5;
}

public class SuperClase {
    public static void main(String[] args) {
        System.out.println("La variable de la clase actual es " + new Clase2().edad);
        System.out.println("La variable de la superclase es " + new Clase2().edad1);
    }
}