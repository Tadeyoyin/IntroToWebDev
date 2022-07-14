/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta.adder;

import java.util.Scanner;

/**
 *
 * @author Tolu
 */
public class Adder {
    public static void main(String[] args){
        String name;
        int age;
        int numberOfcomputers;
        String homeTown;
        
        Scanner sca = new Scanner(System.in);
        
        System.out.println("what is your name?");
        name = sca.nextLine();
        System.out.println("What is your age?");
        age = sca.nextInt();
        System.out.println("Number of Computers Owned");
        numberOfcomputers = sca.nextInt();
        sca.nextLine();
        System.out.println("What is the name of your hometown?");
        homeTown = sca.nextLine();
        
        
       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
       System.out.println("No of Computers: " + numberOfcomputers);
       System.out.println("Home Town: " + homeTown);
    }
    }
