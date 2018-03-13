import java.io.*;

public class ValidacionMail {

    public static void main(String[] args) throws IOException {

        // VARIABLES
        BufferedReader entradaMail = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduzca su email: ");
        String email = entradaMail.readLine(),dominioConPunto, dominio;
        int posicionArroba, longitudEmail, posicionPunto, posicionEspacio, caracteresDominio, posicionPuntoDominio;



        longitudEmail = email.length();
        posicionArroba = email.indexOf('@');
        posicionPunto = email.indexOf('.');
        posicionEspacio = email.indexOf(' ');

        // Comprueba si se ha introducido la @
        if(posicionArroba == -1 ) {
            System.out.println("No ha introducido \"@\"");
        }
        // Comprueba si hay dos arrobas
        else if (posicionArroba != email.lastIndexOf('@')) {
            System.out.println("No puede haber dos \"@\" ");
        }
        // Comprueba si la arroba esta al principio o al final
        else if (posicionArroba == 0 || posicionArroba == longitudEmail - 1) {
            System.out.println("La \"@\" no puede estar ni al principio ni al final");
        }
        // Comprueba si el correo tiene punto
        else if (posicionPunto == -1) {
            System.out.println("El email debe contener un \".\"");
        }
        // Comprueba si hay dos puntos juntos
        else if (email.indexOf("..") != -1) {
            System.out.println("no puede haber \".\" juntos ");
        }
        // @ y . no pueden estar juntos ni por delante ni por detras
        else if (posicionArroba == posicionPunto -1 || posicionArroba == posicionPunto +1) {
            System.out.println("\"@\" y \".\" no pueden estar juntos");
        }
        // No puede haber espacios
        else if (posicionEspacio != -1) {
            System.out.println("no puede haber espacios");
        }
        // El dominio solo puede tener de 2 a 4 caracteres
        else {
            // Vamos a sacar el dominio y el número de caracteres
            dominioConPunto = email.substring(posicionArroba);
            posicionPuntoDominio = dominioConPunto.lastIndexOf('.');
            dominio = dominioConPunto.substring(posicionPuntoDominio + 1);
            caracteresDominio = dominio.length();
            if (caracteresDominio <= 2 || caracteresDominio >= 4) {
                System.out.println("El dominio tiene que tener entre 2 y 4 letras. el dominio ." +dominio+ " no es válido");
            }
            else {
                // El email es correcto
                System.out.println("El email es CORRECTO!!!");
                System.exit(0);
            }
        }
    }
}
