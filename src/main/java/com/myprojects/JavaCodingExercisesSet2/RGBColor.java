package com.myprojects.JavaCodingExercisesSet2;

import java.util.Scanner;

// RGBColor class representing a color using Red Green Blue (RGB) model.
public class RGBColor {

    // The Red, Green, Blue color values range from 0 to 255.
    private int red;
    private int green;
    private int blue;

    // Constructor for RGBColor class which initializes the color with provided red, green and blue values.
    public RGBColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    // Getter method to get the red value of the color.
    public int getRed() {
        return red;
    }

    // Getter method to get the green value of the color.
    public int getGreen() {
        return green;
    }

    // Getter method to get the blue value of the color.
    public int getBlue() {
        return blue;
    }

    // Method to invert the color. The inversion is done by subtracting each color component from 255.
    public void invert() {
        if((red >=0 && red <=255) && (green>=0 && green<=255) && (blue>=0 && blue<=255)) {
            this.red = 255 - this.red;
            System.out.println(red);
            this.green = 255 - this.green;
            System.out.println(green);
            this.blue = 255 - this.blue;
            System.out.println(blue);
        } else {
            System.out.println("Unknown color - color range between 0 and 255");
        }
    }

    public static void main(String[] args) {
        RGBColor rgbColor = new RGBColor(255, 100, 100);
        rgbColor.invert();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer value for the three color value (ranges between 0 and 255):");
        System.out.println("For red: ");
        int redValue = scanner.nextInt();
        System.out.println("For green: ");
        int greenValue = scanner.nextInt();
        System.out.println("For blue: ");
        int blueValue = scanner.nextInt();
        RGBColor color = new RGBColor(redValue,greenValue,blueValue);
        color.invert();
    }
}