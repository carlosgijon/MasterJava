/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author carlos
 */
public class EjSwing extends JFrame {

    Button boton1, boton2,boton3,boton4,boton5;

    public EjSwing() {
        setLayout(new BorderLayout(20,20));
        
        // Se crea el botón que cambia a rojo y se le añade funcionalidad
        boton1 = new Button("Rojo");
        
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                // Al pulsar el fondo se pone rojo
                getContentPane().setBackground(Color.red);
            }
        });
        
        // Se añade el boton al panel, arriba.
        add(boton1, BorderLayout.NORTH);
        
        
        // Se crea el botón que cambia a verde y se le añade funcionalidad
        // Esta vez lo hago con expresión lambda
        boton2 = new Button("Verde");
        
        boton2.addActionListener((ActionEvent ae) -> {
            getContentPane().setBackground(Color.green);
        });
        
        // Se añade al panel, abajo.
        add(boton2, BorderLayout.SOUTH);
        
        // Se crea el botón que cambia a amarillo y se le añade funcionalidad
        // Esta vez lo hago sobreescribiendo la función.
        boton3 = new Button("Amarillo");
        
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                getContentPane().setBackground(Color.yellow);
            }
        });
        
        // Se añade al panel, en medio
        add(boton3, BorderLayout.CENTER);
        
        // Se crea el botón que cambia a azul y se le añade funcionalidad
        // Esta vez lo hago con expresión lambda
        boton4 = new Button("Azul");
        
        boton4.addActionListener((ActionEvent ae) -> {
            getContentPane().setBackground(Color.blue);
        });
        
        // Se añade al panel, a la derecha
        add(boton4, BorderLayout.EAST);
        
        // Se crea el botón que cambia a negro y se le añade funcionalidad
        // Esta vez sobreescribiendo la función
        boton5 = new Button("Negro");
        
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                getContentPane().setBackground(Color.black);
            }
        });
        
        // Se añade al panel, a la izquierda
        add(boton5,BorderLayout.WEST);
        
        // Se ajustan propiedades obligatorias del GUI
        setSize(300,200);
        setResizable(false);
        setLocation(100,100);
        setBackground(Color.cyan);
        setTitle("Ejemplo de Eventos");
        setVisible(true);

        // Añadimos un evento para cuando se cierre la ventana
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                dispose();
            }
        });
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new EjSwing();
        });
    }
    
}
