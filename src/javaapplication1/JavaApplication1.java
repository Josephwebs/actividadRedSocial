/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Los objetos de usuario estan seteados con un 
        Instagram instagramUser = new Instagram("Victor", "123");
        instagramUser.setId(1);
        instagramUser.setEstado(true);
        Twitter twitterUser = new Twitter("Juana", "123");
        twitterUser.setId(1);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");        
        Scanner s = new Scanner(System.in);
        System.out.println("Bienvenido!!");
        List<String> historiasUser = new ArrayList();
        List<String> noticiasUser = new ArrayList();
        boolean validarMenu = true;
        while (validarMenu){
            System.out.println("Ingrese porfavor una opcion...");
            System.out.println("1.- Hacer historia en Instagram");
            System.out.println("2.- Hacer historia en Twitter");
            System.out.println("3.- Ver todas las historias de Instagram");
            System.out.println("4.- Ver todas las noticias de Twitter");
            System.out.println("5.- Salir");
            String opcion = s.nextLine();
            if (opcion.equals("1")) {
                System.out.print("Ingrese una historia para Instagram : ");
                String historia = s.nextLine();
                historiasUser.add(historia);        
                instagramUser.setHistoria(historiasUser);

            }else if (opcion.equals("2")){
                System.out.print("Ingrese una noticia para Twitter : "); 
                String noticia = s.nextLine();
                noticiasUser.add(noticia);
                twitterUser.setNoticia(noticiasUser);
                twitterUser.setFecha(dtf.format(LocalDateTime.now()));
                
            }else if  (opcion.equals("3")){
                instagramUser.mostrar();
            }else if (opcion.equals("4")){
                twitterUser.mostrar();
            }else if (opcion.equals("5")) {
                System.out.println("Muchas gracias por visitar la app, hasta luego!!!");
                validarMenu = false;
            }
            
        }

    }
    
}
