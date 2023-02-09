/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment_3_program_5_and_6;

import java.util.Scanner;
/**
 * Programmer: Javier Lazo-Arevalo
 * Dates (start/end): 2023/02/04
 * Project: Assignment 3: Classes and objects in Java
 * Description: creates a class of Rect and objects of r_1 and r_2 with 6 functions that they can use
 */
public class Assignment_3_program_5_and_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int length, width, X, Y, perimeter, area, runcheck; //creates variables for use
        boolean isbiggerthan;   //creates a boolean variable to store result of isBiggerThan
        Scanner input = new Scanner(System.in); //scanner to input number
        System.out.printf("please enter the length, width, and X Y coordinates of rectangle 1 as an integer\n");
        length = input.nextInt();   //gets length for user
        width = input.nextInt();    //gets width from user
        X = input.nextInt();    //gets X distance from user
        Y = input.nextInt();    //gets Y distance from user
        Rect r_1 = new Rect(length, width, X, Y);    //reaction of the object r from class Rect
        System.out.printf("please enter the length and width of rectangle 2 as an integer\n");
        length = input.nextInt();   //gets length for user
        width = input.nextInt();    //gets width from user
        Rect r_2 = new Rect(length, width);    //reaction of the object r from class Rect
        System.out.printf("please enter the length and width you would like to change rectange 1 to as an integer\n");
        length = input.nextInt();   //gets length for user
        width = input.nextInt();    //gets width from user
        r_1.changeSize(length, width);    //calls function and passes length and width
        System.out.printf("please enter the X and Y coordinates you would like to change rectange 1 to as an integer\n");
        X = input.nextInt();    //gets X distance from user
        Y = input.nextInt();    //gets Y distance from user
        r_1.move(X, Y);   //calls function and passes X and Y
        System.out.printf("please enter the length and width you would like to change rectange 2 to as an integer\n");
        length = input.nextInt();   //gets length for user
        width = input.nextInt();    //gets width from user
        r_2.changeSize(length, width);    //calls function and passes length and width
        perimeter = (r_1.getPerimeter()); //calls function and sets returned value to perimeter
        System.out.println("the perimeter of rectangle 1 is " + perimeter);
        perimeter = (r_2.getPerimeter()); //calls function and sets returned value to perimeter
        System.out.println("the perimeter of rectangle 2 is " + perimeter);
        area = r_1.getArea(); //calls function and sets reruened value to area
        System.out.println("the area of rectangle 1 is " + area);
        area = r_2.getArea(); //calls function and sets reruened value to area
        System.out.println("the area of rectangle 2 is " + area);
        isbiggerthan = r_1.isBiggerThan(r_2);   //calls function to check if the calling object is larger than the passed object
        if (isbiggerthan == true) { //if structure to see which object is larger
            System.out.println("Rectangle r_1 is larger than Rectangle r_2");
        } else {
            System.out.println("Rectangle r_2 is larger than Rectangle r_1");
        }
        System.out.println("\nwould you like to run the print fuction on rectangle 1\nenter 1 for yes and any other number for no");
        runcheck = input.nextInt(); //gets response from user
        System.out.println(""); //space
        if (runcheck == 1) {    //if structure to determine whether or not to fun print function
            r_1.print();
        } else {
            System.out.println(""); //space
        }
        System.out.println("\nwould you like to run the print fuction on rectangle 2\nenter 1 for yes and any other number for no");
        runcheck = input.nextInt(); //gets response from user
        System.out.println(""); //space
        if (runcheck == 1) {    //if structure to determine whether or not to fun print function
            r_2.print();
        } else {
            System.out.println(""); //space
        }
    }
}
