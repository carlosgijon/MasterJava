/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_4_metodos_socket_timeout;

import java.net.URL;
import java.net.*;
import java.io.*;
import java.util.*;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author carlos
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Label lbl_hora_madrid;
    @FXML
    private Label lbl_hora_washington;
    @FXML
    private Label lbl_error;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        try {
            lbl_hora_madrid.setText("La hora en Madrid es " +new Date());
            
            // Utilizo el puerto 13 porque da la hora
            Socket mi_socket = new Socket("www.whitehouse.net",13);
            
            // Utilizo un timeout de 10 s por si no conecta
            mi_socket.setSoTimeout(1000);
            
            // Abrimos flujo de comunicación
            BufferedReader entrada_datos = new BufferedReader(new InputStreamReader(mi_socket.getInputStream()));
            
            System.out.println(mi_socket.getInputStream());
            
            // Mostramos lo que nos llegará
            lbl_hora_washington.setText(entrada_datos.readLine());
        
        }
        catch(InterruptedIOException exc_interrupted) {
            lbl_error.setText("Time out!!!");
            exc_interrupted.printStackTrace();
        }
        catch(IOException exc_io) {
            lbl_error.setText("Error E/S");
            exc_io.printStackTrace();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
