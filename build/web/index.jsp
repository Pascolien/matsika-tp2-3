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
        <title>Login</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://code.jquery.com/jquery-2.1.4.min.js" />
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
    </head>
    
    <body class="container" >
        <!--h1>Bienvenue sur la page d'accueil</h1>
        <p>Nous sommes le <!--%=new Date()  %>*/</p-->
        <!--form method="Get" class="form-horizontal" role="form">
            <div class="form-group">
            <p> <label for="inputEmail3" class="col-sm-2 control-label">Quel est votre nom</label>
              <div class="col-sm-10">
                <input type="text" name="Nom" placeholder="Saisir Nom " class="input-xlarge"/>
              </div>
            </div>
            <p> <label class="control-label ">Quoi de neuf?</label> <input type="text" name="News" placeholder="Quoi de neuf " class="input-xlarge" /></p>
            <input type="Submit" name="valider" class="btn btn-success"/>
            
        </form-->
        <!--form method="Post" class="form-horizontal" role="form">
            
            <div class="form-group">
                
              <label for="InputName" class="col-sm-2 control-label">Quel est votre nom : </label>
              
              <div class="col-sm-10">
               
                  <input type="Text" name="Nom" class="form-control" id="InputName" placeholder="Quel est votre nom ?">
             
              </div>
           
            </div>
            <div class="form-group">
             
                <label for="inputNews" class="col-sm-2 control-label">Quoi de Neuf?</label>
              
                <div class="col-sm-10">
                  
                  <textarea name="News" class="form-control" rows="2" placeholder="Quoi de neuf"></textarea>
                  
                </div>
                
            </div>
            
            <div class="form-group">
              
                <div class="col-sm-offset-2 col-sm-10">
                   
                    <input type="Submit" name="valider" class="btn btn-success"/>
                   
                </div>
                
            </div>
            
        </form>
         <!%
             if(request.getParameter("Nom")!=null && !request.getParameter("Nom").equals("")){
             out.write("Bonjour" +" "+ request.getParameter("Nom") );  
         %> 
         <br>
        <!%
             
             out.write("votre message est:"  +request.getParameter("News"));
             
             }
        %-->
         <form method="post" action="j_security_check">
            <label>Votre Login</label> : <input type="text" name="j_username" id="login" /><br>
            <label>Votre Password</label> : <input type="password" name="j_password"  id="password"/><br>
            <button class="btn btn-success">Valider</button><br>            

        </form>       
        
         <form method="post" action="inscription.jsp">
            <button class="btn btn-success">inscription</button><br>
         </form> 
    </body>
</html>
