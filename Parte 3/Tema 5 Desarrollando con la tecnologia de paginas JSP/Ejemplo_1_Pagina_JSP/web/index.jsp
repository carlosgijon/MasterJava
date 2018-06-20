<%-- 
    Document   : Ejemplo
    Created on : 20-jun-2018, 11:08:55
    Author     : carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Primera página jsp</title>
        <!-- UIkit CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/css/uikit.min.css" />

        <!-- UIkit JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit-icons.min.js"></script>
    </head>
    <body style="text-align: center;">
        <div class="uk-container">
            <h1>JSP de fecha y hora</h1>
            <p> 
                <%=
                    new java.util.Date()
                %>
            </p>
        </div>
    </body>
</html>
