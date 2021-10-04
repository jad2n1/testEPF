/*
 * Roque Dehaynin TDB 27/09/2021 TP0 partie 3 Calculette
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Jade
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operateur;
        int operande1;
        int operande2;
        float resultat=0;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Please enter the operator: \n1) add \n2) substract\n3) multiply\n4) divide\n5) modulo");
        System.out.println("Please enter int number:"); 
        operateur = sc.nextInt();
        if(operateur>5 )
           System.out.println("erreur");
        
        System.out.println("Please enter the operator: \n1) add \n2) substract\n3) multiply\n4) divide\n5) modulo");
        System.out.println("Please enter int number:"); 
        operateur = sc.nextInt();
        if(operateur<0)
           System.out.println("erreur");
        
        System.out.println("Please enter the operator: \n1) add \n2) substract\n3) multiply\n4) divide\n5) modulo");
        System.out.println("Please enter int number:"); 
        operateur = sc.nextInt();
        
        
        System.out.println("Please enter first number:");
        operande1 = sc.nextInt();
        System.out.println("Please enter second number:");
        operande2 = sc.nextInt();
        
        
        
        if (operateur==1)
            resultat = operande1 + operande2;
        if (operateur==2)
            resultat = operande1 - operande2;
        if (operateur==3)
            resultat = operande1 * operande2;
        if (operateur==4)
            resultat = operande1 / operande2;
        if (operateur==5)
            resultat = operande1 % operande2;
        
                  
        
        System.out.println("Votre resultat est "+resultat);
        
             
    }
    
}
