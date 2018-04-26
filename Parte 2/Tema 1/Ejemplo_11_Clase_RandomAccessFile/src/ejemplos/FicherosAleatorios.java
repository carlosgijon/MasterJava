package ejemplos;

import java.io.*;

public class FicherosAleatorios {
    private static final int TAMAÑO_MAXIMO = 50;
    private static final int NOMBRE_MAXIMO = 30;
    private static final int MODULO_MAXIMO = 15;
    private static RandomAccessFile nota;

    //---------------------------------------------------------------
    public static void listar(String[] opc) {
        System.out.println("--------------------------------------------------------");
        for(int i = 1; i <= opc.length; i++) {
            System.out.println("\t\t" +i+ ".-" +opc[i-1]);
        }
        System.out.println("--------------------------------------------------------");
    }
    //---------------------------------------------------------------
    public static String datos(String s) {
        try {
            System.out.println("--------------------------------------------------------");
            System.out.println(s);
            return (new BufferedReader(new InputStreamReader(System.in))).readLine().trim();
        }
        catch(IOException iexc) {
            System.out.println("\nError interno en sistema de entrada/salida");
        }
        return "";
    }
    //---------------------------------------------------------------
    public static void meter_nota_en_fichero() {
        try {
            String aux = "";
            nota.seek(numero_registros()+TAMAÑO_MAXIMO);
            do {
                aux = datos("introduce nombre: ");
                if(aux.length() >= NOMBRE_MAXIMO) {
                    System.out.println("\nNombre demasiado largo\n");
                    System.out.println("--------------------------------------------------------");
                }
            }
            while(aux.length() >= NOMBRE_MAXIMO);
            nota.writeUTF(aux);
            do{
                aux=datos("Introduce modulo: ");
                if (aux.length()>=MODULO_MAXIMO){
                    System.out.println("\nNombre de modulo demasiado largo");
                    System.out.println("--------------------------------------------------------");
                }
            }
            while(aux.length()>=MODULO_MAXIMO);
            nota.writeUTF(aux);
            System.out.println("--------------------------------------------------------");
            otro:do {
                    try {
                        aux = datos("Introduce nota");
                        nota.writeInt(Integer.parseInt(aux));
                    }
                    catch(NumberFormatException nexc) {
                        System.out.println("Debes introducir un número");
                        continue otro;
                    }
            }
            while(false);
        }
        catch(IOException iexc) {
            System.out.println("\nError " + iexc.toString());
        }
    }
    //---------------------------------------------------------------
    public static void listado_completo() {
        if(numero_registros() != 0) {
            System.out.println("\n\t LISTADO COMPLETO\n---------------------------------------------");
            System.out.println("\n---------------------------------------------");

            try {
                for (int i = 0; i < numero_registros(); i++) {
                    nota.seek(i * TAMAÑO_MAXIMO);
                    System.out.println("\nNombre: " + nota.readUTF());
                    System.out.println("Modulo: " + nota.readUTF());
                    System.out.println("Nota: " + nota.readInt());
                    System.out.println("\n---------------------------------------------");
                }
            } catch (IOException iexc) {
                System.out.println("\nError " + iexc.toString());
            }
        }
        else {
            System.out.println("\nNo hay registros introducidos");
        }
    }
    //---------------------------------------------------------------
    public static void notas_de_un_alumno() {
        String aux = "";
        boolean esta = false;
        if(numero_registros() > 0) {
            aux = datos("Introduce el nombre de un alumno");

            try {
                for(int i = 0; i < numero_registros(); i++) {
                    nota.seek(i * TAMAÑO_MAXIMO);
                    if(aux.compareToIgnoreCase(nota.readUTF()) == 0) {
                        nota.seek(i * TAMAÑO_MAXIMO);
                        System.out.println("\n---------------------------------------------");
                        System.out.println("Nombre: "+ nota.readUTF());
                        System.out.println("Modulo: "+ nota.readUTF());
                        System.out.println("Nota: "+ nota.readInt());
                        esta = true;
                    }
                }
                if(!esta) {
                    System.out.println("\nEste alumno no se encuentra");
                }
            }
            catch(IOException iexc) {
                System.out.println("\nError " +iexc.toString());
            }
        }
        else {
            System.out.println("No hay datos en el fichero");
        }
    }
    //---------------------------------------------------------------
    public static void modificar_nota() {
        String aux = "";
        String aux2 = "";
        boolean esta = false;

        if(numero_registros() > 0) {
            aux = datos("Introduce el nombre de un alumno:");
            aux2 = datos("Introduce el modulo:");
            String opcion = "";

            try {
                for(int i = 0; i < numero_registros(); i++) {
                    nota.seek(i * TAMAÑO_MAXIMO);
                    if(aux.compareToIgnoreCase(nota.readUTF()) == 0) {
                        if(aux2.compareToIgnoreCase(nota.readUTF()) == 0) {
                            nota.seek(i * TAMAÑO_MAXIMO);
                            System.out.println("Nombre: "+ nota.readUTF());
                            System.out.println("Modulo: "+ nota.readUTF());
                            opcion = datos("Introduce la nueva nota: ");
                            nota.writeInt(Integer.parseInt(opcion));
                            esta = true;
                        }
                    }
                }
                if(!esta) System.out.println("Estos datos no se encuentran");
            }
            catch(IOException iexc) {
                System.out.println("\nError " +iexc.toString());
            }
        }
        else {
            System.out.println("No hay datos en el fichero");
        }
    }
    //---------------------------------------------------------------
    private static int numero_registros() {
        try {
            return (int)Math.ceil((double)nota.length() / (double)TAMAÑO_MAXIMO);
        }
        catch(IOException iexc) {
            System.out.println("Error grave de entrada/salida");
            return 0;
        }
    }
    //---------------------------------------------------------------
    public static void main(String[] args) {
        String[] menu1={"Introducir nota", "Listado completo","Ver notas de un alumno","Modificar nota","Salir"};
        String opcion;

        try {
            nota = new RandomAccessFile("notas.txt", "rw");
            fin: do {
                listar(menu1);
                opcion = datos("Introduce una opción: ");

                try {
                    switch (Integer.parseInt(opcion)) {
                        case 1:
                            meter_nota_en_fichero();
                            break;
                        case 2:
                            listado_completo();
                            break;
                        case 3:
                            notas_de_un_alumno();
                            break;
                        case 4:
                            modificar_nota();
                            break;
                        case 5:
                            break fin;
                            default:
                                System.out.println("Opcion erronea");
                    }
                }
                catch(NumberFormatException nexc) {
                    System.out.println("La opcion debe ser un número");
                }
            }
            while(true);
        }
        catch(IOException iexc) {
            System.out.println("\nError " +iexc.toString());
        }
        finally {
            try {
                if(nota != null) {
                    nota.close();
                }
            }
            catch (IOException iexc) {
                System.out.println("\nError " +iexc.toString());
            }
        }
    }
}
