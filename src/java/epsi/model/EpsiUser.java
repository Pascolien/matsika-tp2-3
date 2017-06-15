/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author scolien
 */
@Entity
@Table(name = "EpsiUser")
public class EpsiUser implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name= "UID")    
    private String login;
    
    @Column(name = "PASSWD", length = 32, columnDefinition = "VARCHAR(32)")
    private String password;

    public String getLogin() {
        return login;
    }
public void setLogin(String id) {
        this.login = id;
    }
    
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String pass)
    {
        this.password = hashPassword(pass);
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (login != null ? login.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EpsiUser)) {
            return false;
        }
        EpsiUser other = (EpsiUser) object;
        if ((this.login == null && other.login != null) || (this.login != null && !this.login.equals(other.login))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "epsi.model.EpsiUser[ id=" + login + " ]";
    }
     private String hashPassword(String password) {
     String encoded = null;
     try {
         MessageDigest md = MessageDigest.getInstance("MD5");
           encoded = new BigInteger(1, md.digest(password.getBytes())).toString(16);
     } catch (NoSuchAlgorithmException ex) {
         //should never happen with MD5, see MessageDigest documentation
     }
     return encoded;
 }
    
}
