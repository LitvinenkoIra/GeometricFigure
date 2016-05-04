package com.Litvinenko;

public abstract class GeometricFigure {

    abstract double getPerimeter();

    abstract double getArea();

    abstract void moveVertical(double n);

    abstract void moveHorizont(double n);

    abstract String Info();

    static double getLength(double ax, double ay, double bx, double by) {
        return Math.sqrt((bx - ax) * (bx - ax) + (by - ay) * (by - ay));
    }

}
