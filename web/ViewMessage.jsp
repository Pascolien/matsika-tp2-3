<%-- 
    Document   : EpsiMessage
    Created on : 24 févr. 2016, 20:14:36
    Author     : scolien
--%>
<%@page import="epsi.model.EpsiMessage"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="epsi.model.EpsiMessageDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Messages</title>
    </head>
    <body>
       <h1>Liste des messages</h1>
         <h2>user: ${pageContext.request.userPrincipal.name} <h2>
        <%
            
            List<EpsiMessage> messages = (List<EpsiMessage>) request.getAttribute("message");
            if(messages != null)
            for(EpsiMessage message : messages)
            {
                %> 
                <h1><%=message.getAuthor() %> </h1>
                <h1><%=message.getCreationDate() %> </h1>
                <h1><%=message.getContent() %> </h1>
                <%
            }
        %>        
    </body>
</html>
