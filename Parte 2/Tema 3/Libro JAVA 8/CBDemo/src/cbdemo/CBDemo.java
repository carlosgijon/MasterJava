/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbdemo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author carlos
 */
public class CBDemo implements ItemListener {
    
    JLabel lbl_seleccionada;
    JLabel lbl_cambiada;
    JCheckBox chb_alpha;
    JCheckBox chb_beta;
    JCheckBox chb_gamma;
    
    /**
     * @constructor crea una instancia de CBDemo
     */
    public CBDemo() {
        // Instrucciones obligatorias para la GUI
        JFrame jfrm = new JFrame("Ejemplo de checkbox");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(280,120);
        jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);

        // Se inicializan las etiquetas
        lbl_seleccionada = new JLabel("");
        lbl_cambiada = new JLabel("");

        // Se inicializan los checbox
        chb_alpha = new JCheckBox("alpha");
        chb_beta = new JCheckBox("beta");
        chb_gamma = new JCheckBox("gamma");

        // Se añaden los ItemListener ya que los checkbox funcionan asi
        chb_alpha.addItemListener(this);
        chb_beta.addItemListener(this);
        chb_gamma.addItemListener(this);

        // Se añaden los elementos al panel
        jfrm.add(chb_alpha);
        jfrm.add(chb_beta);
        jfrm.add(chb_gamma);
        jfrm.add(lbl_cambiada);
        jfrm.add(lbl_seleccionada);    

        // Mostrar el Frame
        jfrm.setVisible(true);
    }
    
    // Controlar los ItemListener
    @Override
    public void itemStateChanged(ItemEvent ie) {
        String texto = "";
        
        // Obtener una referencia de cuando un checkbox causa un evento
        JCheckBox chb = (JCheckBox) ie.getItem();
        
        // reportar que checkbox cambia
        if(chb.isSelected()) {
            lbl_cambiada.setText(chb.getText() + " ha sido seleccionada");
        }
        else {
            lbl_cambiada.setText(chb.getText() + " se ha quitado");
        }
        
        // reportar que todas las checkbox son seleccionadas
        if(chb_alpha.isSelected()) {
            texto += "Alpha ";
        }
        if(chb_beta.isSelected()) {
            texto += "Beta ";
        }
        if(chb_gamma.isSelected()) {
            texto += "Gamma ";
        }
        
        lbl_seleccionada.setText("CheckBox seleccionadas: " +texto);
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CBDemo();
        });
    }
    
}
