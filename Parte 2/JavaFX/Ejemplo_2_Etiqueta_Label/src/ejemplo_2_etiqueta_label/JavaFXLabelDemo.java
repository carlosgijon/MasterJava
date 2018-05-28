package ejemplo_2_etiqueta_label;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class JavaFXLabelDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    // Se sobreescribe el metodo start()
    @Override
    public void start(Stage escenario) {
        escenario.setTitle("Etiqueta en JavaFX");
        FlowPane nodo_raiz = new FlowPane();
        Scene escena = new Scene(nodo_raiz, 300, 200);
        escenario.setScene(escena);
        
        // Se crea una etiqueta
        Label etiqueta = new Label("JavaFX es una GUI potente");
        
        // Se añade la etiqueta a la escena
        nodo_raiz.getChildren().add(etiqueta);
        
        // Mostrar escenario y escena
        escenario.show();
    }
    
}
