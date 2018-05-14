/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfdemo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author carlos
 */
public class TFDemo implements ActionListener {
    
    JTextField tf_texto;
    JButton btn_rev;
    JLabel lbl_prompt, lbl_contenidos;
    
    /**
     * @constructor constructor de la clase
     */
    TFDemo() {
        // Se crea un JFrame
        JFrame jfrm = new JFrame("Uso de TextField");
        
        // Se especifica FlowLayout como layout
        jfrm.setLayout(new FlowLayout());
        
        // Tamaño inicial del Frame
        jfrm.setSize(240,120);
        
        // Determinar comportamiento de cierre de la ventana
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Se crea un JTextField
        tf_texto = new JTextField(10);
        
        // Se asigna un action command a ese TextField
        tf_texto.setActionCommand("mi_tf");
        
        // Se crea un boton "reverse"
        btn_rev = new JButton("al reves");
        
        // Se añaden los ActionListener
        tf_texto.addActionListener(this);
        btn_rev.addActionListener(this);
        
        // Se llama al constructor para cada etiqueta
        lbl_prompt = new JLabel("Introduce texto:");
        lbl_contenidos = new JLabel("");
        
        // Añadir los componentes al frame
        jfrm.add(tf_texto);
        jfrm.add(btn_rev);
        jfrm.add(lbl_prompt);
        jfrm.add(lbl_contenidos);
        
        // Mostrar el Frame
        jfrm.setVisible(true);
    }
    
    // Controlar los ActionEvents
    /**
     * @param ae 
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        // Si se presiona el btn_rev
        if(ae.getActionCommand().equals("Reverse")) {
            String texto_tf_texto = tf_texto.getText();
            String rev_texto_tf_texto = "";
            
            // Poner la cadena al reves
            for(int i = texto_tf_texto.length() - 1; i >= 0; i--) {
                rev_texto_tf_texto += texto_tf_texto.charAt(i);
            }
            
            // Guardar el texto al reves
            tf_texto.setText(rev_texto_tf_texto);
        }
        else {
        lbl_contenidos.setText("Has presionado ENTER. El texto es: " + tf_texto.getText());
        }  
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TFDemo();
            }
        });
    }
    
}
