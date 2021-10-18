/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp2_testunit;

import java.util.ArrayList;

/**
 *
 * @author GRETA-PED-ACER-A36
 */
public class EnsembleChaine {

    ArrayList< String> liste;

    public EnsembleChaine() {
        liste = new ArrayList<String>();
    }
//Ajoute la chaine ch, si elle n’existe pas déjà, à l’ensemble

    public boolean ajouter(String ch) {
        if (liste.contains(ch)) {
            System.out.println("La Chaine "+ch+ " est déja dans la liste");

        } else {
            liste.add(ch);
        }

        return true;

    }
//Test si l’ensemble e est équivalent à l’ensemble courant

    public boolean equals(EnsembleChaine e) {
    
        if(e==this) 
            
        return  e.ajouter("Football");
        return false;
      
       
        
        
    }
//Renvoie l’union de l’ensemble e et l’ensemble courant

    public EnsembleChaine union(EnsembleChaine e) {
        return null;
    }
//Renvoie l’intersection de l’ensemble e et l’ensemble courant

    public EnsembleChaine intersection(EnsembleChaine e) {
        return null;
    }
//Renvoie l’union disjointe de l’ensemble e et l’ensemble courant

    public EnsembleChaine unionDisjointe(EnsembleChaine e) {
        return null;
    }
}
