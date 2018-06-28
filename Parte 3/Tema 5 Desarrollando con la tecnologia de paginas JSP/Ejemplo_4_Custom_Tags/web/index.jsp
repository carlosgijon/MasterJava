<%-- 
    Document   : index
    Created on : 28-jun-2018, 11:18:26
    Author     : carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="mietiquetacustomtag" prefix="MiEtiqueta"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina con Custom tags</title>
        <!-- UIkit CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/css/uikit.min.css" />

        <!-- UIkit JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit-icons.min.js"></script>
    </head>
    <body>
        <div class="uk-container uk-margin uk-card uk-card-default uk-card-body uk-card-hover">
            <MiEtiqueta:primera/>
        </div>
    </body>
</html>
