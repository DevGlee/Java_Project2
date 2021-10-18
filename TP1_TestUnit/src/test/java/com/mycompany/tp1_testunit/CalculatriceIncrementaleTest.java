/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp1_testunit;

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
public class CalculatriceIncrementaleTest {
    
    public CalculatriceIncrementaleTest() {
    }

   
@BeforeEach
    public void setUp() {
         
        CalculatriceIncrementale instance = new CalculatriceIncrementale();
    }
 /**   
    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
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
**/
    /**
     * Test of ajouter method, of class CalculatriceIncrementale.
     */
    
    @Test
    public void testAjouter() {
        System.out.println("Test Ajouter");
        int a = 1;
        int b = 1;
        CalculatriceIncrementale instance = new CalculatriceIncrementale();
        int expResult = 2;
        int result = instance.ajouter(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of soustraire method, of class CalculatriceIncrementale.
     */
    @Test
    public void testSoustraire() {
        System.out.println("Test Soustraire");
        int a = 1;
        int b = 1;
        CalculatriceIncrementale instance = new CalculatriceIncrementale();
        int expResult = 0;
        int result = instance.soustraire(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of multiplier method, of class CalculatriceIncrementale.
     */
    @Test
    public void testMultiplier() {
        System.out.println("Test Multiplier");
        int a = 5;
        int b = 5;
        CalculatriceIncrementale instance = new CalculatriceIncrementale();
        int expResult = 25;
        int result = instance.multiplier(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of diviser method, of class CalculatriceIncrementale.
     */
    @Test
    public void testDiviser() {
        System.out.println("Test Diviser");
        int a = 5;
        int b = 5;
        CalculatriceIncrementale instance = new CalculatriceIncrementale();
        int expResult = 1;
        int result = instance.diviser(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
  

