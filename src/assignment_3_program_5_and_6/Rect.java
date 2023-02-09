/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_3_program_5_and_6;
/**
 * Programmer: Javier Lazo-Arevalo
 * Dates (start/end): 2023/02/04
 * Project: Assignment 3: Classes and objects in Java
 * Description: creates a class of Rect and object of r with 6 functions that it can use
 */
public class Rect {

    private int length = 0, width = 0, X = 0, Y = 0, perimeter = 0, area = 0;   //private local variables
    private boolean result = false;

    Rect(int length, int width, int X, int Y) { //constructior to create object with length, width, and coordinates
        if (length != 0) {  //if structire to take absolute value or set to 1
            this.length = Math.abs(length);
        } else {
            this.length = 1;
        }
        if (width != 0) {  //if structire to take absolute value or set to 1
            this.width = Math.abs(width);
        } else {
            this.width = 1;
        }
        this.X = X;
        this.Y = Y;
    }

    Rect(int length, int width) {   //constructor to create object with length and width
        if (length != 0) {  //if structire to take absolute value or set to 1
            this.length = Math.abs(length);
        } else {
            this.length = 1;
        }
        if (width != 0) {  //if structire to take absolute value or set to 1
            this.width = Math.abs(width);
        } else {
            this.width = 1;
        }
    }

    public void changeSize(int length, int width) { //function to set length and width and make sure they are positive
        if (length != 0) {  //if structire to take absolute value or set to 1
            this.length = Math.abs(length);
        } else {
            this.length = 1;
        }
        if (width != 0) {  //if structire to take absolute value or set to 1
            this.width = Math.abs(width);
        } else {
            this.width = 1;
        }
    }

    public void move(int X, int Y) {    //function to set top left corner of rect
        this.X = X;
        this.Y = Y;
    }

    public int getPerimeter() { //function to calculate perimeter
        this.perimeter = (this.length * 2) + (this.width * 2);
        return this.perimeter;
    }

    public int getArea() {  //function to calculate area
        this.area = this.length * this.width;
        return this.area;
    }

    public int print() {    //function to print out all data contained in object
        System.out.printf("The rectange is located at (%d,%d)\n", this.X, this.Y);
        System.out.printf("The length of the rectangle is %d\n", this.length);
        System.out.printf("The width of the rectangle is %d\n", this.width);
        System.out.printf("The perimeter of the rectangle is %d\n", this.perimeter);
        System.out.printf("The area of the rectangle is %d\n", this.area);
        return 0;
    }

    boolean isBiggerThan(Rect other) {  //function to compare the areas of 2 objects and returns if the first object is larger or smaller
        int bigcheck = this.area - other.area;
        if (bigcheck > 0) {
            result = true;
        }
        return result;
    }
}
