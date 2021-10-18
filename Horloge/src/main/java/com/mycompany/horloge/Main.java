/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.horloge;




public class Main {
  public static void main(String[] args) {
    HorlogeThread th1 = new HorlogeThread(5,1);
    
    ControleHorlogeThread cht = new ControleHorlogeThread(th1);
    Thread t1 = new Thread(cht);
    Thread t2 = new Thread(cht);
  
    cht.start();  
    t1.start();
    t2.start();
  }
}