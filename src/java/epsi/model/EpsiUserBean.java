/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.model;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author scolien
 */
@Stateful
public class EpsiUserBean implements EpsiUserBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
     @PersistenceContext(unitName="EPSI-PU")
    private EntityManager em;
      public void addUser(String login, String pass)            
    {
        EpsiUser user = new EpsiUser();
        EpsiUserGroup group = new EpsiUserGroup();
        
        
        user.setLogin(login);
        user.setPassword(pass);
        group.setUid(user);
        group.setRole(EpsiUserGroup.Group.USER);
        
        em.persist(user); 
        em.persist(group); 
    
    }
}
