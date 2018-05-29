package ejemplo_4_checkbox;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class CheckBoxDemo extends Application {
    
    CheckBox chb_smartphone;
    CheckBox chb_tablet;
    CheckBox chb_portatil;
    CheckBox chb_sobremesa;
    
    Label lbl_respuesta;
    Label lbl_seleccionada;
    
    String ordenadores;

    public static void main(String[] args) {
        launch(args);
    }
    
    // Se sobreescribe el método start()
    @Override
    public void start(Stage escenario) {
        escenario.setTitle("CheckBoxes en JavaFx");
        
        // Se crea un FlowPane en vertical para los checbox, con una
        // separación de 10 px a lo alto y a lo ancho
        FlowPane nodo_raiz = new FlowPane(Orientation.VERTICAL, 10, 10);
        
        // Se centran el nodo en la escena
        nodo_raiz.setAlignment(Pos.CENTER);
        
        // Se crea la escena
        Scene escena = new Scene(nodo_raiz, 600, 200);
        
        // Se asigna la escena al escenario
        escenario.setScene(escena);
        
        Label cabecera = new Label("¿Que aparatos posées?");
        
        // Esta etiqueta dice el cambio que se hace en los checkbox
        lbl_respuesta = new Label("");
        
        // Esta etiqueta dice los checkbox que están seleccionados
        lbl_seleccionada = new Label("");
        
        // Creamos los checkboxes
        chb_smartphone = new CheckBox("Smartphone");
        // smartphone puede ser indeterminada
        chb_smartphone.setAllowIndeterminate(true);
        
        chb_tablet = new CheckBox("Tablet");
        chb_portatil = new CheckBox("Portatil");
        chb_sobremesa = new CheckBox("Sobremesa");
        
        // Asignamos los eventos para cada checkbox
        // Unos con clases internas anonimas y otros con lambdas
        
        // Con clase interna anonima
        chb_smartphone.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                if(chb_smartphone.isSelected()) {
                    lbl_respuesta.setText("se ha seleccionado Smartphone");
                }
                else if(chb_smartphone.isIndeterminate()) {
                    lbl_respuesta.setText("Smartphone es indeterminada");
                }
                else {
                    lbl_respuesta.setText("Se ha quitado Smartphone");
                }
                
                mostrar_todo();  // Se creará despues
            }
        });
        
        // Con lambda
        chb_tablet.setOnAction((ae) -> {
            if(chb_tablet.isSelected()) {
                lbl_respuesta.setText("Se ha seleccionado Tablet");
            }
            else {
                lbl_respuesta.setText("Se ha quitado Tablet");
            }
            
            mostrar_todo();
        });
        
        // Con clase anonima
        chb_portatil.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
               if(chb_portatil.isSelected()) {
                   lbl_respuesta.setText("Se ha seleccionado portatil");
               }
               else {
                   lbl_respuesta.setText("Se ha quitado portatil");
               }
               
               mostrar_todo();
            }
        });
        
        // Con lambda
        chb_sobremesa.setOnAction((ae) -> {
            if(chb_sobremesa.isSelected()) {
                lbl_respuesta.setText("Se ha seleccionado sobremesa");
            }
            else {
                lbl_respuesta.setText("Se ha quitado sobremesa");
            }
            
            mostrar_todo();
        });
        
        // Añadimos los controles a la escena en orden de visualización
        nodo_raiz.getChildren().addAll(
                cabecera,
                chb_smartphone,
                chb_tablet,
                chb_portatil,
                chb_sobremesa,
                lbl_respuesta,
                lbl_seleccionada
        );
        
        escenario.show();
        
        mostrar_todo();
    }
    
    // Añadir a la etiqueta las selecciones
    void mostrar_todo() {
        if(chb_smartphone.isSelected()) ordenadores = "Smartphone ";
        if(chb_tablet.isSelected()) ordenadores += "Tablet ";
        if(chb_portatil.isSelected()) ordenadores += "Portatil ";
        if(chb_sobremesa.isSelected()) ordenadores += "Sobremesa ";
        
        lbl_seleccionada.setText("Ordenadores seleccionados: " +ordenadores);
    }
    
}
