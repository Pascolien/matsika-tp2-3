/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.messagebean;

import epsi.model.EpsiMessage;
import static epsi.model.EpsiMessageDAO.rs;
import epsi.model.EpsiMessageDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;

/**
 *
 * @author scolien
 */
@Stateless
public class MessageBean implements MessageBeanLocal {
   @PersistenceContext(unitName="EPSI-PU")
    private EntityManager em;
    
    @Override
       public ArrayList<EpsiMessage> retrieveMessages() throws ServletException{
           
       TypedQuery<EpsiMessage> typedQuery;
       String jpqlQuery;         
             
        jpqlQuery = "SELECT me FROM message me"; 
        
        typedQuery = em.createQuery(jpqlQuery,EpsiMessage.class);
        ArrayList<EpsiMessage> result =  (ArrayList)typedQuery.getResultList();       
                
        return result;
       }
        public ArrayList<EpsiMessage> searchMessages(String nom) throws ServletException
    {
        TypedQuery<EpsiMessage> typedQuery;
        String jpqlQuery;       
        
        if(nom.equals(""))
        {
            jpqlQuery = "SELECT me FROM message me"; 
            typedQuery = em.createQuery(jpqlQuery,EpsiMessage.class);
        }
        else
        {
            jpqlQuery ="SELECT me FROM message me WHERE author = :eAuthor ";
            typedQuery = em.createQuery(jpqlQuery,EpsiMessage.class);                    
            typedQuery.setParameter("eAuthor", nom);
            
        }  
        
        
       ArrayList<EpsiMessage> result =  (ArrayList)typedQuery.getResultList();       
                
       return result;
    }
        @Override
    public void saveMessages(String author, String content) throws ServletException
    {
        EpsiMessage message = new EpsiMessage();
               
        message.setAuthor(author);
        message.setContent(content);
        message.setCreationDate(new Date());
        
        em.persist(message);
        
        
    }
}
