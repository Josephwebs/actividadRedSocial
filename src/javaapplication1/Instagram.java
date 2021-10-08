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
public class Instagram extends RedSocial {
    private int id;
    private List<String> historia;
    private boolean estado; 

    public Instagram(int id, List<String> historia, boolean estado, String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.historia = historia;
        this.estado = estado;
    }

    public Instagram(String usuario, String password) {
        super(usuario, password);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getHistoria() {
        return historia;
    }

    public void setHistoria(List<String> historia) {
        this.historia = historia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public void mostrar() {
        super.mostrar();
            System.out.println("A continucion veras todas las historias que has creado...");
        for (String string : this.historia) {
            System.out.println("------------------------------");
            System.out.println(string);
        }
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
