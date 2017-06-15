/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.messagebean;

import javax.ejb.Stateful;

/**
 *
 * @author scolien
 */
@Stateful
public class LastSearchBean implements LastSearchBeanLocal {
     String lastAuthor;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
     @Override
    public void setLastAuthor(String nom)
    {
        this.lastAuthor = nom;
    }
    
    //@Override 

    /**
     *
     * @return
     */
     @Override
    public String getLastAuthor()
    {
        return lastAuthor;
    }
}
