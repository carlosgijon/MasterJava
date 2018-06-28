<%-- 
    Document   : index
    Created on : 28-jun-2018, 10:54:16
    Author     : carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo de Action Tags</title>
        <!-- UIkit CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/css/uikit.min.css" />

        <!-- UIkit JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit-icons.min.js"></script>
    </head>
    <body>
        <!-- Con esta action tag creamos un objeto para toda la sesion del paquete
             con la clase que hemos creado-->
        
        <jsp:useBean id="objeto" scope="session" class="paquetebeans.PrimerBean"/>
        
        <div class="uk-container uk-margin uk-card uk-card-default uk-card-body uk-card-hover">
            <h1>Hora del sistema con action Tags</h1>
            <table class="uk-table uk-table-striped">
                <tr>
                    <th>Hora del Sistema</th>
                    <td><%= objeto.hora() %></td>
                </tr> 
            </table>
        </div>
        
    </body>
</html>
