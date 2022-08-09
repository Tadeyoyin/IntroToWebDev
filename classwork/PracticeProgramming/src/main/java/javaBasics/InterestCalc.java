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
public class InterestCalc {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("What is the annual interest rate % growth?");
            double compoundedRate = sc.nextDouble();
            System.out.println("Please enter number of years of mutual fund.");
            double yearsOfFund = sc.nextDouble();
            System.out.println("How much do you want to invest?");
            double currentBalance = sc.nextDouble();
            double interestEarned = currentBalance*compoundedRate;

            for (int i = 0; i < yearsOfFund; i++) {
                double interestEarnedTotal = 0;
                double startBalance = currentBalance;

                for(int j = 0; j < 4; j++){
                    currentBalance = currentBalance * compoundedRate;
                    interestEarned = currentBalance*compoundedRate;
                }
                currentBalance = currentBalance + interestEarnedTotal;
                interestEarnedTotal += interestEarned;

                System.out.println("Year: " + i);
                System.out.println("Principle Amount at Beginning of Year: " + i + " = " + startBalance);
                System.out.println("Total amount of interest earned for year: " + interestEarnedTotal);
                System.out.println("Principle Amount at End of Year: " + i + " = " + currentBalance);

                }

            }

        }
