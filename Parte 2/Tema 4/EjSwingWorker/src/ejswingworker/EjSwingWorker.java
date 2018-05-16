package ejswingworker;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class EjSwingWorker extends JFrame {
    public static int MAX_ITE = 100_000;
    
    private JTextField tf_informacion = new JTextField();
    private JButton btn_incrementar_sin_SwingWorker = new JButton();
    private JButton btn_incrementar_con_SwingWorker = new JButton();
    private JPanel pan_marco = new JPanel();
    private JPanel pan_acciones = new JPanel();
    
    public EjSwingWorker() {
        initComponents();
    }
    
    private void initComponents() {
        pan_marco.setLayout(new BorderLayout());
        pan_marco.add(tf_informacion, BorderLayout.NORTH);
        
        // Implementar una accion para botones
        btn_incrementar_sin_SwingWorker.setAction(
                new IncrementarSinSwingWorkerAction(this));
        btn_incrementar_sin_SwingWorker.setText("Incrementar SIN swing worker");
        
        btn_incrementar_con_SwingWorker.setAction(
                new IncrementarConSwingWorkerAction(this));
        btn_incrementar_con_SwingWorker.setText("Incrementar CON swing worker");
        
        // Añadir los botones al panel pan_acciones
        pan_acciones.add(btn_incrementar_sin_SwingWorker);
        pan_acciones.add(btn_incrementar_con_SwingWorker);
        
        // Añadir el panel a pan_marco
        pan_marco.add(pan_acciones, BorderLayout.CENTER);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        getContentPane().add(pan_marco);
        this.setTitle("Ejemplo funcionamiento Swing Worker");
        pack();
    }
    
    public JTextField obtener_textField() {
        return this.tf_informacion;
    }
    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new EjSwingWorker().setVisible(true);
        });
    }    
}