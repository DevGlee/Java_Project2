/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.decompte_des_lettres;

import java.util.ArrayList;

/**
 *
 * @author GRETA-PED-ACER-A36
 */
public class Decompte_Lettre extends Thread {

    private ArrayList<Lettre> liste;

    public Decompte_Lettre() {
        liste = new ArrayList<Lettre>();
    }

  
    public int indexOf(char c) {
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).getLettre() == c) {
                return i;
            }
        }
        return -1;
    }

    public void ajouter(char c) {
        liste.add(new Lettre(c, 1));
    }

    public void incrementer(char c) {
        int i = indexOf(c);
        if (i == -1) {
            ajouter(c);
        } else {
            int nb = liste.get(i).getNb();
            liste.get(i).setNb(nb + 1);
        }
    }

}
