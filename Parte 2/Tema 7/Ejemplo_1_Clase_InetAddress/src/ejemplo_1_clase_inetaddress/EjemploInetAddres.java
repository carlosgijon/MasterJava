package ejemplo_1_clase_inetaddress;

import java.net.*;
import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class EjemploInetAddres extends Application {
    
    Label lbl_host;
    Button btn_host;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage escenario)  {
        escenario.setTitle("Prueba InetAddress");
        FlowPane nodo_raiz = new FlowPane(10,10);
        nodo_raiz.setAlignment(Pos.CENTER);
        Scene escena = new Scene(nodo_raiz,250,100);
        escenario.setScene(escena);
        
        // Dejamos la etiqueta vacia
        lbl_host = new Label("");
        
        // Creamos el boton
        btn_host = new Button("Localhost");
        
        btn_host.setOnAction((ae) -> {
            try {
                InetAddress mi_maquina = InetAddress.getLocalHost();
                lbl_host.setText(mi_maquina.toString());
            }
            catch(UnknownHostException uexc) {
                lbl_host.setText("No encuentro el server");
            }
        });
        
        // Añadir a la escena los elementos gráficos
        nodo_raiz.getChildren().addAll(btn_host, lbl_host);
        
        // Mostrar en pantalla
        escenario.show();
    }
    
}
