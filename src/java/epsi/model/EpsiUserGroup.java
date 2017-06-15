/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author scolien
 */
@Entity
public class EpsiUserGroup implements Serializable {

    public static enum Group {
       ADMIN, USER, GUEST   
    }

   private static final long serialVersionUID = 1L;
   @Id
   @Column(name = "GID")
   @Enumerated(EnumType.STRING)
   private Group role;
   @Id
   @OneToOne
   @JoinColumn(name = "UID")
   private EpsiUser uid;

    public Group getRole() {
        return role;
    }

    public void setRole(Group role) {
        this.role = role;
    }
    
     public EpsiUser getUid() {
        return uid;
    }

    public void setUid(EpsiUser id) {
        this.uid = id;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (role != null ? role.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EpsiUserGroup)) {
            return false;
        }
        EpsiUserGroup other = (EpsiUserGroup) object;
        if ((this.role == null && other.role != null) || (this.role != null && !this.role.equals(other.role))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "epsi.model.EpsiUserGroup[ id=" + role + " ]";
    }
    
}
