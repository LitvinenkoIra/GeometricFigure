package com.Litvinenko;

public class Trapeze extends Quadrangle {

    private boolean checkTrapeze(double a_x, double a_y, double b_x, double b_y, double c_x, double c_y, double d_x, double d_y) {
        double k1 = (b_y - a_y) / (b_x - a_x);
        double k2 = (c_y - b_y) / (c_x - b_x);
        double k3 = (d_y - c_y) / (d_x - c_x);
        double k4 = (a_y - d_y) / (a_x - d_x);
        return ((k1 == k3 && k2 != k4) || (k2 == k4 && k1 != k3));
    }

    Trapeze() {
    }

    Trapeze(double a_x0, double a_y0, double b_x0, double b_y0, double c_x0, double c_y0, double d_x0, double d_y0) {
        super(a_x0, a_y0, b_x0, b_y0, c_x0, c_y0, d_x0, d_y0);
        if (!checkTrapeze(a_x0, a_y0, b_x0, b_y0, c_x0, c_y0, d_x0, d_y0))
            throw new IllegalArgumentException("Bad trapeze! Please,try to create an object again");
    }

    public double getArea() {
        double CB = GeometricFigure.getLength(c_x, c_y, b_x, b_y);
        double BA = GeometricFigure.getLength(b_x, b_y, a_x, a_y);
        double AD = GeometricFigure.getLength(a_x, a_y, d_x, d_y);
        double DC = GeometricFigure.getLength(d_x, d_y, c_x, c_y);
        return 0.5 * (AD + CB) * Math.sqrt(BA * BA - ((((AD - CB) * (AD - CB) + BA * BA - DC * DC) / (2 * (AD - CB))) * (((AD - CB) * (AD - CB) + BA * BA - DC * DC) / (2 * (AD - CB)))));
    }

    public String Info() {
        return "Trapeze: A(" + Double.toString(a_x) + ',' + Double.toString(a_y) + "),B(" + Double.toString(b_x) + ',' + Double.toString(b_y) + "),C(" + Double.toString(c_x) + ',' + Double.toString(c_y) + "),D(" + Double.toString(d_x) + ',' + Double.toString(d_y) + ")\n";
    }

}
