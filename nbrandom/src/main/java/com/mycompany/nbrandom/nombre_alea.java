/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nbrandom;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

/**
 *
 * @author GRETA-PED-ACER-A36
 */
public class nombre_alea {
    
   
     public static void main(String args[])
    {
        
        ArrayList <Integer> tab = new ArrayList <Integer> ();
        int length = 0;
        double somme = 0;
        double moyenne=0;
 
        while (length < 100)
        {
            int n = (int) (Math.random() *100 );
            if (!tab.contains(n))
            {
                tab.add(n);
                
                length += 1;
                
            }
        }
 
        for (int i=0; i<tab.get(i); i++){
           
            //System.out.println( tab.get(i));
            
              somme+=tab.get(i);
        }
       
         moyenne = somme/tab.size();
        System.out.println("Somme est égal à ="+somme);
        System.out.println("La moyenne est égal à"+moyenne);
        
        
    }
     
       public final InputStream openStream() throws IOException{
        try (BufferedInputStream bis = new BufferedInputStream(new URL("http://ftp.sra.ebi.ac.uk/vol1/fastq/SRR130/005/SRR13015805/SRR13015805_1.fastq.gz").openStream());  
  FileOutputStream fos = new FileOutputStream("C:\\Users\\GRETA-PED-ACER-A36\\Desktop\fast1.gz")) {
    byte data[] = new byte[1024];
    int byteContent;
    while ((byteContent = bis.read(data, 0, 1024)) != -1) {
        fos.write(data, 0, byteContent);
    }
} catch (IOException e) {
   e.printStackTrace(System.out);
}
        return null;

    }
    
    
}
