/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.methods;

/**
 *
 * @author Tolu
 */
public class MethodToTheMadness {
    public static void main(String [] args) {
     eatMe();
     drinkMe();
     System.out.println("\n - Lewis Carroll, Alice in Wonderland");
    }
    static void eatMe(){
        System.out.println("'But I don’t want to go among mad people,' Alice remarked.");
        System.out.println(" 'Oh, you can’t help that,' said the Cat.");
        System.out.println(" 'We’re all mad here. I’m mad. You’re mad.'");
    }
    static void drinkMe(){
        System.out.println(" 'How do you know I’m mad?' said Alice.");
        System.out.print(" 'You must be,' said the Cat, 'or you wouldn’t have come here.' ");
    }
}
