package com.bridgelabz.linecomparision;



import java.util.Objects;


public class Main {
    public static void main(String[] args) {
        // UC 1: Checking equality of two lines based on endpoints
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        Point point3 = new Point(5, 6);

        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point1, point2);  // Same points as line1
        Line line3 = new Line(point1, point3);  // Different points

        System.out.println("UC 1: Line 1 equals Line 2: " + line1.equals(line2));
        System.out.println("UC 1: Line 1 equals Line 3: " + line1.equals(line3));

        // UC 2: Comparing two lines based on endpoints
        System.out.println("UC 2: Comparison result Line 1 vs Line 2: " + line1.compareTo(line2));
        System.out.println("UC 2: Comparison result Line 1 vs Line 3: " + line1.compareTo(line3));

        // UC 3: Using Java Object-Oriented Programming Concepts
        // (Already implemented in the Point and Line classes)

        // UC 4: Comparing two lines based on endpoints using compareTo
        Line line4 = new Line(new Point(0, 0), new Point(4, 4));
        Line line5 = new Line(new Point(0, 0), new Point(3, 3));
        Line line6 = new Line(new Point(0, 0), new Point(5, 5));

        System.out.println("UC 4: Comparison result Line 4 vs Line 5: " + line4.compareTo(line5));
        System.out.println("UC 4: Comparison result Line 4 vs Line 6: " + line4.compareTo(line6));
    }
}
