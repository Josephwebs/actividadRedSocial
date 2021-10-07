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
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");        
        Scanner s = new Scanner(System.in);
        System.out.println("Bienvenido!!");
        List<String> historiasUser = new ArrayList();
        List<String> noticiasUser = new ArrayList();
        System.out.print("Ingrese una historia para Instagram : ");
        String historia = s.nextLine();
        historiasUser.add(historia);
        System.out.print("Ingrese una noticia para Twitter : "); 
        String noticia = s.nextLine();
        noticiasUser.add(noticia);
        Instagram instagramUser = new Instagram(1, historiasUser ,true , "Victor", "123");
        Twitter twitterUser = new Twitter(1, noticiasUser ,dtf.format(LocalDateTime.now()), "Juana", "123");
        instagramUser.mostrar();
        twitterUser.mostrar();
        
        
    }
    
}
