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
public class Nombre extends Thread {

    int nb = 1;

    public int Nombre(int n) {
        nb = n;
        return 0;
    }

    public void run() {

        for (int i = 0; i < 26; i++) {

            System.out.println(nb);
            nb = nb + 1;
        }
    }

}
