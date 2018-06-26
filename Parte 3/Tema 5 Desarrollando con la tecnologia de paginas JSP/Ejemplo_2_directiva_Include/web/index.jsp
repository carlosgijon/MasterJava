<%-- 
    Document   : index
    Created on : 26-jun-2018, 11:02:47
    Author     : carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo de directiva Include</title>
        <!-- UIkit CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/css/uikit.min.css" />

        <!-- UIkit JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit-icons.min.js"></script>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div class="uk-container">
            <h1>Pagina JSP</h1>
            <form>
            <%! int numero = 0; %>
            <%
                for(int i = 1; i < 6; i++) { %>
                    <input class="uk-input" type="text" value="<%= i %>"
                    <br>
                <%}%>
            </form>

        </div>
    </body>
</html>
