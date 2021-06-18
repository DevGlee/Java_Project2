/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thread_prime_number;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author GRETA-PED-ACER-A36
 */
public class Prime_Number extends Thread {

    public static void main(String[] args) {
        System.out.println("Saisir n: ");
        int n = new Scanner(System.in).nextInt();

        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int i = 2; i < n; i++) {
            int nbDiv = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    nbDiv++;
                }
            }
            if (nbDiv == 2) {
                l.add(i);
            }
        }

        System.out.println(l);

    }
}
