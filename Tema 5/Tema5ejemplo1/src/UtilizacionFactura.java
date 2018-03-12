public class UtilizacionFactura {
    public static void main(String[] args) {
        Factura f1 = new Factura();
        f1.NombreTitular = "Adrian Ramos";
        f1.ConceptoFactura = "Ipad";
        f1.Precio = 540;
        f1.Iva = 30;
        f1.Total = 570;

        System.out.println("Datos de la factura numero 1");
        System.out.println("Nombre Titular:     " + f1.NombreTitular);
        System.out.println("Concepto Factura:   " + f1.ConceptoFactura );
        System.out.println("Precio:             " + f1.Precio);
        System.out.println("Iva:                " + f1.Iva);
        System.out.println("Total:              " +f1.Total);
        System.out.println("-----------------------------------------------");

        Factura f2 = new Factura();
        f2.NombreTitular = "Lucia Serrano";
        f2.ConceptoFactura = "PSP";
        f2.Precio = 169;
        f2.Iva = 15;
        f2.Total = 184;

        System.out.println("Datos de la factura numero 2");
        System.out.println("Nombre Titular:     " + f2.NombreTitular);
        System.out.println("Concepto Factura:   " + f2.ConceptoFactura );
        System.out.println("Precio:             " + f2.Precio);
        System.out.println("Iva:                " + f2.Iva);
        System.out.println("Total:              " +f2.Total);
        System.out.println("-----------------------------------------------");
    }
}
