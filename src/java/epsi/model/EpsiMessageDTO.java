package epsi.model;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pascolien
 */
public class EpsiMessageDTO {
    
    private String author ;
    private String content ;
    private Date date;

 public EpsiMessageDTO(String auteur, String content, Date date)
 {
     setAuthor(auteur);
     setContent(content);
     setDate(date);
 }

    EpsiMessageDTO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
