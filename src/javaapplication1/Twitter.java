/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class Twitter extends RedSocial {
    private int id;
    private List<String> noticia;
    private Date fecha;  

    public Twitter(int id, List<String> noticia, Date fecha, String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.noticia = noticia;
        this.fecha = fecha;
    }

    public Twitter(String usuario, String password) {
        super(usuario, password);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getNoticia() {
        return noticia;
    }

    public void setNoticia(List<String> noticia) {
        this.noticia = noticia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
