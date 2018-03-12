public class Laboratorio2 {

    // Hay que imprimir en pantalla los 255 primeros carácteres del código ASCII

    public static void main(String[] args) {
        System.out.println("Decimal \t\t\t\t Caracter");
        System.out.println("---------------------------------");

        for(int i = 0; i < 256; i++) {
            if(i == 10) {
                System.out.println("   " + i + "\t\t\t\tsalto de linea");
                continue;
            }
            System.out.println("   " + i + "    \t\t\t\t    " + (char)i);
        }
    }
}
