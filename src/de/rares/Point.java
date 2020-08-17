package de.rares;

public class Point {

    public double x;
    public double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceToZero(){

        return (Math.sqrt(x*x+y*y));

    }

}
