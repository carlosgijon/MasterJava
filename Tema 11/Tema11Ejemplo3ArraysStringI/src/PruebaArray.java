public class PruebaArray {
    public static void main(String[] args) {
        char[] letras = {'a', 'e', 'i', 'o', 'u'};
        char[] letras_Unicode = {100, 105, 125, 157, 89};
        String texto = new String(letras);

        System.out.println(letras);
        System.out.println(texto);
        System.out.println(letras_Unicode);

        System.out.println("Un elemento del conjunto CHAR: " +letras[1]);
        System.out.println("Un elemento del conjunto STRING: " +texto.charAt(2));
        System.out.println("Un elemento CHAR en Unicode: " +letras_Unicode[1]);
    }
}
