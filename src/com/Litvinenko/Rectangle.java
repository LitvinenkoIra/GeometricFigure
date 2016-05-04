package com.Litvinenko;

public class Rectangle extends Quadrangle {

    private boolean checkRectangle(double a_x, double a_y, double b_x, double b_y, double c_x, double c_y, double d_x, double d_y) {
        double CB = GeometricFigure.getLength(c_x, c_y, b_x, b_y);
        double BA = GeometricFigure.getLength(b_x, b_y, a_x, a_y);
        double AD = GeometricFigure.getLength(a_x, a_y, d_x, d_y);
        double DC = GeometricFigure.getLength(d_x, d_y, c_x, c_y);
        double cosine_a = (b_x * d_x + b_y * d_y) / (BA * AD);
        double cosine_c = (b_x * d_x + b_y * d_y) / (CB * DC);
        return (CB == AD && BA == DC && cosine_a == 0 && cosine_c == 0);
    }

    Rectangle() {
    }

    Rectangle(double a_x0, double a_y0, double b_x0, double b_y0, double c_x0, double c_y0, double d_x0, double d_y0) {
        super(a_x0, a_y0, b_x0, b_y0, c_x0, c_y0, d_x0, d_y0);
        if (!checkRectangle(a_x0, a_y0, b_x0, b_y0, c_x0, c_y0, d_x0, d_y0))
            throw new IllegalArgumentException("Bad rectangle! Please,try to create an object again");
    }

    public double getArea() {
        double CB = GeometricFigure.getLength(c_x, c_y, b_x, b_y);
        double BA = GeometricFigure.getLength(b_x, b_y, a_x, a_y);
        return CB * BA;
    }

    public String Info() {
        return "Rectangle: A(" + Double.toString(a_x) + ',' + Double.toString(a_y) + "),B(" + Double.toString(b_x) + ',' + Double.toString(b_y) + "),C(" + Double.toString(c_x) + ',' + Double.toString(c_y) + "),D(" + Double.toString(d_x) + ',' + Double.toString(d_y) + ")\n";
    }
}

