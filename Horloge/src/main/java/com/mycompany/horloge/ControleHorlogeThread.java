/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.horloge;

import java.util.Scanner;

/**
 *
 * @author GRETA-PED-ACER-A36
 */
public class ControleHorlogeThread extends Thread {
    
    private HorlogeThread clock;
    
    public ControleHorlogeThread(HorlogeThread  c){
        
        clock=c;
    }

   
    
    public void run(){
        
        while(true){
            System.out.println("1.Taper\n2.Format\n");
            int choix= new Scanner(System.in).nextInt();
            
            if(choix==1){
                System.out.println("Nouvelle fréquence");
                int f = new Scanner(System.in).nextInt();
                clock.setFrequence(f);
            }
            else if(choix==2){
                System.out.println("Nouveau format");
                int nf= new Scanner(System.in).nextInt();
                clock.setFormat(nf);
            }
            else if(choix==3){
                clock.arret();
            }
        }
        
    }
    
}
