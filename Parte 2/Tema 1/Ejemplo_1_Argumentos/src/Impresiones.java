// Programa para printar argumentos

public class Impresiones {
    public static void main(String[] args) {
        int cnt = 0;

        System.out.println("*******************************************");
        System.out.println("*         Impresión de argumentos         *");
        System.out.println("*******************************************");

        while(cnt < args.length) {
            System.out.print("Argumento " +(cnt + 1)+ ": ");
            System.out.println(args[cnt]);
            cnt++;
        }
    }
}
