import java.io.*;

public class TemperaturaAnual {
    public static void main(String[] args) throws IOException{
        BufferedReader leer_teclado = new BufferedReader(new InputStreamReader(System.in));
        String[] meses= {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        int[] temperaturas = new int[12];
        String dato;
        int maxima, minima, contador = 0;
        double media = 0.0;

        while(contador < meses.length) {
            System.out.println("Introduzca la temperatura del mes de " +meses[contador]);

            // Se pone este bloque para que se introduzcan todos los datos
            try {
                dato = leer_teclado.readLine();
                temperaturas[contador] = Integer.parseInt(dato);
            }
            catch (NumberFormatException exc) {
                System.out.println("No debe dejar un mes vacio. Vuelve a intentarlo");
                continue;
            }
            contador++;
        }

        maxima = temperaturas[0];
        minima = temperaturas[0];

        contador = 0;  // Ponemos de nuevo el contador a 0 para utilizar un bucle while

        while(contador < meses.length) {
            if(temperaturas[contador] > maxima) {  // buscar la temperatura máxima
                maxima = temperaturas[contador];
            }

            if(temperaturas[contador] < minima) {  // buscar la minima
                minima = temperaturas[contador];
            }

            media += (double)temperaturas[contador];  // ir sumando valores a la media

            contador++;
        }

        System.out.println("La temperatura máxima fue de " +maxima+ " grados");
        System.out.println("La temperatura mínima fue de " +minima+ " grados");
        System.out.println("La temperatura media fue de " +(media / meses.length)+ " grados");

    }
}
