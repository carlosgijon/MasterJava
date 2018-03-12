public class PruebaVariables {

    public static void main(String[] args) {
        byte byte1;
        short short1;
        int int1;
        long long1;
        byte1 = 1;
        short1 = 100;
        int1 = 10000;
        long1 = 100_000_000;  // Se usa como separador de miles

        System.out.println("Valor de byte1: " + byte1);
        System.out.println("Valor de short1: " + short1);
        System.out.println("Valor de int1: " + int1);
        System.out.println("Valor de long1: " + long1);
    }
}
