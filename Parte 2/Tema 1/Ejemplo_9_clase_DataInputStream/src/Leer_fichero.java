import java.io.*;

class Leer_fichero {
    public static File archivo;
    public static DataInputStream f_lectura;

    public static void main(String[] args) throws IOException{
        BufferedReader leer_archivo = new BufferedReader(new InputStreamReader(System.in));
        File carpeta = new File("src/carpeta");

        System.out.println("INTRODUCE EL NOMBRE Y EXTENSION DEL FICHERO DE CLAVES POR TECLADO");
        try {
            archivo = new File(carpeta, leer_archivo.readLine().trim());
            f_lectura = new DataInputStream(new FileInputStream(archivo));

            while(true) {
                System.out.println("CODIGO DE USUARIO: " +f_lectura.readInt());
                System.out.println("NOMBRE DE USUARIO: " +f_lectura.readUTF());
            }
        }
        catch(FileNotFoundException exc) {
            System.out.println("NO SE HA PODIDO ENCONTRAR EL FICHERO");
        }
        catch(EOFException eoexc) {}
        catch(IOException ioexc) {
            System.out.println("NO SE HA PODIDO LEER LA INFORMACIÓN EN EL FICHERO " +archivo.getName());
        }
        finally {
            try{
                if(f_lectura != null) {
                    f_lectura.close();
                }
            }
            catch (IOException ioe) {
                System.out.println("NO SE HA PODIDO CERRAR CORRECTAMENTE EL FLUJO DEL FICHERO " +archivo.getName());
            }
        }
    }


}
