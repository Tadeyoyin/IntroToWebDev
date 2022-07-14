/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta.windowmaster;

import java.util.Scanner;

/**
 *
 * @author Tolu
 */
public class WindowMaster {
    public static void main(String [] args){
        // declare variables for height and width
        float height;
        float width;
        
        //declare variables converted from String height and width
        String stringHeight;
        String stringWidth;
        
        //declare other variables
        float areaOfwindow;
        float cost;
        float perimeterOfwindow;
        
        //declare and intialize scanner
        Scanner sca = new Scanner(System.in);
        
        //get user input
        System.out.println("Please enter window height:");
        stringHeight = sca.nextLine();
        System.out.println("Please enter window width:");
        stringWidth = sca.nextLine();
        
        //convert string values to Float values
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        //calculate the area of the window
        areaOfwindow = width * height;
        
        //calculating the perimeter of the window
        perimeterOfwindow = 2 * (width + height);
        
        // calculate cost
        cost = ((3.50f * areaOfwindow)  + (2.50f * perimeterOfwindow));
        
        //print results
        System.out.println("Height of Window: " + stringHeight);
        System.out.println("Width of Window: " + stringWidth);
        System.out.println("Area of Window: " + areaOfwindow);
        System.out.println("Perimeter of Window: " + perimeterOfwindow);
        System.out.println("Cost of Window: " + cost);
        
        
    }
}
