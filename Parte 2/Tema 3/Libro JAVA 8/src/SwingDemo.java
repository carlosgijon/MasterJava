import javax.swing.*;

public class SwingDemo {

    // CONSTRUCTOR
    public SwingDemo() {
        // Crear un contenedor JFrame
        JFrame jfrm = new JFrame("Una aplicacion sencilla de Swing");

        // Tamaño inicial del marco
        jfrm.setSize(275,100);

        // Hacer que el programa se cierre al cerrar la ventana
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear una etiqueta basada en texto
        JLabel jlab = new JLabel("Swing define las GUI modernas");

        // Añadir la etiqueta al panel
        jfrm.add(jlab);

        // Mostrar el marco
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        // Se crea un subproceso para la GUI
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Se llama al constructor de la clase, pero no se crea una instancia
                new SwingDemo();
            }
        });
    }

}
