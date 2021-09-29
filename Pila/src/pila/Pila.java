/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

//no esta bien, pero es lo mejor que pude

import java.util.Scanner;

/**
 *
 * @author karly
 */
public class Pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Pila[] = new String[100];
        Scanner entrada = new Scanner(System.in);
        
        int i = 0;
        while (i <= 10){
            
            Pila [i]= entrada.nextLine();
            i = i + 1;
        } 
        
        int I = 10;
        while (I >= 0){
        
        System.out.println(Pila[I]);
        
        I = I - 1;
    }
        
    }
    
}
