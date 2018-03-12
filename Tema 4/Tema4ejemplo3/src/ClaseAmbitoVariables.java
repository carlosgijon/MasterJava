public class ClaseAmbitoVariables {

    static int i = 25;

    public static void main(String[] args) {

        int i = 19;

        System.out.println("El valor de i en main() es " + i);

        System.out.println("El valor de i fuera de main() es " + ClaseAmbitoVariables.i);
    }
}
