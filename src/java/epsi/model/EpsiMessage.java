/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author scolien
 */
@Entity
public class EpsiMessage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Temporal(TemporalType.TIMESTAMP)    
    private Date  creationdate;
    
    private String content;
    
    private String author;
    
 
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

     //date
    public Date getCreationDate() 
    {
        return creationdate;
    }

    public void setCreationDate(Date creationdate) 
    {
        this.creationdate = creationdate;
    }
    
    //Content
    
     public String getContent() 
    {
        return content;
    }

    public void setContent(String content) 
    {
        this.content = content;
    }
    
    //author
     public String getAuthor() 
    {
        return author;
    }

    public void setAuthor(String author) 
    {
        this.author = author;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EpsiMessage)) {
            return false;
        }
        EpsiMessage other = (EpsiMessage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "epsi.model.EpsiMessage[ id=" + id + " ]";
    }
    
}
