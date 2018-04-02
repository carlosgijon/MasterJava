class MiClasePrueba {
    public int num;
    public String texto;

    // CONSTRUCTOR POR DEFECTO
    public MiClasePrueba() {
        num = 19;
        texto = "Clase de prueba para arrays";
    }
}

public class PruebaArray {
    public static void main(String[] args) {
/*      Esto no compilara, ya que el valor de numero es null

        int numero;

        System.out.println("El valor de numero es " +numero);*/

        int arrayNumeros[] = new int[5];
        System.out.println("El valor de uno de los elementos es " +arrayNumeros[2]);

        MiClasePrueba objeto_simple = new MiClasePrueba();
        System.out.println("Valor de objeto simple: " +objeto_simple.texto);

        MiClasePrueba objetos[] = new MiClasePrueba[5];  // Asi se crea un array de objetos
        /*  Esto no compilará, ya que hay que llamar al constructor para que no de excepcion NullPointerException

        System.out.println("Valor de unos de los objetos del array: " +objetos[2].texto);*/

        objetos[2] = new MiClasePrueba();
        System.out.println("Valor de unos de los objetos del array: " +objetos[2].texto);
    }
}
