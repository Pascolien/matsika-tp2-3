<%-- 
    Document   : index
    Created on : 1 févr. 2016, 09:38:32
    Author     : pascolien
--%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://code.jquery.com/jquery-2.1.4.min.js" />
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
    </head>
    
    <body class="container">
        <h1>Bienvenue sur la page d'accueil</h1>
        <p>la date est <%=new Date()  %></p>
        <form method="Get" class="form-horizontal" role="form">
            <div class="">
            <p> <label class="control-label">Quel est votre nom</label> <input type="text" name="Nom" placeholder="Saisir Nom " class="input-xlarge"/></p>
            <p> <label class="control-label ">Quoi de neuf?</label> <input type="text" name="News" placeholder="Quoi de neuf " class="input-xlarge" /></p>
            <input type="Submit" name="valider" class="btn btn-success"/>
            </div>
        </form>
         <%
             if(request.getParameter("Nom")!=null){
             //out.write("Bonjour"request.getParameter("Nom"));  
             //out.write("Votre message est");
             }
        %>
    </body>
</html>
