package com.myprojects.JavaCodingExercisesSet2;

import java.util.Scanner;

// Defining a Point class to represent a point in 2-dimensional space
public class Point {

    // x-coordinate of the point
    private int x;

    // y-coordinate of the point
    private int y;

    // Constructor for the Point class
    public Point(int x, int y) {
        this.x = x;  // Assigning x-coordinate of the point
        this.y = y;  // Assigning y-coordinate of the point
    }

    // Method to get the x-coordinate of the point
    public int getX() {
        return x;
    }

    // Method to get the y-coordinate of the point
    public int getY() {
        return y;
    }

    // TODO: Implement the method to move the point by dx and dy in x and y direction respectively
    public void move(int dx, int dy) {
       this.x += dx;
       this.y += dy;
        System.out.println("new x coordinate: " + x + ", new y coordinate: " + y);
    }

    // TODO: Implement the method to calculate the distance from this point to another point
    public double distanceTo(Point other) {
        int dx = this.x - other.x;     // Euclidean distance between the current point and another:
        int dy = this.y - other.y;      // d = sqrt((x1-x2)^2 + (y1-y2)^2)

        return Math.sqrt(dx*dx+dy*dy);

    }

    public static void main(String[] args) {
        Point point1 = new Point(3,4);
        Point point2 = new Point(6,8);
        System.out.println("distance between the two points: " + point1.distanceTo(point2));
        point1.move(1,1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the x coordinate for the first point: ");
        int x3 = scanner.nextInt();
        System.out.println("Enter the y coordinate for the first point: ");
        int y3 = scanner.nextInt();
        Point point3 = new Point(x3,y3);

        System.out.println("Enter the x coordinate for the second point: ");
        int x4 = scanner.nextInt();
        System.out.println("Enter the y coordinate for the second point: ");
        int y4 = scanner.nextInt();
        Point point4 = new Point(x4,y4);
        System.out.println("Distance between the two points: " + point3.distanceTo(point4));

        System.out.println("Enter the new coordinates for the first point: ");
        System.out.println("New x coordinate: ");
        int x3_1 = scanner.nextInt();
        System.out.println("New y coordinate: ");
        int y3_1 = scanner.nextInt();
        point3.move(x3_1,y3_1);

    }
}