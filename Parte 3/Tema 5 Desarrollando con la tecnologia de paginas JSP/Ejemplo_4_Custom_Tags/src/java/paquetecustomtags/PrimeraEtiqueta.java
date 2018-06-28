package paquetecustomtags;

import java.io.IOException;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.TagSupport;
import java.util.*;
import java.text.*;

public class PrimeraEtiqueta extends TagSupport{
    @Override
    public int doStartTag() throws JspTagException {
        return SKIP_BODY;
    }
    
    @Override
    public int doEndTag() throws JspTagException {
        String hora_actual = this.GetHora();
        
        try {
            JspWriter out = pageContext.getOut();
            out.write("<h1>Bienvenido a mi pagina Custom Tags!!!</h1>");
            out.write("<table class=\"uk-table uk-table-striped\">");
            out.write("<tr>");
            out.write("<th>Nombre de clase</th>");
            out.write("<td>");
            out.write(getClass().getName());
            out.write("</td>");
            out.write("</tr>");
            out.write("<tr>");
            out.write("<th>Hora del sistema</th>");
            out.write("<td>");
            out.write(hora_actual);
            out.write("</td>");
            out.write("</tr>");
            out.write("</table>");
        }
        catch(IOException exc_io) {
        
        }
        
        return EVAL_PAGE;
    }
    
    private String GetHora() {
        Date hora_actual;
        DateFormat formato;
        String cadena_hora;
        
        hora_actual = Calendar.getInstance().getTime();
        formato = DateFormat.getTimeInstance();
        cadena_hora = formato.format(hora_actual);
        
        return cadena_hora;
    }
}
