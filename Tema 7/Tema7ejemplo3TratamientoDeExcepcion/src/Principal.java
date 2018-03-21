public class Principal {
    public static void main(String[] args) {
        try {
            int matriz[] = {1,2,3};
            for(int i = 0; i < 4; i++) {
                System.out.println("Vuelta del bucle nº " + (i+1));
                System.out.println("Salida " + matriz[i]);
            }
            System.out.println("Despues del for");
            System.exit(0);
        }
        catch(ArrayIndexOutOfBoundsException exc) {
            System.out.println("----------------------------EXCEPCION----------------------------");
            System.out.println("No hay mas elementos");
            System.out.println("La excepcion es: " + exc);
            System.out.println("-----------------------------------------------------------------");
        }
        finally {
            System.out.println("El finally siempre se ejecuta");
        }
    }
}
