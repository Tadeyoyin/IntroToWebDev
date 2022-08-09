/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaBasics;
import java.util.Scanner;
/**
 *
 * @author Tolu
 */
public class exFactorizer {
    public static void main(String [] args) {
         Scanner input = new Scanner(System.in);
        
        int inputNum = 0;
        int factorSum = 0;
        int[] factors;
        int numFactor = 0;
        int index = 0;
        int perfNum = 0;
        String primeNum;
        
        
        System.out.println("What number would you like to factor? ");
        inputNum = Integer.parseInt(input.nextLine());
        factors = new int[inputNum];
        perfNum = 0 - inputNum;
        for (int i = 1; i <= inputNum; i++ ) {
            factorSum = inputNum % i;
                if (factorSum == 0) {
                    factors[index] = i;
                    numFactor ++;
                    index++;
                    perfNum += i;
                }
        }
        
        if(inputNum % 1 == 0 && inputNum % 2 == 0) {
            primeNum = " not a ";
        } else {
            primeNum = " a ";
        }
            
        System.out.println("The factors of " + inputNum + " are: ");
        for (int j = 0; j < factors.length; j++) {
            System.out.print(factors[j] + " ");
        }
        System.out.println();
        System.out.println(inputNum + " has " + numFactor + " factors.");
        if (perfNum == inputNum) {
            System.out.println(inputNum + " is a perfect number.");
        } else {
            System.out.println(inputNum + " is not a perfect number.");
        }
        System.out.println(inputNum + " is" + primeNum + "prime number.");
        
        
    }
}
