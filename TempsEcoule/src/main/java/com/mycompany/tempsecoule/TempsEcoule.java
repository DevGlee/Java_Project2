/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tempsecoule;

/**
 *
 * @author GRETA-PED-ACER-A36
 */
public class TempsEcoule {

    int heure;
    int minute;
    int seconde;

    public TempsEcoule(int h, int m, int s) {
        heure = (h >= 0) ? h : 0;
        minute = (m >= 0 && m < 60) ? m : 0;
        seconde = (s >= 0 && s < 60) ? s : 0;
    }
//Additionner le temps t au temps courant

    public void additionner(int seconde) {
       long millis = System.currentTimeMillis();
       int res = (int) (seconde + millis );
       
       
       System.out.println(res);
    }

}
