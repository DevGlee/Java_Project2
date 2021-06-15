/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thread_bonjour;

import java.util.Scanner;

/**
 *
 * @author GRETA-PED-ACER-A36
 */
public class AfficheNFois extends Thread {

    private int n;
    private String message;
 

    public AfficheNFois(int nb, String msg) {

        n = nb;
        message = msg;

    }

    public void run() {
        try {

            for (int i = 0; i < n; i++) {
                System.out.println(message);
                sleep(1500);
            }

        } catch (Exception e) {

        }
    }

}
