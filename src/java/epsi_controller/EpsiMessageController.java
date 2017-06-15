/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi_controller;
 
import epsi.messagebean.LastSearchBeanLocal;
import epsi.model.EpsiMessageDAO;
import epsi.model.EpsiMessageDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import epsi.messagebean.MessageBeanLocal;
import epsi.messagebean.MessageBean;
import epsi.model.EpsiMessage;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;

/**
 *
 * @author scolien
 */



@WebServlet(name = "EpsiMessageController", urlPatterns = {"/viewmessages"})
public class EpsiMessageController extends HttpServlet {

@EJB
private MessageBeanLocal messageBean;
 @EJB
 private LastSearchBeanLocal lastSearchBean;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        
        response.setContentType("text/html;charset=UTF-8");
        
         ArrayList<EpsiMessage> message;
           
           if(request.getParameter("nom")!=null)
           {
              
                lastSearchBean.setLastAuthor(request.getParameter("nom"));
                message  = messageBean.searchMessages(lastSearchBean.getLastAuthor());
           }
           else
           {
                message  = messageBean.retrieveMessages();
           }
            
           request.setAttribute("message", message);
           request.getRequestDispatcher("/viewMessages.jsp").forward(request, response);
        
          /*ArrayList<EpsiMessage> message  = messageBean.retrieveMessages();          
            
            request.setAttribute("message", message);
            request.getRequestDispatcher("/ViewMessage.jsp\").forward(request, response);\n" + " } \n" +" ge.jsp").forward(request, response);*/
    }    
          // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    try {
        processRequest(request,response);
    } catch (SQLException ex) {
        Logger.getLogger(EpsiMessageController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    try {
        processRequest(request, response);
    } catch (SQLException ex) {
        Logger.getLogger(EpsiMessageController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
        
      /*  try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EpsiMessageController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EpsiMessageController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }*/
        
    }
 
     
    

