/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaBasics;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tolu
 */
public class RockPaperScissors {
    //method 1/
    public static void main(String[] args) {
        //initializing scanner/
        Scanner scn = new Scanner(System.in);
        //defining user input variable for method 1/
        String userInput;
        
        //creating a do-while loop to call method 2//
        do{
            playGame();
            System.out.println("Would you like to play again? (y/n)");
            userInput = scn.next();
         
                   } while (userInput.equals("y"));
        //Computer message at the end of play/
        System.out.println("Thanks for playing!");
        
        //exit/
             System.exit(0);

    }
        
    public static void playGame(){
        //define scanner and Random
        Scanner scn = new Scanner(System.in);
        Random rdm = new Random();
       
        
        //define variables/
        int userRounds = 0;
        int[] userOptions = {1, 2, 3};
        int randomSel;
        int userChoice = 0;
        int tie = 0;
        int compWin = 0;
        int playerWin = 0;
        String playAgain;
               
        System.out.println("Hey let's play a game of Rock, Paper & Scissors");
        System.out.println("How many rounds would you like to play?");
        System.out.println("(choose a number between 1 and 10)");
        userRounds = scn.nextInt();
        
        //define a for loop to simulate number of rounds as desired by user/
        for (int i = 1; i <= userRounds; i++) {
            
            //determine random selection referencing the array above
           randomSel = userOptions[new Random().nextInt(userOptions.length)];
           
             if (userRounds > 10 || userRounds < 1) {
                System.out.println("Out of Range, needs to be between 1 and 10");
                break;
            }
             //defining user choice of rock, paper or scissors/
             System.out.println("Pick a number: 1 - Rock, 2 - Paper, 3 - Scissors");
                userChoice = scn.nextInt();
              //defining game outcomes and tracking wins, losses and ties/
        if (userChoice == randomSel) {
            System.out.println("Computer played " + randomSel);
            System.out.println("Tie");
            tie++;
        }
        else if (userChoice == 1) {
            if(randomSel == 2){
                System.out.println("Computer played " + randomSel);
                System.out.println("You lose");
                compWin++;
            }
            else if (userChoice == 1) {
            System.out.println("Computer played " + randomSel);
            if(randomSel == 3){
                System.out.println("You win!!!");
                playerWin++;
                
            }
        }
        
        }
        else if (userChoice == 2) {
            
            if(randomSel == 1){
                System.out.println("Computer played " + randomSel);
                System.out.println("You win!!!");
                playerWin++;
            }
            else if (userChoice == 2) {
            System.out.println("Computer played " + randomSel);
            if(randomSel == 3){
                System.out.println("You lose");
                compWin++;
            }
        }
        }
        
        else if (userChoice == 3) {
            
            if(randomSel == 1){
                System.out.println("Computer played " + randomSel);
                System.out.println("You lose");
                compWin++;
            }
            if(randomSel == 2){
                System.out.println("Computer played " + randomSel);
                System.out.println("You lose");
                compWin++;
            }
            
        }
        //defining out of range values, that is, values that are not between 1 and 3/
        else if (userChoice !=1 || userChoice != 2 || userChoice != 3) {
            System.out.println("Out of Range....Bye!");
            System.exit(0);
        }
        
        }
        //declaring number of user win, computer wins and ties/
         System.out.println("Number of Computer wins " + compWin);
         System.out.println("Number of Player wins " + playerWin);
         System.out.println("Number of ties " + tie);
         
         //declaring the winner
         if (compWin > playerWin) {
             System.out.println("Better luck next time");
         }
         
         else if (playerWin > compWin) {
             System.out.println("Congratulations - You Won!!!");
         }
         
         else if (playerWin == compWin) {
             System.out.println("Its a tie");
         }
         
    }
}
