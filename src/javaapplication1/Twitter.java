/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class Twitter extends RedSocial {
    private int id;
    private List<String> noticia;
    private String fecha;  

    public Twitter(int id, List<String> noticia, String fecha, String usuario, String password) {
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    @Override
    public void mostrar() {
        System.out.println("A continucion veras todas las noticias que has creado...");
        super.mostrar();
        for (String noticia : this.noticia) {
            System.out.println("------------------------------");
            System.out.println(noticia);
        }
//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
