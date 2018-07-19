package paquetecustomtags;

import java.io.IOException;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.TagSupport;
import java.util.*;
import java.text.*;
import java.sql.*;


public class EtiquetaTablaDept extends TagSupport {
    @Override
    public int doStartTag() throws JspTagException {
        return SKIP_BODY;
    }
    
    @Override
    public int doEndTag() throws JspTagException {
        try {
            JspWriter out = pageContext.getOut();
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.37:1521:XE", "DB_TEST", "DB_TEST");
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery("SELECT * FROM DEPT");
            out.write("<h1>Datos de los departamentos</h1>"); 
            String tabla =  "<table class='uk-table uk-table-striped'>";
            tabla += "<tr><th>Numero</th>";
            tabla += "<th>Nombre</th>";
            tabla += "<th>Localidad</th></tr>";
            
            while(resultado.next()) {
                tabla += "<tr>";
                tabla += "<td>" +resultado.getString(1)+ "</td>";
                tabla += "<td>" +resultado.getString(2)+ "</td>";
                tabla += "<td>" +resultado.getString(3)+ "</td>";
                tabla += "</tr>";
            }
            tabla += "</table>";
            
            // Pintamos la tabla ya que si no no saldra en pantalla
            out.write(tabla);
        }
        catch(Exception exc) {
            throw new JspTagException("Excepcion al cargar el fichero TLD " +exc.toString());
        }
        
        return EVAL_PAGE;
    }
}
