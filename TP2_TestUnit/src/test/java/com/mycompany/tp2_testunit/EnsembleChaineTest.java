/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp2_testunit;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author GRETA-PED-ACER-A36
 */
public class EnsembleChaineTest  {
    
    public EnsembleChaineTest() {
        
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAjouter() {
        System.out.println("Test Ajouter");
        
        EnsembleChaine instance = new EnsembleChaine();
        
        
        instance.ajouter("Football");
        
        
      
        if (instance.liste.isEmpty())
    System.out.println("Liste vide");
        
         for(int i = 0 ; i < instance.liste.size(); i++)
   System.out.println(instance.liste.get(i));
  
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    
    public void testEquals() {
        System.out.println("Test Equals");
        
        EnsembleChaine instance = new EnsembleChaine();
        
         assertEquals(true,instance.equals(instance));
    }
    
}
