<%-- 
    Document   : index
    Created on : 27-jun-2018, 10:08:10
    Author     : carlos
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prueba variables implicitas</title>
        
        <!-- UIkit CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/css/uikit.min.css" />

        <!-- UIkit JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit-icons.min.js"></script>
        
    </head>
    <body>
        <div class="uk-container uk-margin uk-card uk-card-default uk-card-body uk-card-hover">
            <h1>Ejemplo de variables internas</h1>
            <form name="form1">
                <fieldset class="uk-fieldset">
                    <div class="uk-margin">
                        <input class="uk-input" type="text" name="txtnombre" placeholder="Nombre"><br>
                    </div>
                    <div class="uk-margin">
                        <input class="uk-input" type="text" name="txtapellidos" placeholder="Apellidos">
                    </div>
                    <div class="uk-margin">
                        <input class="uk-input" type="date" name="txtfecha" placeholder="Fecha de nacimiento">
                    </div>
                    <div class="uk-margin">
                        <input class="uk-button uk-button-primary uk-width-1-1" type="submit" value="Mostrar datos">
                    </div>
                </fieldset>
            </form>
        </div>
            <%
                String nombre,apellidos,fecha_nacimiento;
                nombre = request.getParameter("txtnombre");
                apellidos = request.getParameter("txtapellidos");
                fecha_nacimiento = request.getParameter("txtfecha");
                
                if(nombre != null) {
            %>
        <div class="uk-container uk-margin uk-card uk-card-default uk-card-body uk-card-hover">
            <h4>Los datos enviados son</h4>
            <table class="uk-table uk-table-striped">
                <tr>
                    <th>Nombre</th>
                    <td><%= nombre %></td>
                </tr>
                <tr>
                    <th>Apellidos</th>
                    <td><%= apellidos %></td>
                </tr>
                <tr>
                    <th>Fecha de nacimiento</th>
                    <td><%= fecha_nacimiento %></td>
                </tr> 
            </table>
            <% } %>
        </div>
    </body>
</html>
