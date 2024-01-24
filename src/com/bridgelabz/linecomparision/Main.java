package com.bridgelabz.linecomparision;

public class Main {
    public static void main(String[] args) {

        // Creating the points for the line
        point p1 = new point(1,4);
        point p2 = new point(1,3);
        point p3 = new point(3,8);
        point p4 = new point(4,20);

        // Creating the line
        line l1 = new line(p1,p2);
        line l2 = new line(p3,p4);

        // Comparing the length difference between the lines
        double difference = Math.abs(l1.length() - l2.length());

        //OUT
        System.out.println("Difference between the two lines is: " + difference);
    }
}