/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
 
 /*
 * @author scolien
 */

public class EpsiMessageDAO {
public static ResultSet rs= null;
    private static List<EpsiMessageDTO> message;
    
     /*   protected static Connection getConnection() throws ServletException
        {
            try
        {
            return DriverManager.getConnection("jdbc:mysql://localhost/twitter", "root", "");
        }catch(Exception e)
        {
            throw new ServletException(e);
        }

        }
        */
        
       public static List<EpsiMessageDTO> retrieveMessages() throws ServletException, SQLException{
             Connection dbconect;
           dbconect = DriverManager.getConnection("jdbc:mysql://localhost/twitter", "root", "");
         PreparedStatement stmt = null;
         List<EpsiMessageDTO> message= null;
         
         
         
         String query = " Select * from message";
        
         try {
             stmt = dbconect.prepareStatement(query);
             rs = stmt.executeQuery();
             
             while (rs.next())
             {
                 EpsiMessageDTO test = new EpsiMessageDTO(rs.getString("AUTHOR") ,rs.getString("CONTENT") ,rs.getTimestamp("CREATIONDATE"));
                 message.add(test);
             }
         }
         catch(Exception e)
                 {
                     
                 }
         finally{
             rs.close();
             dbconect.close();
             
         }
         return message;
       }
}
