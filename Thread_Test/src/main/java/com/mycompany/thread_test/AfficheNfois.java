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
public class AfficheNfois extends Thread {

    private int nb;
    private String message;

    public AfficheNfois(int n, String m) {
        nb = n;
        message = m;
    }

    public void run() {

        try {
            for (int i = 0; i < nb; i++) {
                System.out.println(message);
                sleep(1000);
            }
        } catch (Exception e) {
        }

    }
}


