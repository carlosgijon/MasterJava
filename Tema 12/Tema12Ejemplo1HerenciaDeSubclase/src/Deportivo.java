public class Deportivo  extends Coche {
    // CONSTRUCTOR
    public Deportivo() {
        this.numero_marchas = 6;
        super.velocidad_maxima += 80;
        System.out.println("la velocidad máxima de un deportivo es " +this.velocidad_maxima);
    }

    // MÉTODOS
    public void cambiar_marcha() {
        System.out.println("Cambio de marchas en deportivo");
    }

    public void mostrar_menu() {
        System.out.println("-------------------------------");
        System.out.println("1.- Acelerar");
        System.out.println("2.- Frenar");
        System.out.println("3.- Cambiar de marcha");
        System.out.println("4.- Salir");
        System.out.println("Seleccione una opcion");
        System.out.println("-------------------------------");
    }
}
