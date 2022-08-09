/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author Tolu
 */
public class TraditionalFizzBuzz {
    public static void main(String [] args) {
        int fizzbuzz = 0;
        int resp;
        Scanner userInput = new Scanner(System.in);
                
        System.out.println("How many units of fizzing and buzzing do you need in your life?");
        resp = Integer.parseInt(userInput.nextLine());
        
          while (fizzbuzz < 16){
            if (fizzbuzz % 3 == 0) {
                System.out.println("fizz");                
            }
            else if(fizzbuzz % 5 == 0) {
                System.out.println("buzz");                
            }
            if((fizzbuzz % 3 == 0) && (fizzbuzz % 5 == 0)) {
            System.out.println("fizz buzz");
            }
            else {
                System.out.println(fizzbuzz);
            }
            fizzbuzz++;
            }
    }
}
