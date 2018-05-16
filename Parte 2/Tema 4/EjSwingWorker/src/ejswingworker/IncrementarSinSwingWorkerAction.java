
package ejswingworker;

import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class IncrementarSinSwingWorkerAction extends AbstractAction {
    private EjSwingWorker ejemplo;
    
    public IncrementarSinSwingWorkerAction(
            EjSwingWorker ejemploSinSwinfWorkerFrame) {
        this.ejemplo = ejemploSinSwinfWorkerFrame;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        int iteraccion = 0;
        
        while(iteraccion < EjSwingWorker.MAX_ITE) {
            iteraccion = iteraccion + 1;
            this.ejemplo.obtener_textField().setText("" + iteraccion);
        }
    }
    
}
