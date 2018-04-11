import java.io.*;
import java.util.*;

public class Agenda {
    public static void main(String[] args) throws IOException {
        Vector<Persona> agenda = new Vector<>();
        Persona contacto = null;
        BufferedReader leer_teclado = new BufferedReader(new InputStreamReader(System.in));
        int opcion;
        boolean encontrado = false;  // flag para encontrar contactos

        do {
            System.out.println("*********************************************");
            System.out.println("*                                           *");
            System.out.println("*                   AGENDA                  *");
            System.out.println("*                                           *");
            System.out.println("*********************************************");
            System.out.println("*                                           *");
            System.out.println("* 1.- Insertar un contacto                  *");
            System.out.println("* 2.- Mostrar todos los contactos           *");
            System.out.println("* 3.- Buscar un contacto                    *");
            System.out.println("* 4.- SALIR                                 *");
            System.out.println("*                                           *");
            System.out.println("*********************************************");
            System.out.println("*           Introduzca una opcion           *");
            System.out.println("*********************************************");

            opcion = Integer.parseInt(leer_teclado.readLine());

            switch(opcion) {
                case 1:
                    String nombre_nuevo_contacto;
                    int telefono_nuevo_contacto, codigo_nuevo_contacto;

                    System.out.println("Se va a insertar un nuevo contacto");
                    System.out.println();

                    System.out.println("Introduzca el nombre del nuevo contacto");
                    nombre_nuevo_contacto = leer_teclado.readLine();
                    System.out.println("Introduzca el numero de telefono para " +nombre_nuevo_contacto);
                    telefono_nuevo_contacto = Integer.parseInt(leer_teclado.readLine());
                    System.out.println("Introduzca un codigo para " +nombre_nuevo_contacto);
                    codigo_nuevo_contacto = Integer.parseInt(leer_teclado.readLine());

                    // Se crea la nueva persona
                    contacto = new Persona(nombre_nuevo_contacto,telefono_nuevo_contacto,codigo_nuevo_contacto);
                    agenda.add(contacto);
                    System.out.println("Se ha creado el contacto \"" + nombre_nuevo_contacto+ "\" con código " +codigo_nuevo_contacto);
                    break;

                case 2:
                    System.out.println("Se van a mostrar todos los contactos");
                    System.out.println();


                    for(int i = 0; i < agenda.size(); i++) {
                        contacto = agenda.elementAt(i);

                        System.out.println("CODIGO: " +contacto.getCodigo_persona());
                        System.out.println("NOMBRE: " +contacto.getNombre());
                        System.out.println("TELEFONO: " +contacto.getTelefono());
                        System.out.println();  // Linea en blanco
                    }
                    break;

                case 3:
                    System.out.println("Se va a buscar un contacto o bien por codigo o por nombre");

                    System.out.println("*********************************************");
                    System.out.println("*                                           *");
                    System.out.println("*                   AGENDA                  *");
                    System.out.println("*                                           *");
                    System.out.println("*********************************************");
                    System.out.println("*                                           *");
                    System.out.println("*                                           *");
                    System.out.println("* 1.- Buscar por nombre                     *");
                    System.out.println("* 2.- Buscar por código                     *");
                    System.out.println("*                                           *");
                    System.out.println("*                                           *");
                    System.out.println("*********************************************");
                    System.out.println("*           Introduzca una opcion           *");
                    System.out.println("*********************************************");

                    int buscar_contacto = Integer.parseInt(leer_teclado.readLine());

                    switch(buscar_contacto) {
                        case 1:
                            encontrado = false;

                            System.out.println("Se buscará el contacto según el nombre");
                            System.out.println();
                            System.out.println("Introduzca el nombre a buscar: ");
                            String nombre_a_buscar = leer_teclado.readLine();

                            for(int i = 0; i < agenda.size(); i++) {
                                contacto = agenda.elementAt(i);
                                if(contacto.getNombre().equals(nombre_a_buscar)) {
                                    encontrado = true;
                                    System.out.println();
                                    System.out.println("CODIGO: " +contacto.getCodigo_persona());
                                    System.out.println("NOMBRE: " +contacto.getNombre());
                                    System.out.println("TELEFONO: " +contacto.getTelefono());
                                    System.out.println();  // Linea en blanco
                                    break;
                                }
                            }

                            if(!encontrado) {
                                System.out.println("No se encuentra el contacto");
                            }

                            break;

                        case 2:
                            encontrado = false;

                            System.out.println("Se buscará el contacto según el codigo");
                            System.out.println();
                            System.out.println("Introduzca el código a buscar:");
                            int codigo_a_buscar = Integer.parseInt(leer_teclado.readLine());

                            for(int i = 0; i < agenda.size(); i++) {
                                contacto = agenda.elementAt(i);
                                if(codigo_a_buscar ==  contacto.getCodigo_persona()) {
                                    encontrado = true;
                                    System.out.println();
                                    System.out.println("CODIGO: " +contacto.getCodigo_persona());
                                    System.out.println("NOMBRE: " +contacto.getNombre());
                                    System.out.println("TELEFONO: " +contacto.getTelefono());
                                    System.out.println();  // Linea en blanco
                                    break;
                                }
                            }

                            if(!encontrado) {
                                System.out.println("No se encuentra el contacto");
                            }

                            break;
                    }
                    break;
            }

            System.out.println();  // Espacio en blanco para mejorar diseño

        }
        while(opcion != 4);
    }
}
