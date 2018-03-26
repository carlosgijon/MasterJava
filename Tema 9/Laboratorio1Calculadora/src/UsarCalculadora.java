import java.io.*;

class Calculadora {

    private int numero1, numero2;

    /*
    CONSTRUCTOR SIN PARAMETROS.
    * Inicializa todos los numeros a 0 para evitar un null exception*/
    Calculadora() {
        numero1 = 0;
        numero2 = 0;
    }

    /*
    * CONSTRUCTOR CON DOS PARAMETROS.
    * Inicializa numero1 y numero2.*/
    Calculadora(int n1, int n2) {
        numero1 = n1;
        numero2 = n2;
    }

    /*SUMAR DOS VALORES.
    * Suma las variables numero1 mas numero2*/
    public int sumar() {
        return (numero1 + numero2);
    }

    /*RESTAR DOS VALORES.
    * Resta las variables numero1 menos numero2*/
    public int restar() {
        return (numero1 - numero2);
    }

    /*MULTIPLICAR DOS VALORES.
    * Multiplica las variables numero1 por numero2*/
    public int multiplicar() {
        return (numero1 * numero2);
    }

    /*DIVIDIR DOS VALORES.
     * divide las variables numero1 entre numero2*/
    public int dividir() {
        return (numero1 / numero2);
    }

    /*RESTO DE DOS VALORES.
    * Devuelve el resto de la división de numero1 entre numero2*/
    public int resto() {
        return (numero1 % numero2);
    }

    /*NUMERO ALEATORIO.
    * Devuelve un numero aleatorio con el rango que se le pasa por parametro. ejemplo rango: 100*/
    public static int numeroAleatorio(int rango) {
        return (int)(Math.random() * rango);
    }

    /*NUMERO MAYOR DE DOS NUMEROS.
    * Método estático que devuelve el número mayor de dos número*/
    public static int numeroMayor(int n1, int n2) {
        return Math.max(n1,n2);
    }

    /*NUMERO MAYOR DE TRES NUMEROS.
    * Método estático que devuelve el número mayor de tres número*/
    public static int numeroMayor(int n1, int n2, int n3) {
        int numeroMayor;
        if(n1 > n2 && n1 > n3) {
            numeroMayor = n1;
        }
        else if(n2 > n1 && n2 > n3) {
            numeroMayor = n2;
        }
        else {
            numeroMayor = n3;
        }
        return numeroMayor;
    }
    /*POTENCIA
    * Método que devuelve la potencia de numero1 elevado a numero2*/
    public int potencia() {
        return (int)Math.pow(numero1, numero2);
    }

    /*COMPROBAR FORMATO NÚMERO.
    * Devuelve true si es un número y false si no lo es*/
    private boolean esNumero(int entrada) throws IOException {
        try {
           return true;
        }
        catch(NumberFormatException exc) {
            return false;
        }
    }

    /*MOSTRAR MENU
    * Muestra el menu gráfico de la aplicación. No hace operaciones sobre el */
    public static void mostrarMenu() {
        System.out.println("====================================================");
        System.out.println("=                                                  =");
        System.out.println("=                 MENU CALCULADORA                 =");
        System.out.println("=                                                  =");
        System.out.println("====================================================");
        System.out.println("=                                                  =");
        System.out.println("= 1.- Sumar                                        =");
        System.out.println("= 2.- Restar                                       =");
        System.out.println("= 3.- Multiplicar                                  =");
        System.out.println("= 4.- Dividir                                      =");
        System.out.println("= 5.- Resto                                        =");
        System.out.println("= 6.- Mayor de dos números                         =");
        System.out.println("= 7.- Mayor de tres números                        =");
        System.out.println("= 8.- Potencia                                     =");
        System.out.println("= 9.- Número aleatorio                             =");
        System.out.println("= 0.- SALIR                                        =");
        System.out.println("=                                                  =");
        System.out.println("= Seleccione una opción:                           =");
        System.out.println("====================================================");
    }

}

public class UsarCalculadora {
    public static void main(String[] args) throws IOException{
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("introduzca un número: ");
        int num1 = Integer.parseInt(entradaTeclado.readLine());

        System.out.println("introduzca otro número: ");
        int num2 = Integer.parseInt(entradaTeclado.readLine());
        Calculadora c = new Calculadora(num1, num2);

        int opcion;

        do {
            Calculadora.mostrarMenu();
            opcion = Integer.parseInt(entradaTeclado.readLine());
            switch (opcion) {
                case 1:
                    System.out.println("La suma de " +num1+ " mas " +num2+ " es " +c.sumar());
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("La resta de " +num1+ " menos " +num2+ " es " +c.restar());
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("El producto de " +num1+ " por " +num2+ " es " +c.multiplicar());
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("La división de " +num1+ " entre " +num2+ " es " +c.dividir());
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("El resto de dividir " +num1+ " entre " +num2+ " es " +c.resto());
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("El mayor entre " +num1+ " y " +num2+ " es " +Calculadora.numeroMayor(num1,num2));
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Introduzca el tercer número:");
                    int num3 = Integer.parseInt(entradaTeclado.readLine());
                    System.out.println("El mayor entre " +num1+ ", " +num2+ " y " +num3+ " es " +Calculadora.numeroMayor(num1,num2, num3));
                    System.out.println("");
                    break;
                case 8:
                    System.out.println(num1+ " elevado a " +num2+ " es igual a " +c.potencia());
                    System.out.println("");
                    break;
                case 9:
                    System.out.println("introduce el numero máximo hasta donde generar el aleatorio:");
                    int rng = Integer.parseInt(entradaTeclado.readLine());
                    System.out.println("Se genera el numero aleatorio " +Calculadora.numeroAleatorio(rng));
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("Se va a salir de la aplicación");
                    System.exit(0);
                default:
                    System.out.println("Has introducido una opcion no válida. Prueba con un numero de 0 a 9");
                    break;
            }

            String volverAOperar;

            do {
                System.out.println("¿Desea hacer otra operación (S/N)?");
                volverAOperar = (entradaTeclado.readLine()).toUpperCase();

                if(volverAOperar.equals("N")) {
                    System.out.println("Se va a salir del programa");
                    System.exit(0);
                }
                else if(volverAOperar.equals("S")) {
                    System.out.println("Pues vamos a por otra operación...");
                    break;
                }
                else {
                    System.out.println("No has introducido una opcion valida, debes introducir S o N (en minusculas tambien vale)");
                }
            } while (!(volverAOperar.toUpperCase()).equals("S") || !(volverAOperar.toUpperCase()).equals("N"));


        }while(opcion != 0);
    }
}
