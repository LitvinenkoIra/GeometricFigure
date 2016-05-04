package com.Litvinenko;

public class Main {
    public static void main(String[] args) {

        GeometricFigure[] figures = new GeometricFigure[5];
        figures[0] = new Circle(0, 0, 1);
        figures[1] = new Triangle(0, 0, 0, 2, 2, 0);
        figures[2] = new Rectangle(0, 0, 0, 2, 2, 2, 2, 0);
        figures[3] = new Rhombus(0, 2, 1, 0, 0, -2, -1, 0);
        figures[4] = new Trapeze(0, 0, 0, 2, 1, 2, 2, 0);


        for (GeometricFigure figure : figures) {
            System.out.print(figure.Info());
            System.out.println("Perimeter = " + figure.getPerimeter());
            System.out.println("Area = " + figure.getArea());
            System.out.println();

        }
    }
}
