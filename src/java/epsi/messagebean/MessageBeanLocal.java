/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.messagebean;

import epsi.model.EpsiMessage;
import epsi.model.EpsiMessageDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;
import javax.servlet.ServletException;

/**
 *
 * @author scolien
 */
@Local
public interface MessageBeanLocal {
    
       
    public ArrayList<EpsiMessage> retrieveMessages() throws ServletException;
    public ArrayList<EpsiMessage> searchMessages(String nom) throws ServletException;
    public void saveMessages(String author, String content) throws ServletException;
}
