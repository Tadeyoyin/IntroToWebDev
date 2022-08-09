package com.sg.foundations.flowcontrol.ifs;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tolu
 */
public class YourLifeInMovies {
    public static void main(String [] args) {
        int year05 = 2005;
        int year95 = 1995;
        int year85 = 1985;
        int year75 = 1975;
        int year65 = 1965;
        int resp;
        String name;
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Hey, let's play a game! What's your name?");
        name = scn.nextLine();
        
        System.out.println("Lovely name, " + name + "," + " when were you born?");
        resp = Integer.parseInt(scn.nextLine());
        
        if (resp <= year05) {
            System.out.println("Hey, did you know that Pixar's 'Up' came out over a decade ago?");
        }
        
        if (resp <= year95) {
            System.out.println("And, that the first Harry Potter came out over 15 years ago");
        }
        
        if (resp <= year85) {
            System.out.println("There's more, Space Jam came out not last decade, but the one before THAT");
        }
        
        if (resp <= year75){
            System.out.println("While the original Jurassic Park release is closer to the first lunar landing than it is to today.");
        }
        
        if (resp <= year65) {
            System.out.println("Finally, the MASH TV series has been around for almost half a century!");
            System.out.println("Wow, what a life you have led");

        }
        
    }
}
