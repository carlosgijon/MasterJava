package ejswingworker;

import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class IncrementarConSwingWorkerAction extends AbstractAction {
    private EjSwingWorker ejemplo;
    
    public IncrementarConSwingWorkerAction(
            EjSwingWorker ejemploConSwingWorkerFrame) {
        this.ejemplo = ejemploConSwingWorkerFrame;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // Se crea el SwingWorker
        final SwingWorker worker = new SwingWorker() {
            @Override
            protected Object doInBackground() {
                int iteraccion = 0;
                
                while(iteraccion < EjSwingWorker.MAX_ITE) {
                    iteraccion = iteraccion + 1;
                    ejemplo.obtener_textField().setText("" + iteraccion);
                }
                return null;
            }
        };
        worker.execute();
    }
}
