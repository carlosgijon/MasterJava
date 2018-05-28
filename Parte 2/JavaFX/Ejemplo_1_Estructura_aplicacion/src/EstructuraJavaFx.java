import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;

public class EstructuraJavaFx extends Application {
    public static void main(String[] args) {
        System.out.println("Iniciando una aplicacion JavaFx");
        
        // Iniciar la aplicacion llamando a launch()
        launch(args);
    }
    
    // Se sobreescribe el método init()
    @Override
    public void init() {
        System.out.println("Estoy dentro del método init()");
    }
    
    // Se sobreescribe abstract start() (OBLIGATORIO)
    @Override
    public void start(Stage escenario) {
        System.out.println("Estoy dentro del método start()");
        
        // Se pone el titulo al escenario
        escenario.setTitle("Estructura de JavaFX");
        
        // Creamos un nodo raiz. En este caso utilizaremos FLowLayout
        FlowPane nodo_raiz = new FlowPane();
        
        // Creamos una escena
        Scene escena = new Scene(nodo_raiz, 300, 200);
        
        // Creamos una escena en el escenario
        escenario.setScene(escena);
        
        // Mostrar el escenario y la escena
        escenario.show();
    }
    
    // Sobreescribimos el método stop
    @Override
    public void stop() {
        System.out.println("Estoy dentro del método stop()");
    }
    
}
