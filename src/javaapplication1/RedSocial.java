/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Cetecom
 */
public class RedSocial {
    private String usuario;
    private String password;

    public RedSocial(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public RedSocial() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void mostrar() {
        System.out.println("-----------------------------");
        System.out.println("Hola " + this.usuario+"!!!");
    }
}
