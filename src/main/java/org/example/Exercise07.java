/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kenny La
 */
package org.example;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the length of the room in feet?");
        int l = scan.nextInt();
        System.out.println("What is the width of the room in feet?");
        int w = scan.nextInt();
        System.out.println("You entered dimensions of " + l + " feet by " + w + " feet.");
        int area = l * w;
        double sqm = area * 0.09290304;
        System.out.println("The area is");
        System.out.println(area + " square feet");
        System.out.println(sqm + " square meters");
    }
}
