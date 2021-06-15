/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thread_compte_a_rebours;

/**
 *
 * @author GRETA-PED-ACER-A36
 */
public class AfficheNFois extends Thread {

    private int n;
   

    public AfficheNFois(int i) {

        n = i;
        
    }


    public void run() {

        try {
            for (int i = 0; i < n; i--) {
               
                System.out.println(n);
                sleep(1000);
                n=n-1;
                if(n<0){
                    break;
                }
            }

        } catch (Exception e) {

        }
    }

}
