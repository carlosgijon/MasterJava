/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingfc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

/**
 *
 * @author carlos
 */
public class SwingFC implements ActionListener {
    JTextField tf_archivo_1;  // nombre del primer archivo
    JTextField tf_archivo_2;  // nombre del segundo archivo
    JButton btn_comparar;  // boton para comparar los archivos
    JLabel lbl_1, lbl_2;   // muestra la salida de los archivos
    JLabel lbl_resultado;  // muestra el resultado
    
    /**
     * @constructor
     */
    public SwingFC() {
        // Operaciones obligatorias para la GUI
        JFrame ventana = new JFrame("Comparar archivos");
        ventana.setLayout(new FlowLayout());
        ventana.setSize(250,190);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Creamos los textFields para los nombres de los archivos
        tf_archivo_1 = new JTextField(14);
        tf_archivo_2 = new JTextField(14);
        
        // Se ajustan los actionCommands
        tf_archivo_1.setActionCommand("archivo1");
        tf_archivo_2.setActionCommand("archivo2");
        
        // Se crea el boton para comparar los archivos
        btn_comparar = new JButton("Comparar");
        
        // Se añade el action Listener para el boton
        btn_comparar.addActionListener(this);
        
        // Se crean las etiquetas
        lbl_1 = new JLabel("Primer archivo");
        lbl_2 = new JLabel("Segundo archivo");
        lbl_resultado = new JLabel("");
        
        // Se añaden los componentes al content Pane en orden
        ventana.add(lbl_1);
        ventana.add(tf_archivo_1);
        ventana.add(lbl_2);
        ventana.add(tf_archivo_2);
        ventana.add(btn_comparar);
        ventana.add(lbl_resultado);
        
        // Mostrar la ventana
        ventana.setVisible(true);
    }
    
    // Comparar los archivos cuando se presione el boton
    @Override
    public void actionPerformed(ActionEvent ae) {
        int i = 0, j = 0;
        
        // Confirmar que se han rellenado los nombres
        if(tf_archivo_1.getText().equals("")) {
            lbl_resultado.setText("Falta el nombre del primer archivo");
            return;
        }
        if(tf_archivo_2.getText().equals("")){
            lbl_resultado.setText("Falta el nombre del segundo archivo");
            return;
        }
        
        // Comparar archivos
        try {
            FileInputStream f1 = new FileInputStream(tf_archivo_1.getText());
            FileInputStream f2 = new FileInputStream(tf_archivo_2.getText());
            
            // Chequear el contenido de cada archivo
            do {
                i = f1.read();
                j = f2.read();
                if(i != j) break;
            }
            while(i != -1 && j != -1);
            
            if(i != j) {
                lbl_resultado.setText("Los archivos NO son iguales");
            }
            else {
                lbl_resultado.setText("Los archivos SON IGUALES");
            }
        }
        catch(IOException iexc) {
            lbl_resultado.setText("Error en el archivo");
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
                new SwingFC();
            }
        });
    }
}
