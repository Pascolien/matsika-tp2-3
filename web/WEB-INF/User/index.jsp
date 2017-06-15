<%-- 
    Document   : index
    Created on : 15 avr. 2016, 00:17:29
    Author     : scolien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>index user</title>
    </head>
    <body>
        <h1>Bonjour ${pageContext.request.userPrincipal.name}</h1>
    </body>
</html>
