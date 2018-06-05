package laboratorio_1_metodos_inetaddress;

import java.net.*;
import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class MetodosInetAddress extends Application {
    Button btn_datos;
    
    Label lbl_cabecera,
          lbl_host_completo,
          lbl_hostname,
          lbl_ip,
          lbl_getByName,
          lbl_array_ip;
    

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage escenario) {
        // Esqueleto para GUI
        escenario.setTitle("métodos clase InetAddress");
        FlowPane nodo_raiz = new FlowPane(Orientation.VERTICAL, 10, 10);
        nodo_raiz.setAlignment(Pos.CENTER);
        Scene escena = new Scene(nodo_raiz, 700, 700);
        escenario.setScene(escena);
        
        // Inicializamos las etiquetas
        lbl_cabecera = new Label("Presione el boton para obtener info del host");
        lbl_host_completo = new Label("Aqui sale toda la información");
        lbl_hostname = new Label("Aqui sale el hostname");
        lbl_ip = new Label("Aqui sale la ip");
        lbl_getByName = new Label("Resultado de getHostname");
        lbl_array_ip = new Label("Resultado del array con la ip");
        
        btn_datos = new Button("Obtener datos");

        // Funcionalidad del boton
        btn_datos.setOnAction((ae) -> {
            
            try {
                InetAddress mi_equipo = InetAddress.getLocalHost();
                
                lbl_host_completo.setText(mi_equipo.toString());
                
                String nombre_equipo = mi_equipo.getHostName();
                lbl_hostname.setText(nombre_equipo);
                
                lbl_ip.setText(mi_equipo.getHostAddress());
                
                lbl_getByName.setText(mi_equipo.getByName(nombre_equipo).toString());
                
                // OPERACION CON ARRAY PARA SACAR LA IP
                final byte[] array_ip = mi_equipo.getAddress();
                String texto_array_ip = "";
                
                for(int i = 0; i < array_ip.length; i++) {
                    
                    // Hago este bloque if- else porque presenta los datos mal
                    // Los dos digitos primeros los presenta en negativo
                    if(i < (array_ip.length - 2)) {
                        texto_array_ip += (array_ip[i] + 256);
                    }
                    else {
                        texto_array_ip += array_ip[i];
                    }
                    
                    if(i < (array_ip.length - 1)) {
                        texto_array_ip += ".";
                    }
                }
                
                lbl_array_ip.setText(texto_array_ip);
                
            }
            catch(UnknownHostException uexc) {
                System.out.println("No se encuentra el servidor");
            }
        });
        
        // Añadir todos los elementos al nodo raiz
        nodo_raiz.getChildren().addAll(
                lbl_cabecera,
                lbl_host_completo,
                lbl_hostname,
                lbl_ip,
                lbl_getByName,
                lbl_array_ip,
                btn_datos
        );
        
        // Mostrar ventana
        escenario.show();
        
    }
    
}
