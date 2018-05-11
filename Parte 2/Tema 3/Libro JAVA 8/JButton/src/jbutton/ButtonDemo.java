/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbutton;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author carlos
 */
public class ButtonDemo implements ActionListener {
    
    JLabel etiqueta;
    
    ButtonDemo() {
        // Creamos un contenedor JFrame
        JFrame jfrm = new JFrame("Un ejemplo de botones");
        
        // Especificamos un FlowLayout
        jfrm.setLayout(new FlowLayout());
        
        // declaramos las dimensiones del JFrame
        jfrm.setSize(500, 90);
        
        // Terminar el programa cuando se cierre la ventana
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Declaramos dos botones
        JButton btn_arriba = new JButton("arriba");
        JButton btn_abajo = new JButton("abajo");
        
        // Les añadimos los ActionListener
        btn_arriba.addActionListener(this);
        btn_abajo.addActionListener(this);
        
        // Se añaden los botones al content Pane
        jfrm.add(btn_arriba);
        jfrm.add(btn_abajo);
        
        // LLamamos al constructor para el objeto etiqueta
        etiqueta = new JLabel("Presiona un boton");
        
        // Añadir la etiquet
        jfrm.add(etiqueta);
        
        // Mostrar el frame
        jfrm.setVisible(true);
    }
    
    // Eventos de los botones
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("arriba")) {
            etiqueta.setText("Has presionado arriba");
        }
        else {
            etiqueta.setText("Has presionado abajo");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonDemo();
            }
        });
        
        //  Este código se haría con una expresión Lambda así:
        //
        // SwingUtilities.invokeLater(() -> {
        //    new ButtonDemo();
        // });
        
    }
    
}
