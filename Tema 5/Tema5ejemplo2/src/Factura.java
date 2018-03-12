public class Factura {
    public String NombreTitular;
    public String ConceptoFactura;
    public double Precio;
    public double Total;
    public double Iva;

    public Factura() {
        this.NombreTitular = "Sin titular";
        this.ConceptoFactura = "Sin concepto";
        this.Precio = 0.0;
        this.Iva = 0.0;
        this.Total = 0.0;
    }
}
