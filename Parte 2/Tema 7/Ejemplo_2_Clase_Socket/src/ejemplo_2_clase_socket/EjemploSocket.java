package ejemplo_2_clase_socket;

import java.net.*;
import java.io.*;
import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class EjemploSocket extends Application {
    
    Label lbl_texto;
    Button btn_socket;

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage escenario) {
        // Esqueleto de la GUI
        escenario.setTitle("Ejemplo de Socket");
        FlowPane nodo_raiz = new FlowPane(10,10);
        nodo_raiz.setAlignment(Pos.CENTER);
        Scene escena = new Scene(nodo_raiz, 300, 100);
        escenario.setScene(escena);
        
        // Inicializamos los elementos graficos
        lbl_texto = new Label("Aqui saldrá la información recibida");
        btn_socket = new Button("Crear socket");
        
        btn_socket.setOnAction((ae) -> {
            
            try {
                Socket mi_socket = new Socket();
                
                // Creamos un flujo para recibir datos
                BufferedReader datos = new BufferedReader(new InputStreamReader(mi_socket.getInputStream()));
                String texto;
                
                while((texto = datos.readLine())!= null) {
                    lbl_texto.setText(texto);
                }
                
                mi_socket.close();
            }
            catch(UnknownHostException uexc) {
                System.out.println("No encuentro el servidor");
            }
            catch(IOException iexc) {
                System.out.println("Error E/S");
            }
        });
        
        nodo_raiz.getChildren().addAll(
                btn_socket,
                lbl_texto
        );
        
        escenario.show();
        
    }
    
}
