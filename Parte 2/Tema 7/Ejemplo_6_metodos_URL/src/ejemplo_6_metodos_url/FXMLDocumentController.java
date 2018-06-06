/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_6_metodos_url;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.*;
import javafx.scene.control.Button;

/**
 *
 * @author carlos
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Label lbl_cabecera;
    @FXML
    private Label lbl_url_principal;
    @FXML
    private Label lbl_url_absoluta;
    @FXML
    private Label lbl_host;
    @FXML
    private Label lbl_puerto;
    @FXML
    private Label lbl_archivo;
    @FXML
    private Label lbl_error;
    @FXML
    private Button btn_URL;
    @FXML
    private Label lbl_protocolo;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        try {
            lbl_cabecera.setText("Datos del Host");
            
            URL url_principal = new URL("http://www.oracle.com/technetwork/java/index.html");
            lbl_url_principal.setText(url_principal.toString());
            
            URL url_absoluta = new URL(url_principal, "javase/downloads/index.html");
            lbl_url_absoluta.setText(url_absoluta.toString());
            
            lbl_host.setText(url_absoluta.getHost());
            lbl_puerto.setText(Integer.toString(url_absoluta.getPort()));
            lbl_archivo.setText(url_absoluta.getFile());
            lbl_protocolo.setText(url_absoluta.getProtocol());
            
        }
        catch(MalformedURLException exc_mal_url) {
            lbl_error.setText("Url mal formada");
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
