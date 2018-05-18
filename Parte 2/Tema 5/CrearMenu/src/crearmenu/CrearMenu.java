/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crearmenu;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author carlos
 */
public class CrearMenu {
    
    /**
     * @constructor
     */
    public CrearMenu() {
        JFrame ventana = new JFrame("Ejemplo de menu");
        ventana.setLayout(new FlowLayout());
        ventana.setSize(150,50);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Creamos el menu bar y sus componentes
        JMenuBar barra_menu = new JMenuBar();
        
        JMenu menu_archivo = new JMenu("Archivo");
        JMenu menu_editar = new JMenu("Editar");
        
        // Añadimos los componentes al menu
        barra_menu.add(menu_archivo);
        barra_menu.add(menu_editar);
        
        // Ahora creamos los submenus con JMenuItem
        JMenuItem menu_item_guardar = new JMenuItem("Guardar");
        JMenuItem menu_item_guardar_como = new JMenuItem("Guardar como");
        JMenuItem menu_item_imprimir = new JMenuItem("Imprimir");
        JMenuItem menu_item_cerrar = new JMenuItem("Cerrar");
        
        // Los añadimos al menu archivo
        menu_archivo.add(menu_item_guardar);
        menu_archivo.add(menu_item_guardar_como);
        menu_archivo.add(menu_item_imprimir);
        menu_archivo.add(new JSeparator());  // Un separador
        menu_archivo.add(menu_item_cerrar);
        
        // Añadimos el menu al Frame
        ventana.add(barra_menu);
        
       // Hacer la ventana visible
       ventana.setVisible(true);
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CrearMenu();
        });
    }
    
}
