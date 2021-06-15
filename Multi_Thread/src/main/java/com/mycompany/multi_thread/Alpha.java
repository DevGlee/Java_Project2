/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.multi_thread;

/**
 *
 * @author GRETA-PED-ACER-A36
 */
public class Alpha extends Thread {

    String[] apb = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public void run() {

        try {
            for (int i = 0; i < apb.length; i++) {
                System.out.println(apb[i]);

            }
        } catch (Exception e) {

        }
    }
}
