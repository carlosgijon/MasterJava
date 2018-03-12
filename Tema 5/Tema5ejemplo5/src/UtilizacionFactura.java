public class UtilizacionFactura {
    public static void main(String[] args) {
        Factura f1 = new Factura();
        f1.NombreTitular = "Adrian Ramos";

        System.out.println("Datos de la factura 1");
        System.out.println("Nombre Titular:     " + f1.NombreTitular);
        System.out.println("Valor de PI:        " + f1.PI);
        System.out.println("-----------------------------------------------");

        Factura f2 = new Factura();
        f2.NombreTitular = "Lucia Serrano";

        // Vamos a cambiar la variable estatica TipoIva
        Factura.TipoIva = "Iva 18%";

        System.out.println("Datos de la factura 2");
        System.out.println("Nombre Titular:     " + f2.NombreTitular);
        System.out.println("Valor de PI:        " + f1.PI);
        System.out.println("-----------------------------------------------");
    }
}
