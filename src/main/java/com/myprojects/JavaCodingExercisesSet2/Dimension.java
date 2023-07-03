package com.myprojects.JavaCodingExercisesSet2;

import java.util.Scanner;

public class Dimension {
    private int feet;
    private int inches;

    public Dimension(int inches) {
        // TODO: Convert the total inches into feet and inches. One foot is 12 inches.
        // Store the feet and inches in their respective instance variables.
        if(inches<0) {
            this.feet = - 1;
            this.inches = - 1;
        } else {
            this.feet = inches / 12;
            this.inches = inches % 12; // getting the remainder, which is the number of inches less than 1 foot
        }

    }

    public int getFeet() {
        // TODO: Return the value of feet.
        return feet;
    }

    public int getInches() {
        // TODO: Return the value of inches.
        return inches;
    }

    public static void main(String[] args) {
//        Dimension dimension = new Dimension(10);
//        System.out.println("feet: " + dimension.getFeet());
//        System.out.println("inches: " + dimension.getInches());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of inches: ");
        int noOfInches = scanner.nextInt();
        Dimension dimension = new Dimension(noOfInches);
        System.out.println("feet: " + dimension.getFeet());
        System.out.println("inches: " + dimension.getInches());
    }
}

