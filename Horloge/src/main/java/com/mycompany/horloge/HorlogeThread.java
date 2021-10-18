/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.horloge;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author GRETA-PED-ACER-A36
 */
public class HorlogeThread extends Thread {


    
    private int frequence;
    private int format;
    private boolean arret;

    public HorlogeThread(int fe, int fo) {
        frequence = fe;
        format = fo;
        arret = false;
    }

    @Override

    public void run() {
        try {
            SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/YY HH:mm:ss");
            SimpleDateFormat f2 = new SimpleDateFormat("HH:mm:ss");

            while (!arret) {
                Date d = new Date();
                if (format == 1) {
                    System.out.println(f1.format(d));
                } else if (format == 2) {
                    System.out.println(f2.format(d));
                }

            }

        } catch (Exception e) {
        }
    }

    public void setFrequence(int f) {
        frequence = f;
    }

    public void setFormat(int nf) {
        format = nf;
    }

    public void arret() {
        arret = true;
    }
}
