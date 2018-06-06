/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_5_clase_url;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.*;

/**
 *
 * @author carlos
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Label lbl_cabecera;
    @FXML
    private Button btn_URL;
    @FXML
    private Label lbl_URL;
    @FXML
    private Label lbl_error;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        try{
            URL url_principal = new URL("http://www.oracle.com/technetwork/java/index.html");
            
            // Juntar dos URLs
            URL url_absoluta = new URL(url_principal, "javase/downloads/index.html");
            
            // La printamos en las labels
            lbl_cabecera.setText("La URL formada es:");
            lbl_URL.setText(url_absoluta.toString());
            
        }
        catch(MalformedURLException exc_mal_URL) {
            lbl_error.setText("URL mal formada");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
