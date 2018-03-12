public class PruebaFinalize {
    // Constructor
    PruebaFinalize() {
        System.out.println("Se ha creado el objeto!!!");
        finalize();
    }

    protected void finalize() {
        System.out.println("Se ha destruido el objeto");
    }

    public static void main(String[] args) {
        new PruebaFinalize();
    }
}
