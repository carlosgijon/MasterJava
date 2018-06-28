package paquetebeans;

import java.util.*;
import java.text.*;


public class PrimerBean {
    private Calendar hora;
    private Date hora_actual;
    private DateFormat formato;
    private String cadena_hora;
    
    public String hora() {
        hora_actual = Calendar.getInstance().getTime();
        formato = DateFormat.getTimeInstance();
        cadena_hora = formato.format(hora_actual);
        
        return cadena_hora;
    }
}
