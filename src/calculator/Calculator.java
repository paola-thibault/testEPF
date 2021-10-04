/*
 * THIBAULT Paola TDB grp2
 * 03/10/21
 * Le programme à pour but  
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here     
        Scanner sc = new Scanner(System.in);
        int operateur;
        System.out.println("Saisissez une oppération : (1, 2, 3, 4 or 5)");
        System.out.println("1) add \n2) substract \n3) multiply \n4) divide \n5) modulo"); 
        operateur=sc.nextInt();
        String titre;
        if (operateur == 1) { 
            titre = "+";
        }
        titre;
        if (operateur == 2) {
            titre = "-";
        }
        
        System.out.println("\nNombre n°1 :");
        int operande1 = sc.nextInt();
        System.out.println("\n"+ titre + " (2e nombre):");
        int operande2 = sc.nextInt();
        
    }   
    
}
