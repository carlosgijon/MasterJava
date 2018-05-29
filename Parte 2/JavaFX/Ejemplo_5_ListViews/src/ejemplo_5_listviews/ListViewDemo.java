package ejemplo_5_listviews;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.beans.value.*;
import javafx.collections.*;

public class ListViewDemo extends Application {
    
    Label lbl_respuesta;

    public static void main(String[] args) {
        launch(args);
    }
    
    // Sobreescribimos el método start()
    @Override
    public void start(Stage escenario) {
        escenario.setTitle("ListViews en JavaFX");
        FlowPane nodo_raiz = new FlowPane(Orientation.VERTICAL,10,10);
        nodo_raiz.setAlignment(Pos.CENTER);
        Scene escena = new Scene(nodo_raiz, 400, 200);
        escenario.setScene(escena);
        
        // Asignamos lbl_respuesta
        lbl_respuesta = new Label("Selecciona el tipo de aparato");
        
        // Crear un objeto OBservableList con las entradas
        ObservableList<String> tipos_aparatos =
                FXCollections.observableArrayList(
                        "Smartphone",
                        "Tablet",
                        "Portatil",
                        "Sobremesa");
        
        // Crear el ListView, se le pasa al constructor la lista que hemos
        // creado antes (tipos_aparatos)
        ListView<String> lvw_aparatos = new ListView<String>(tipos_aparatos);
        
        // Se ajusta el ancho y alto de la lista
        lvw_aparatos.setPrefSize(300, 70);
        
        // Se configura el modelo de seleccion de la lista (multiple seleccion)
        MultipleSelectionModel<String> lvw_modelo_seleccion = lvw_aparatos.getSelectionModel();
        
        // Se configura el listener
        lvw_modelo_seleccion.selectedItemProperty().addListener(new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> cambiado,
                        String valor_viejo, String valor_nuevo) {
                    // Mostrar la selección
                    lbl_respuesta.setText("Aparato seleccionado: " +valor_nuevo);
                }
            });
        
        nodo_raiz.getChildren().addAll(lvw_aparatos, lbl_respuesta);
        
        escenario.show();
    }
    
}
