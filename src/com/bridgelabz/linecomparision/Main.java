package com.bridgelabz.linecomparision;



import java.util.Objects;


public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        Point point3 = new Point(5, 6);

        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point1, point2);  // Same points as line1
        Line line3 = new Line(point1, point3);  // Different points

        System.out.println("Comparison result Line 1 vs Line 2: " + line1.compareTo(line2));
        System.out.println("Comparison result Line 1 vs Line 3: " + line1.compareTo(line3));
    }
}
