/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thread_prime_number;

import java.lang.*;
import java.util.*;

/**
 *
 * @author GRETA-PED-ACER-A36
 */
public class Prime_NumberV2 extends Thread {
    
    private int nombre;
    
   
      public void run(){
     System.out.println("Saisir n: ");
    int nombre = new Scanner(System.in).nextInt();  
          
         ArrayList<Integer> lnb = new ArrayList<Integer>();
        for (int i = 3; i < nombre; i=i+2) {
            int nbDiv = 0;
            for (int j = 2; j < Math.sqrt(i-1); j++) {
                if (i % j == 0) {
                    nbDiv++;
                }
            }
            if (nbDiv == 2) {
                lnb.add(i);
            }
        }

        System.out.println(lnb);
            }
        }
    
 
   

