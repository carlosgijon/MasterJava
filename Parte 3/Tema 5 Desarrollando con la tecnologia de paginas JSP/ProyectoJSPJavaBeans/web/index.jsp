<%-- 
    Document   : index
    Created on : 24-jul-2018, 10:28:06
    Author     : carlos
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="practica" scope="session" class="paquetebeans.BeanDesplegable"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cargar desplegable</title>
        <!-- UIkit CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/css/uikit.min.css" />

        <!-- UIkit JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit-icons.min.js"></script>
    </head>
    <body>
        <div class="uk-container uk-margin uk-card uk-card-default uk-card-body uk-card-hover">
            <h1>Cargar desplegable con un bean</h1>
            <form name="form1" action="index.jsp" method="post">
                <div class="uk-form-label">Seleccione un departamento</div>
                <%
                    practica.conectar();
                    ResultSet rs = practica.crear_ResultSet("SELECT DEPTNO, DNAME FROM DEPT");
                    String combo;
                    String etiqueta = "";
                    
                    if(request.getParameter("cmbdept") != null)  {
                        String dept = request.getParameter("cmbdept");
                        combo = practica.crear_combo(rs, "cmbdept", dept);
                        etiqueta = "<span class='uk-label'>Elemento seleccionado: " +dept+ "</span>";
                    }
                    else {
                        combo = practica.crear_combo(rs, "cmbdept", "");
                    }

                %>
                <%= combo%>
                <div class="uk-margin">
                    <input type="submit" class="uk-button uk-button-primary uk-width-1-1" value="enviar formulario">
                </div>
                
                <%= etiqueta%> 
            </form>
 
        </div>
    </body>
</html>
