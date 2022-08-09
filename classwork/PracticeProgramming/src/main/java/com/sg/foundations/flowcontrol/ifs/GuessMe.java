/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author Tolu
 */
public class GuessMe {
    public static void main(String [] args) {
        int num = 15;
        int answer;
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("I've chosen a number. Betcha can't guess it!");
        answer = Integer.parseInt(scn.nextLine());
        
        if (answer == num) {
            System.out.println("Wow, nice guess! That was it!");
        }
        
        if (answer < num) {
            System.out.println("Ha, nice try - too low! I chose " + num);
        }
        
        if (answer > num) {
            System.out.println("Too bad, way too high. I chose " + num);
        }
    }
}
