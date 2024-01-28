package com.bridgelabz.linecomparision;

class Line {
    private Point startPoint, endPoint;

    public Line(
            Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double calculateLength() {
        double x1 = startPoint.getX();
        double y1 = startPoint.getY();
        double x2 = endPoint.getX();
        double y2 = endPoint.getY();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Line otherLine = (Line) obj;
        return startPoint.equals(otherLine.startPoint) && endPoint.equals(otherLine.endPoint);
    }

    @Override
    public int hashCode() {

        return startPoint.hashCode() + endPoint.hashCode();
    }
}