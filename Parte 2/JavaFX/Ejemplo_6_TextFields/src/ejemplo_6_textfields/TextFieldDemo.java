package ejemplo_6_textfields;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class TextFieldDemo extends Application {
    
    TextField tf_texto;
    Label lbl_respuesta;
    Button btn_nombre;
    Separator separador;

    public static void main(String[] args) {
        launch(args);
    }
    
    // Sobreescribimos start()
    @Override
    public void start(Stage escenario) {
        escenario.setTitle("Demo de TextField");
        FlowPane nodo_raiz = new FlowPane(10,10);
        nodo_raiz.setAlignment(Pos.CENTER);
        Scene escena = new Scene(nodo_raiz, 230, 140);
        escenario.setScene(escena);
        
        lbl_respuesta = new Label("Introduce nombre");
        
        // Creamos un boton que devuelva el nombre
        btn_nombre = new Button("Nombre");
        
        // Creamos el text field
        tf_texto = new TextField();
        
        // Ponemos el placeholder
        tf_texto.setPromptText("Introduce tu nombre");
        
        // Ponemos el numero de columnas
        tf_texto.setPrefColumnCount(15);
        
        // Creamos un evento con una expresión lambda para que al presionar
        // enter se escriba el texto en la etiqueta respuesta
        tf_texto.setOnAction((ae) -> {
            lbl_respuesta.setText("El nombre es " 
                    + tf_texto.getText());
        });
        
        // Creamos un evento con una expresión lambda para el boton
        btn_nombre.setOnAction((ae) -> {
            lbl_respuesta.setText("El nombre es " 
                    +tf_texto.getText());
        });
        
        // Introducimos un separado para que la GUI se vea mas bonita
        separador = new Separator();
        separador.setPrefWidth(180);
        
        // Añadir controles a la escena
        nodo_raiz.getChildren().addAll(
                tf_texto,
                btn_nombre,
                separador,
                lbl_respuesta
        );
        escenario.show();
    } 
}
