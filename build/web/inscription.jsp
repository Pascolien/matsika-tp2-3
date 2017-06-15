<%-- 
    Document   : inscription
    Created on : 14 avr. 2016, 22:39:29
    Author     : scolien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inscription</title>
    </head>
    <body>
        <h1>Inscription</h1>
         <form method="post" action="EpsiUserController">
            <label>Votre Login</label> : <input type="text" name="j_username" id="login" /><br>
            <label>Votre Password</label> : <input type="password" name="j_password"  id="password"/><br>
            <label>Confirmer Password</label> : <input type="password" name="j_password"  id="password_conf"/><br>
            <button class="btn btn-success">Valider</button><br>            

        </form> 
    </body>
</html>
