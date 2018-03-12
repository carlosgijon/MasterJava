/** Datos de factura.
 * Contiene todos los datos necesarios para rellenar la factura */
public class Factura {

    // Se pone una variable final, o lo que es lo mismo, una constante
    public final double PI;
    public static String TipoIva = "Iva del 16%";
    public String NombreTitular;
    public String ConceptoFactura;
    public double Precio;
    public double Total;
    public double Iva;

    // CONSTRUCTOR
    public Factura() {
        // Se mete la constante PI en constructor
        this.PI = 3.1416;
        this.NombreTitular = "Sin titular";
        this.ConceptoFactura = "Sin concepto";
        this.Precio = 0.0;
        this.Iva = 0.0;
        this.Total = 0.0;
    }
}
