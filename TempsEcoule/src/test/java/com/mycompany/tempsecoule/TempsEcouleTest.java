/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tempsecoule;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author GRETA-PED-ACER-A36
 */
public class TempsEcouleTest {
    
    public TempsEcouleTest() {
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
    public void TestAddition() {
        System.out.println("Test addition des temps");
        TempsEcoule t1= new TempsEcoule(1,1,1);
        TempsEcoule t2 = new TempsEcoule(1,1,1);
        
        t1.additionner(6);
        
        System.out.println(t1);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    
}
