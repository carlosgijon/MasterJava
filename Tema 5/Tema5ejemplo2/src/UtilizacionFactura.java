public class UtilizacionFactura {
    public static void main(String[] args) {
        Factura f1 = new Factura();

        System.out.println("Datos de la factura CONSTRUIDA");
        System.out.println("Nombre Titular:     " + f1.NombreTitular);
        System.out.println("Concepto Factura:   " + f1.ConceptoFactura );
        System.out.println("Precio:             " + f1.Precio);
        System.out.println("Iva:                " + f1.Iva);
        System.out.println("Total:              " + f1.Total);
        System.out.println("-----------------------------------------------");
    }
}
