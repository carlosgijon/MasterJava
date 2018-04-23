import java.io.*;

public class ManejarFicheros {

    static FileOutputStream f_escritura;
    static FileInputStream f_lectura;

    public static void main(String[] args) throws IOException{
        BufferedReader leer_teclado = new BufferedReader(new InputStreamReader(System.in));
        int opcion;
        String opcion_sobreescribir, nombre_fichero_escritura, texto_fichero_escritura, nombre_fichero_lectura;
        boolean agregar = false;
        byte[] array_lectura;
        File carpeta = new File("src/archivos");
        File archivo = null;

        if(!carpeta.exists()) {
            carpeta.mkdir();
        }

        do {
            // MENU
            System.out.println("****************************************");
            System.out.println("*                                      *");
            System.out.println("*            MANEJAR FICHEROS          *");
            System.out.println("*                                      *");
            System.out.println("****************************************");
            System.out.println("*                                      *");
            System.out.println("* 1.- Escritura en fichero             *");
            System.out.println("* 2.- Lectura en fichero               *");
            System.out.println("* 3.- SALIR                            *");
            System.out.println("*                                      *");
            System.out.println("****************************************");
            System.out.println("*         Selecciona una opción        *");
            System.out.println("****************************************");
            opcion = Integer.parseInt(leer_teclado.readLine());
            switch(opcion) {
                case 1:
                    // Escritura en ficheros
                    System.out.println("Introduce el nombre del fichero donde escribir: ");
                    nombre_fichero_escritura = leer_teclado.readLine();
                    archivo = new File(carpeta, nombre_fichero_escritura);

                    if(archivo.exists()) {
                        System.out.println("El archivo existe. ¿Quieres sobreescribirlo? (s/n)");
                        opcion_sobreescribir = leer_teclado.readLine().trim();
                        if(opcion_sobreescribir.compareToIgnoreCase("s") == 0) {
                            agregar = false;
                        }
                        else {
                            agregar = true;
                        }
                    }

                    System.out.println("Introduce texto en el fichero:");
                    texto_fichero_escritura = leer_teclado.readLine();

                    try {
                        f_escritura = new FileOutputStream(archivo, agregar);
                        f_escritura.write(texto_fichero_escritura.getBytes(),0,texto_fichero_escritura.length());
                        System.out.println("Se ha escrito en el archivo \"" +nombre_fichero_escritura+ "\" el texto \"" +texto_fichero_escritura+ "\"");
                    }
                    catch(IOException exc) {
                        System.out.println("No se ha podido escribir en el fichero");
                    }
                    finally {
                        f_escritura.close();
                    }

                    break;

                case 2:
                    // Lectura del fichero;
                    System.out.println("Introduce el nombre del fichero a leer: ");
                    nombre_fichero_lectura = leer_teclado.readLine();

                    try {
                        archivo = new File(carpeta,nombre_fichero_lectura);
                        f_lectura = new FileInputStream(archivo);
                    }
                    catch(FileNotFoundException exc) {
                        System.out.println("No se encuentra el archivo \"" +nombre_fichero_lectura+ "\"");
                    }

                    try {
                        array_lectura = new byte[(byte)archivo.length()];
                        int leidos = f_lectura.read(array_lectura,0,array_lectura.length);
                        System.out.println("El fichero \"" +nombre_fichero_lectura+ "\" contiene: ");
                        System.out.println(new String(array_lectura,0,leidos));
                    }
                    catch (IOException exc) {
                        System.out.println("No se puede leer el archivo");
                    }
                    finally {
                        f_lectura.close();
                    }

                    break;
                case 3:
                    System.out.println("Se va a salir de la aplicación");
            }
        }
        while(opcion != 3);

    }
}
