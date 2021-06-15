/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thread_compte_a_rebours;

import java.util.Scanner;

/**
 *
 * @author GRETA-PED-ACER-A36
 */
public class Main {
    
    public static void main(String [] args){
        System.out.println("Entrer l'entier n :");
        int i= new Scanner (System.in).nextInt();
        AfficheNFois a1 = new AfficheNFois(i);
        
        a1.start();
        
    }
}
