import java.io.*;

class ComprobarCadena {
    private String cadena;

    ComprobarCadena(String mtdCadena) {
        this.cadena = mtdCadena;
        System.out.println("");
        System.out.println("La cadena introducida es: " +cadena);
    }

    public static void menu() {
        System.out.println("");
        System.out.println("OPERACIONES CON CADENAS");
        System.out.println("_____________________________________");
        System.out.println("");
        System.out.println("Seleccione una opcion");
        System.out.println("");
        System.out.println("1. convertir cadena en mayusculas");
        System.out.println("2. convertir cadena en minusculas");
        System.out.println("3. ver la longitud de la cadena");
        System.out.println("4. comprobar si contiene algun numero");
        System.out.println("");
        System.out.println("presione cualquier tecla para salir");
    }

    public void menuOpcion(String mtdOpcion) {

            switch(mtdOpcion) {
                case "1":
                    System.out.println(convertirMayusculas());
                    break;

                case "2":
                    System.out.println(convertirMinusculas());
                    break;

                case "3":
                    System.out.println(longitud());
                    break;

                case "4":
                    if(isNumeric()) {
                        System.out.println("La cadena contiene números");
                    }
                    else {
                        System.out.println("La cadena no contiene números");
                    }
                    break;
            }
    }

    public String convertirMayusculas() {
        return this.cadena.toUpperCase();
    }

    public String convertirMinusculas() {
        return this.cadena.toLowerCase();
    }

    public int longitud() {
        return this.cadena.length();
    }

    public boolean isNumeric() throws NumberFormatException {
        int numero;
        char[] letrasCadena = cadena.toCharArray();

        try {
            for (int i = 0; i < cadena.length(); i++) {
                numero = Integer.parseInt(String.valueOf(letrasCadena[i]));
            }
            return true;
        }
        catch(NumberFormatException exc) {
            return false;
        }

    }
}

public class UtilizarCadena {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader entradaOpcion = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("introduzca una cadena de texto para hacer operaciones sobre ella:");
        String cadena = entrada.readLine();
        ComprobarCadena objetoCadena = new ComprobarCadena(cadena);

        String opcion;

        do {
            ComprobarCadena.menu();
            opcion = entradaOpcion.readLine();
            objetoCadena.menuOpcion(opcion);

        }
        while(opcion.equals("1") || opcion.equals("2") || opcion.equals("3") || opcion.equals("4"));
        System.exit(0);
    }
}
