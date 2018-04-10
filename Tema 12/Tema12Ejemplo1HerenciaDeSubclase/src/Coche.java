public class Coche {
    // MIEMBROS
    protected int numero_marchas;
    private String marca;
    private String modelo;
    protected int velocidad_maxima;
    private int velocidad;

    // CONSTRUCTOR
    public Coche() {
        this.numero_marchas = 5;
        this.marca = "";
        this.modelo = "";
        this.velocidad_maxima = 160;
        this.velocidad = 0;
        System.out.println("Construyendo un coche");
        System.out.println("La velocidad máxima es: " + this.velocidad_maxima);
    }

    // MÉTODOS
    public void acelerar_coche() {
        if(this.velocidad < this.velocidad_maxima) {
            this.velocidad += 40;
            System.out.println("Su velocidad actual es " +this.velocidad);
        }
        else {
            System.out.println("Velocidad maxima alcanzada: " +this.velocidad_maxima);
            this.velocidad = this.velocidad_maxima;
            System.out.println("Su velocidad actual es " +this.velocidad);
        }
    }

    public void frenar_coche() {
        if(this.velocidad > 0) {
            this.velocidad -= 40;
            System.out.println("Su velocidad actual es " +this.velocidad);
        }
        else {
            System.out.println("El coche esta detenido");
            this.velocidad = 0;
            System.out.println("Su velocidad actual es " +this.velocidad);
        }
    }

    public void mostrar_menu() {
        System.out.println("-------------------------------");
        System.out.println("1.- Acelerar");
        System.out.println("2.- Frenar");
        System.out.println("3.- Salir");
        System.out.println("Seleccione una opcion");
        System.out.println("-------------------------------");
    }

    // SETTERS
    public void setMarca(String m) {
        this.marca = m;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // GETTERS
    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
