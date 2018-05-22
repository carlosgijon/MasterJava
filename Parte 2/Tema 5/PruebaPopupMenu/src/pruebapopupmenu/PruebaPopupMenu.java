package pruebapopupmenu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PruebaPopupMenu extends JFrame {
    private JLabel etiqueta;
    
    private JRadioButtonMenuItem elementos[];
    private final Color valores_color[] = {
        Color.BLUE,
        Color.YELLOW,
        Color.RED
    };
    private JPopupMenu menu_contextual;
    
    /**
     * @Constructor
     */
    public PruebaPopupMenu() {
        super("Ejemplo de popup");
        setLayout(new FlowLayout());
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Añadir la etiqueta
        etiqueta = new JLabel("click derecho para menu contextual");
        add(etiqueta);
        
        // Se crea una clase interna despues para manejar eventos
        ManejadorEventos manejador = new ManejadorEventos();
        
        String colores[] = {
            "Azul",
            "Amarillo",
            "Rojo"
        };
        
        // Establecer menu contextual y sus elementos
        ButtonGroup grupo_colores = new ButtonGroup();
        menu_contextual = new JPopupMenu();
        elementos = new JRadioButtonMenuItem[3];
        
        /* Construir cada elemento de menu y agregarlo al menu contextual
           Y permitir el manejo de eventos para cada elemento de menu */ 
        for(int i = 0; i < elementos.length;i++) {
            
            // Se crearán cada uno de los radioButtons con la etiqueta
            // que le corresponde del array colores
            elementos[i] = new JRadioButtonMenuItem(colores[i]);
            
            // Se añade cada uno de los elementos al JPopupMenu
            menu_contextual.add(elementos[i]);
            
            // Se añade cada elemento al grupo de botones que se hace para
            // agrupar los radio Buttons
            grupo_colores.add(elementos[i]);
            
            // Se le añade a cada radio el manejador de eventos
            elementos[i].addActionListener(manejador);
        }
        
        // de entrada, ponemos el fondo de la aplicacion blanco
        getContentPane().setBackground(Color.WHITE);
        
        // Declaramos un objetoMouseListener para que aparezca el menu
        // contextual al hacer clic derecho
        getContentPane().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evento) {
                reaccionar_al_evento(evento);
            }
            
            @Override
            public void mouseReleased(MouseEvent evento) {
                reaccionar_al_evento(evento);
            }

            // Se crea un método para controlar la posición y el evento del
            // raton
            private void reaccionar_al_evento(MouseEvent evento) {
                if(evento.isPopupTrigger()) {
                    menu_contextual.show(
                        evento.getComponent(), evento.getX(), evento.getY()
                    );
                }
            }
        });  // Fin de la clase anonima
        
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        PruebaPopupMenu aplicacion = new PruebaPopupMenu();
    }
    
    // Vamos a crear una clase interna privada para manejar los eventos
    private class ManejadorEventos implements ActionListener {
        // Procesar selecciones de elementos del menu
        @Override
        public void actionPerformed(ActionEvent evento) {
            // Determinar el elemento del menu que fue seleccionado
            for(int i = 0; i < elementos.length; i++) {
                if(evento.getSource() == elementos[i]) {
                    
                    // Poner etiqueta en negro solo cuando el background sea 
                    // amarillo
                    if(evento.getSource() != elementos[1]) {
                        etiqueta.setForeground(Color.WHITE);
                    }
                    else {
                        etiqueta.setForeground(Color.BLACK);
                    }
                    
                    getContentPane().setBackground(valores_color[i]);
                    return;
                }
            }
        }
        
    }  // Fin de la clase interna privada ManejadorEventos
}
