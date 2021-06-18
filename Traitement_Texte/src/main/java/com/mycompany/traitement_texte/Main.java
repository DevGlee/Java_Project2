/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.traitement_texte;

import java.util.Scanner;
/**
 *
 * @author GRETA-PED-ACER-A36
 */
public class Main {
    public static void main(String args [])throws Exception{
        String texte= "Cyprum itidem insulam procul a continenti discretam et portuosam inter municipia crebra urbes duae faciunt claram Salamis et Paphus, altera Iovis delubris altera Veneris templo insignis. tanta autem tamque multiplici fertilitate abundat rerum omnium eadem Cyprus ut nullius externi indigens adminiculi indigenis viribus a fundamento ipso carinae ad supremos usque carbasos aedificet onerariam navem omnibusque armamentis instructam mari committat.\n" +
"\n" +
"Thalassius vero ea tempestate praefectus praetorio praesens ipse quoque adrogantis ingenii, considerans incitationem eius ad multorum augeri discrimina, non maturitate vel consiliis mitigabat, ut aliquotiens celsae potestates iras principum molliverunt, sed adversando iurgandoque cum parum congrueret, eum ad rabiem potius evibrabat, Augustum actus eius exaggerando creberrime docens, idque, incertum qua mente, ne lateret adfectans. quibus mox Caesar acrius efferatus, velut contumaciae quoddam vexillum altius erigens, sine respectu salutis alienae vel suae ad vertenda opposita instar rapidi fluminis irrevocabili impetu ferebatur.\n" +
"\n" +
"Fuerit toto in consulatu sine provincia, cui fuerit, antequam designatus est, decreta provincia. Sortietur an non? Nam et non sortiri absurdum est, et, quod sortitus sis, non habere. Proficiscetur paludatus? Quo? Quo pervenire ante certam diem non licebit. ianuario, Februario, provinciam non habebit; Kalendis ei denique Martiis nascetur repente provincia.\n" +
"";
        for(int i=0;i<13;i++){
            texte = texte+texte;
        }
    
    System.out.println("Saisir nombre de threads:");
    int nbThread = new Scanner(System.in).nextInt();
    System.out.println("Caractere recherche:");
        char c = new Scanner(System.in).nextLine().charAt(0);
        
    //Temps de début
        long begin = System.currentTimeMillis();
        
        TraitementTexte tab[] = new TraitementTexte[nbThread];
        for (int i =0;i< nbThread;i++) {
        tab[i]= new TraitementTexte(texte,i*texte.length()/nbThread,(i+1)*texte.length()/nbThread,c);
        tab[i].start();

}
       //Attente de la fin des Threads
        for(int i =0; i < nbThread; i++){
        tab[i].join();
        
        
}
        System.out.println("NB OCCURENCES:"+TraitementTexte.nbOccurences);
        System.out.println("----------------------------------------");
        
        long end = System.currentTimeMillis();
        float time = ((float)(end-begin)) / 1000;
        System.out.println(time+"secondes");
        
}
}


