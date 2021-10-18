/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.decompte_des_lettres;

/**
 *
 * @author GRETA-PED-ACER-A36
 */
public class ThreadDecompte extends Thread {

    public static Decompte_Lettre dcpt = new Decompte_Lettre();

    private String texte;
    private int debut;
    private int fin;

    public ThreadDecompte(String t, int d, int f) {
        texte = t;
        debut = d;
        fin = f;
    }

    public void run() {

        for (int i = debut; i < fin; i++) {
            char c = texte.charAt(i);
            dcpt.incrementer(c);
        }
    }
}
