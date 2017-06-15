/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.messagebean;

import javax.ejb.Local;

/**
 *
 * @author scolien
 */
@Local
public interface LastSearchBeanLocal {

    /**
     *
     * @param nom
     */
    public abstract void setLastAuthor(String nom);
    public abstract String getLastAuthor();
    
}
