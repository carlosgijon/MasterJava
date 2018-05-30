package ejemplo_7_efectos_y_transformaciones;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.transform.*;
import javafx.scene.effect.*;
import javafx.scene.paint.*;

public class EfectosTransformacionDemo extends Application{
    
    double angulo = 0.0;
    double factor_escala = 0.4;
    double valor_blur = 1.0;
    
    // Creamos efectos y transformaciones iniciales
    Reflection fx_reflejo = new Reflection();
    BoxBlur fx_blur = new BoxBlur(1.0, 1.0, 1);
    Rotate fx_rotar = new Rotate();
    Scale fx_escalar = new Scale(factor_escala, factor_escala);
    
    // Creamos los botones
    Button btn_rotar = new Button("Rotar");
    Button btn_blur = new Button("Blur off");
    Button btn_escala = new Button("Escalar");
    
    Label lbl_reflejo = new Label("Esta cadena muestra reflejo");

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage escenario) {
        escenario.setTitle("Demo de efectos y transformaciones");
        FlowPane nodo_raiz = new FlowPane(20,20);
        nodo_raiz.setAlignment(Pos.CENTER);
        Scene escena = new Scene(nodo_raiz, 300, 120);
        escenario.setScene(escena);
        
        // Añadir transformaciones a los botones
        btn_rotar.getTransforms().add(fx_rotar);
        btn_escala.getTransforms().add(fx_escalar);
        
        // Añadir efecto reflejo a la etiqueta
        fx_reflejo.setTopOpacity(0.7);
        fx_reflejo.setBottomOpacity(0.3);
        lbl_reflejo.setEffect(fx_reflejo);
        
        // Controlar eventos para el boton que rota
        btn_rotar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                angulo += 15.0;
                
                fx_rotar.setAngle(angulo);
                fx_rotar.setPivotX(btn_rotar.getWidth() / 2);
                fx_rotar.setPivotX(btn_rotar.getHeight() / 2);
            }
        });
        
        // Controlar eventos para el boton que se escala
        btn_escala.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                factor_escala += 0.1;
                if(factor_escala > 2.0) factor_escala = 0.4;
                
                fx_escalar.setX(factor_escala);
                fx_escalar.setY(factor_escala);
            }
        });
        
        // Controlar eventos del boton con blur
        btn_blur.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(valor_blur == 10.0) {
                    valor_blur = 1.0;
                    btn_blur.setEffect(null);
                    btn_blur.setText("Blur off");
                }
                else {
                    valor_blur++;
                    btn_blur.setEffect(fx_blur);
                    btn_blur.setText("Blur on");
                }
                
                fx_blur.setWidth(valor_blur);
                fx_blur.setHeight(valor_blur);
            }
        });
        
        nodo_raiz.getChildren().addAll(
            btn_rotar,
            btn_escala,
            btn_blur,
            lbl_reflejo
        );
        
        escenario.show();
    }
}
