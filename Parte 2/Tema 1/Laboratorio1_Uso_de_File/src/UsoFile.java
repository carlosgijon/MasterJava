import java.io.*;
public class UsoFile {
    public static void main(String[] args) throws IOException {
        File carpeta = new File("src/TrabajosCurso");

        carpeta.mkdirs();
        final String RUTA_ABSOLUTA = carpeta.getAbsolutePath();

        // creamos dos archivos para recorrerlos
        File archivo1 = new File(carpeta,"archivo1.txt");
        File archivo2 = new File(carpeta,"archivo2.txt");

        archivo1.createNewFile();
        archivo2.createNewFile();

        // Recorremos los archivos
        String[] todos_los_archivos = carpeta.list();
        System.out.println("La carpeta " +RUTA_ABSOLUTA+ " tiene " +todos_los_archivos.length+ " elementos:");

        for(int i = 0; i < todos_los_archivos.length; i++) {
            System.out.println(todos_los_archivos[i]);
        }
    }
}
