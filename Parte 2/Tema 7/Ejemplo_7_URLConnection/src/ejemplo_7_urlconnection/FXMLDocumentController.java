/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_7_urlconnection;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.*;
import java.net.*;

/**
 *
 * @author carlos
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button btn_conexion;
    @FXML
    private Label lbl_texto;
    @FXML
    private Label lbl_error;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        try {
            URL miUrl = new URL("http://www.marca.com");
            
            // Abrimos la conexion
            URLConnection miConexion = miUrl.openConnection();
            miConexion.setDoInput(true);
            
            // Probamos si ha sido modificada
            miConexion.setIfModifiedSince(100_000_000);
            
            // Nos conectamos
            miConexion.connect();
            
            // Abrimos un canal de entrada
            BufferedReader entradaDatos = new BufferedReader(new InputStreamReader(miConexion.getInputStream()));
            String cadena;
            
            while((cadena = entradaDatos.readLine())!= null) {
                lbl_texto.setText(cadena);
                System.out.println(cadena);
            }
        }
        catch(IOException exc_io) {
            lbl_error.setText("Error E/S");
        } 
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
