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
        // Se setea el usuario de nombre ramiro y clave 123
        Instagram instagramUser = new Instagram("Ramiro", "123");
        instagramUser.setId(1);
        instagramUser.setEstado(true);
        Twitter twitterUser = new Twitter("Ramiro", "123");
        twitterUser.setId(1);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");       
        twitterUser.setFecha(dtf.format(LocalDateTime.now()));
        Scanner s = new Scanner(System.in);
        System.out.println("Bienvenido!!");
        List<String> historiasUser = new ArrayList();
        List<String> noticiasUser = new ArrayList();
        boolean validarMenu = true;
        while (validarMenu){
            System.out.println("Ingrese porfavor una opcion...");
            System.out.println("1.- Crear historia en Instagram");
            System.out.println("2.- Crear Noticia en Twitter");
            System.out.println("3.- Ver todas las historias de Instagram");
            System.out.println("4.- Ver todas las noticias de Twitter");
            System.out.println("5.- Salir");
            System.out.print("------>");
            String opcion = s.nextLine();
            switch (opcion) {
                case "1":
                    System.out.print("Ingrese una historia para Instagram : ");
                    String historia = s.nextLine();
                    historiasUser.add(historia);
                    instagramUser.setHistoria(historiasUser);
                    System.out.println("-----------------------------");
                    System.out.println("hisotoria ingresada con exito");
                    System.out.println("-----------------------------");
                    break;
                case "2":
                    System.out.print("Ingrese una noticia para Twitter : ");
                    String noticia = s.nextLine();
                    noticiasUser.add(noticia);
                    twitterUser.setNoticia(noticiasUser);
                    System.out.println("-------------------------");
                    System.out.println("Noticia creada con exito");
                    System.out.println("-------------------------");
                    break;
                case "3":
                    if (historiasUser.isEmpty()){
                    System.out.println("-----------------------------------------");
                        System.out.println("Aun no as creado ninguna historia");
                    System.out.println("-----------------------------------------");
                    }else{
                        instagramUser.mostrar();

                    }
                    break;
                case "4":
                    if (noticiasUser.isEmpty()){
                    System.out.println("-----------------------------------------");
                        System.out.println("Aun no as creado ninguna noticia");
                    System.out.println("-----------------------------------------");
                    }else{
                        twitterUser.mostrar();
                    }               
                    break;
                case "5":
                    System.out.println("Muchas gracias por visitar la app, hasta luego!!!");
                    validarMenu = false;
                    break;
                default:
                    System.out.println("-----------------------------------------");
                    System.out.println("Opcion no valida, intente denuevo...");
                    System.out.println("-----------------------------------------");
                    break;
            }
            
        }

    }
    
}
