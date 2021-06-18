/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thread_prime_number;

import java.util.Scanner;

/**
 *
 * @author GRETA-PED-ACER-A36
 */
public class Main {

    public static void main(String args[] )throws Exception{
    //System.out.println("Saisir nombre de threads:");
    //int nbThreads = new Scanner(System.in).nextInt();   
    //System.out.println("Saisir n: ");
    //int nombre = new Scanner(System.in).nextInt(); 
    
    long begin = System.currentTimeMillis();
    
    
    
    Prime_NumberV2 pn = new Prime_NumberV2();
    
    pn.start();
   
    }}

