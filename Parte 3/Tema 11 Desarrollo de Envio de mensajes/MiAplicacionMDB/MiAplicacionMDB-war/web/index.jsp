<%-- 
    Document   : index
    Created on : 09-ago-2018, 13:03:10
    Author     : carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
            <h1 class="uk-text-primary">Enviar mensajes a la cola JMS</h1>
            <form name="form1" action="GeneradorMensajes">
                <table class='uk-table uk-table-striped'>
                    <tr>
                        <th>Nombre</th>
                        <td><input class="uk-input" type="text" name="txtnombre" placeholder="nombre"></td>
                    </tr>
                    <tr>
                        <th>Apellido</th>
                        <td><input class="uk-input" type="text" name="txtapellido" placeholder="apellidos"></td>
                    </tr>
                    <tr>
                        <th>Texto del mensaje</th>
                        <td><textarea class="uk-textarea" name="txttexto" rows="4" cols="20" placeholder="texto"></textarea></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center">
                            <input class="uk-button uk-button-primary uk-width-1-1" type="submit" value="Enviar Mensaje">
                        </td> 
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
