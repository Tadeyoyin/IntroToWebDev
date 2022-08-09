/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author Tolu
 */
public class StayPositive {
    public static void main(String[] args) {
        
        int countdown = 10;
      
        while (countdown > -1) {
            System.out.println(countdown);
            countdown--;
        }
       System.out.println("Blast off!");
    }
}
