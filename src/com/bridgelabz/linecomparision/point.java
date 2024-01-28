package com.bridgelabz.linecomparision;
import java.util.Objects;

class Point implements Comparable<Point> {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point otherPoint = (Point) obj;
        return Double.compare(otherPoint.x, x) == 0 && Double.compare(otherPoint.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public int compareTo(Point otherPoint) {
        // Compare points based on their x-coordinate first, then y-coordinate
        int xComparison = Double.compare(this.x, otherPoint.x);
        if (xComparison != 0) {
            return xComparison;
        }
        return Double.compare(this.y, otherPoint.y);
    }
}
