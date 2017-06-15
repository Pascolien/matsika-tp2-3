/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pascolien
 */
public class HelloServlet extends HttpServlet {
     @Override
     public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
         
         response.setContentType("text/html") ;
		
		PrintWriter out = response.getWriter() ;
		out.println("<html>") ;
		out.println("<head>") ;
		out.println("<title>hello servlet !</title>") ;
		out.println("</head>") ;
		out.println("<body>") ;
		out.println("<h1> hello !</h1>") ;
		out.println("</body>") ;
		out.println("</html>") ;   
     }
}
