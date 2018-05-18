
package creartoolbar;

import javax.swing.*;

public class CrearToolBar extends JFrame {
    
    static JFrame ventana = new JFrame();
    
    // Creamos una toolbar con nombre y orientación horizontal
    static JToolBar barra_herramientas = new JToolBar("Barra de herramienta",0);
    static JButton btn_abrir = new JButton();
    static JButton btn_guardar = new JButton();
    static JButton btn_imprimir = new JButton();
    
    // añadir imagenes para los botones
    static ImageIcon icn_abrir = new ImageIcon("./abrir.png");
    static ImageIcon icn_guardar = new ImageIcon("./guardar.png");
    static ImageIcon icn_imprimir = new ImageIcon("./imprimir.png");

    public static void main(String[] args) {
        ventana.setTitle("Ejemplo de Toolbar");
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
        
        // le ponemos iconos a los botones
        btn_abrir.setIcon(icn_abrir);
        btn_guardar.setIcon(icn_guardar);
        btn_imprimir.setIcon(icn_imprimir);
        
        
        // Insertamos los componentes de las toolbar
        barra_herramientas.add(btn_abrir);
        barra_herramientas.add(btn_guardar);
        barra_herramientas.add(btn_imprimir);
        
        // Insertamos el toolbar en la ventana
        ventana.getContentPane().add(barra_herramientas);
        ventana.pack();
        ventana.setVisible(true);
    }  
}
