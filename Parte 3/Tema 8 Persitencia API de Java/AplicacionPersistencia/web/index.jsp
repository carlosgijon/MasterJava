<%-- 
    Document   : index
    Created on : 26-jul-2018, 13:14:44
    Author     : carlos
--%>
<%@page import="java.util.List" %>
<%@page import="javax.transaction.*"%>
<%@page import="javax.persistence.*" %>
<%@page import="packageJTA.*" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplos de Persistencia</title>
        <!-- UIkit CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/css/uikit.min.css" />

        <!-- UIkit JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit-icons.min.js"></script>
    </head>
    <body>
        <div class="uk-container uk-margin uk-card uk-card-default uk-card-body uk-card-hover">
            <form name="form1" action="NewServlet">
                <div class="uk-margin">
                    <input class="uk-input" type="text" name="txtnumero" placeholder="Numero del departamento">
                </div>
                <div class="uk-margin">
                    <input class="uk-button uk-button-primary uk-width-1-1" type="submit" value="Buscar Departamento">
                </div>
            </form>
        </div>
    </body>
</html>
