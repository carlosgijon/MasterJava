public class PruebaArray {
    public static void main(String[] args) {
        String[][] array_multidimensional = new String[3][2];

        array_multidimensional[0][0] = "Nacho Llanos";
        array_multidimensional[0][1] = "12345678N";
        array_multidimensional[1][0] = "Andrea Serrano";
        array_multidimensional[1][1] = "23451235H";
        array_multidimensional[2][0] = "Lucia Gutierrez";
        array_multidimensional[2][1] = "98765432P";

        // Ciclo for para recorrer filas
        for(int i = 0; i < array_multidimensional.length; i++) {
            // Ahora se recorren las columnas
            for(int z = 0; z < array_multidimensional[i].length; z++) {
                System.out.println("El dato de la fila " +i+ " y la columna " +z+ " es " +array_multidimensional[i][z]);
            }
        }
    }
}
