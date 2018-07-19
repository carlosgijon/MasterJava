<%-- 
    Document   : index
    Created on : 19-jul-2018, 11:20:01
    Author     : carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@taglib uri="mietiquetacustomtag" prefix="tagdept" %>
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
            <tagdept:tabladepartamentos/>
        </div>
    </body>
</html>
