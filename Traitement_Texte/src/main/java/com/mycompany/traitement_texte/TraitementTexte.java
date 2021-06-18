/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.traitement_texte;

/**
 *
 * @author GRETA-PED-ACER-A36
 */
public class TraitementTexte extends Thread {
    
    public static int nbOccurences;
    
    private String texte;
    private int debut;
    private int fin;
    private char car;
    
    public TraitementTexte(String m, int d, int f, char c){
        texte = m;
        debut= d;
        fin= f;
        car = c;
    }
    
    public void run(){
        for(int i= debut; i<fin;i++){
            if(texte.charAt(i)==car){
                nbOccurences++;
            }
        }
    }
}
