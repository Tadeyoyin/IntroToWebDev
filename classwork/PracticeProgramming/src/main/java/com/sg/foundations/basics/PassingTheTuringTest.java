/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics;

import java.util.Scanner;

/**
 *
 * @author Tolu
 */
public class PassingTheTuringTest {
    public static void main(String [] args){
        //defining variable types
        String name;
        String color;
        String fruit;
        int number;
        String stringNumber;
        
        //set up scanner to identify input
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Hello there!");
        System.out.println("What's your name? ");
        name = inputReader.nextLine();
        
        System.out.println("Hi " + name + "!" + " I'm Toby");
        System.out.println("What's your favorite color? ");
        color = inputReader.nextLine();
        
        System.out.println("Huh, " + color + "?" + " Mine's yellow.");
        
        System.out.println("That's because I like lemons.");
        System.out.println("What's your favourite fruit " + name + "?");
        fruit = inputReader.nextLine();
        
        System.out.println("Really? " + fruit + "?" + " that's interesting!");
        System.out.println("Speaking of favorites, what's your favorite number?");
        number = Integer.parseInt(inputReader.nextLine());
        
        System.out.println(number + " is a cool number." + " Mine's 27.");
        System.out.print("Would you know the value of 9*3? ");
        System.out.println("No worries, I got you!" + " It is " + (9 * 3) + ".");
        
        System.out.println("Well, thanks for talking to me, " + name + "!" + " Have an amazing day");
        }
}
