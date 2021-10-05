/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

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
        List<String> historiasUser = new ArrayList();
        System.out.println("Ingrese una historia...");
        Scanner s = new Scanner(System.in);
        String historia = s.nextLine();
        historiasUser.add(historia);
        Instagram usuario = new Instagram(1, historiasUser ,true , "jose", "123");
        
        usuario.mostrar();
        
    }
    
}
