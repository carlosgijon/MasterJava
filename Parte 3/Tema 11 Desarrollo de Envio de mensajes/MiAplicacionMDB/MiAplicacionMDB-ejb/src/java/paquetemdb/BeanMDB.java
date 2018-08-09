/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetemdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 *
 * @author carlos
 */
@MessageDriven(mappedName = "jms/Queue", activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/Queue")
    ,
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class BeanMDB implements MessageListener {
    
    public BeanMDB() {
    }
    
    @Override
    public void onMessage(Message message) {
        System.out.println("Mensajes recibidos en el MDB"); 
        
        try {
            MapMessage mensaje = (MapMessage) message;
            System.out.println("Nombre: " +mensaje.getString("nombre"));
            System.out.println("Apellido: " +mensaje.getString("apellido"));
            System.out.println("Texto: " +mensaje.getString("texto"));
        }
        catch(Exception exc) {
            System.out.println("exc.toString()");
        }

    }
    
}
