package com.myprojects.JavaCodingExercisesSet2;

import java.util.Scanner;

public class Square {

    private int side;

    public Square(int side) {
        // TODO: Initialize side with the passed value
       this.side = side;
    }

    public int calculateArea() {
        // TODO: Calculate and return the area of the square
        if(side<=0){
            return -1;
        }
        return side*side;
    }

    public int calculatePerimeter() {
        // TODO: Calculate and return the perimeter of the square
        if (side <= 0) {
            return -1;
        }
        return side * 4;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side length of the square: ");
        int sideLength = scanner.nextInt();
        Square square = new Square(sideLength);
        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Square perimeter: " + square.calculatePerimeter());
    }
}