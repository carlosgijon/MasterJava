package ejemplo1estructuraejb;

import javax.ejb.EJB;

public class ClienteEJB {
    
    @EJB
    private ClaseEJB BeanEJB;
        void metodo_cliente() {
            BeanEJB = new ClaseEJB();
            BeanEJB.GetMensaje("Carlos");
        }
}
