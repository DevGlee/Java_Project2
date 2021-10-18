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
public class Lettre {

    private char lettre;
    private int nb;

    public Lettre(char c, int n) {
        lettre = c;
        nb = n;
    }

    public char getLettre() {
        return lettre;
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int n) {
        nb = n;
    }
}
