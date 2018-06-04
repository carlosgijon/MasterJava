package ejemplo_3_eventos_button;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class EventosDemo extends Application {
    
    Label lbl_etiqueta;

    public static void main(String[] args) {
        launch(args);
    }
    
    // Sobreescribimos el metodo start()
    @Override
    public void start(Stage escenario) {
        escenario.setTitle("Usando Botones en JavaFx");
        FlowPane nodo_raiz = new FlowPane(10,10);
        nodo_raiz.setAlignment(Pos.CENTER);
        Scene escena = new Scene(nodo_raiz, 300, 100);
        escenario.setScene(escena);
        
        lbl_etiqueta = new Label("Presiona un botón");
        
        // Creamos dos botones
        Button btn_arriba = new Button("arriba");
        Button btn_abajo = new Button("abajo");
        
        // Asignamos los eventos a cada botón, primero con clase interna
        // y despues con expresión lambda
        
        // Clase interna
        btn_arriba.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                lbl_etiqueta.setText("has presionado botón arriba");
            }
        });
        
        // Con expresión Lambda
        btn_abajo.setOnAction((ActionEvent ae) -> {
            lbl_etiqueta.setText("Has presionado botón abajo");
        });
        
        // Añadir a la escena los elementos gráficos
        nodo_raiz.getChildren().addAll(btn_arriba, btn_abajo,lbl_etiqueta);
        
        
        // Mostrar escenario
        escenario.show();
    }
}
