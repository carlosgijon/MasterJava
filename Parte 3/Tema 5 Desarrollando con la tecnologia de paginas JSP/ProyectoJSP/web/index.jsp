<%-- 
    Document   : empleadosoficios
    Created on : 18-jul-2018, 10:06:17
    Author     : carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.*" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <!-- UIkit CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/css/uikit.min.css" />

        <!-- UIkit JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit-icons.min.js"></script>
        
    </head>
    <body>
        <div class="uk-container uk-margin uk-card uk-card-default uk-card-body uk-card-hover">
            <%
                try {
                    DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
                    Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.37:1521:XE", "DB_TEST", "DB_TEST");
                    Statement sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                    ResultSet result = sentencia.executeQuery("SELECT DISTINCT JOB FROM EMP");
            %>
            <h1>Oficio de los empleados</h1>
            <form method="POST" action="index.jsp" name="form1">
                <div class uk-margin>
                    <div class uk-form-custom="target: > * > span:first-child">
                        <select name="cmboficio">
                        <%
                            String oficio = "";
                            String opciones_html = "";
                            oficio = request.getParameter("cmboficio");
                            while(result.next()) {
                                String opcion = result.getString(1);
                                if(opcion != null && opcion.equals(oficio)) {
                                    opciones_html += "<option value='" +opcion+ "' selected>" +opcion+ "</option>";
                                }
                                else {
                                    opciones_html += "<option value='" +opcion+ "'>" +opcion+ "</option>";
                                }
                            }
                        %>
                        <%= opciones_html%>
                        </select>
                        <button class="uk-button uk-button-default" type="button" tabindex="-1">
                            <span></span>
                            <span uk-icon="icon: chevron-down"></span>
                        </button>
                    </div>
                </div>
                    <div class="uk-margin">
                        <input class="uk-button uk-button-primary uk-width-1-1" type="submit" value="ver empleados" name="btnbuscar">
                    </div>
            </form>
        </div>
        
            <%
                String tabla ="";
                if(oficio != null) {%>
                <div class="uk-container uk-margin uk-card uk-card-default uk-card-body uk-card-hover">
                    <%PreparedStatement pst = conexion.prepareStatement("SELECT NAME, ENAME, JOB, DEPTNO FROM EMP WHERE JOB=?");
                    pst.setString(1, oficio);
                    result = pst.executeQuery();
                    
                    tabla =  "<table class='uk-table uk-table-striped'>";
                    tabla += "<tr><th>nombre</th>";
                    tabla += "<th>apellidos</th>";
                    tabla += "<th>trabajo</th>";
                    tabla += "<th>departamentod</th></tr>";
                    
                    while(result.next()) {
                        tabla += "<tr><td>" +result.getString(1)+ "</td>";
                        tabla += "<td>" +result.getString(2)+ "</td>";
                        tabla += "<td>" +result.getString(3)+ "</td>";
                        tabla += "<td>" +result.getString(4)+ "</td></tr>";
                    }
                    
                    tabla += "</table>";
            }%>
            <%= tabla%>
            <%
                }
                catch(SQLException ex) {%>
                <h1>Error: <%= ex.toString()%></h1>  
            <%
                }
            %>   
        </div>
    </body>
</html>
