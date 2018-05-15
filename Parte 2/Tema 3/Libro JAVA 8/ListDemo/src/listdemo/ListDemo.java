/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listdemo;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author carlos
 */
public class ListDemo implements ListSelectionListener {

    JList<String> lista;  // Se forma a partir de genéricos <String>
    JLabel etiqueta;
    JScrollPane panel_desplazamiento;
    
    // Creamos un array de nombres
    String nombres[] = {"Sherry", "Jon", "Rachel","Sasha", "Josselyn", "Randy","Tom", "Mary", "Ken","Andrew", "Matt", "Todd" };
    
    /**
     * @constructor hace todas las operaciones para hacer una GUI
     */
    ListDemo() {
        // Operaciones obligatorias para la GUI
        JFrame ventana = new JFrame("Demo de JList");
        ventana.setLayout(new FlowLayout());
        ventana.setSize(200,160);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Creamos la lista
        lista = new JList<String>(nombres);
        
        // Vamos a ajustar el modo de seleccion
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // Añadir la lista al panel con desplazamiento
        panel_desplazamiento = new JScrollPane(lista);
        
        // Ajustar el tamaño del Scroll Panel
        panel_desplazamiento.setPreferredSize(new Dimension(120,90));
        
        // mostrar la seleccion en la etiqueta
        etiqueta = new JLabel("Selecciona un nombre");
        
        // Se añade el controlador de seleccion
        lista.addListSelectionListener(this);
        
        //Se añade la lista y el panel a la ventana
        ventana.add(panel_desplazamiento);
        ventana.add(etiqueta);

        ventana.setVisible(true);
    }
    
    @Override
    public void valueChanged(ListSelectionEvent le) {
        // indice del item seleccionado
        int indice = lista.getSelectedIndex();
        
        // Mostrar seleccion si hay algún item seleccionado
        if(indice != -1) {
            etiqueta.setText("Seleccionada: " + nombres[indice]);
        }
        else {  // Se usa esto para que se escriba siempre un texto
            etiqueta.setText("Selecciona un nombre");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(() -> {
            new ListDemo();
        });
    }
}
