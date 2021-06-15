/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thread_test;

/**
 *
 * @author GRETA-PED-ACER-A36
 */
public class Main {
    public static void main(String args[]){
        AfficheNfois a1 = new AfficheNfois(10,"Bonjour");
        AfficheNfois a2 = new AfficheNfois(10,"TOTO");
        
        a1.start();
        a2.start();
    }
}
