package com.Litvinenko;

public class Circle extends GeometricFigure {

    private double center_x, center_y, radius;

    private boolean check(double radius) {
        return (radius > 0);
    }

    Circle() {
        radius = center_x = center_y = 0;
    }

    Circle(double center_x0, double center_y0, double radius0) {
        if (check(radius0)) {
            center_x = center_x0;
            center_y = center_y0;
            radius = radius0;
        } else
            throw new IllegalArgumentException("Bad circle! Please,try to create an object again");
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void moveVertical(double n) {
        center_y += n;
    }

    public void moveHorizont(double n) {
        center_x += n;
    }

    public String Info() {
        return "Circle: Radius=" + Double.toString(radius) + ',' + "Center:(" + Double.toString(center_x) + ',' + Double.toString(center_y) + ")\n";
    }
}