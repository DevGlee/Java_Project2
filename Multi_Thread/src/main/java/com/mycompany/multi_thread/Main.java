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
public class Main {

    public static void main(String[] args) {

        Alpha a1 = new Alpha();
        Nombre n1 = new Nombre();
        a1.start();
        n1.start();
    }
}
