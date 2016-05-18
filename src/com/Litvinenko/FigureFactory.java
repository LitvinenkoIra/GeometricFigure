package com.Litvinenko;

public class FigureFactory {

    public GeometricFigure makeFigure(String type) {
        GeometricFigure figure;

        switch (type) {
            case "circle":
                figure = new Circle(0, 0, 1);
                break;
            case "triangle":
                figure = new Triangle(0, 0, 0, 2, 2, 0);
                break;
            case "rectangle":
                figure = new Rectangle(0, 0, 0, 2, 2, 2, 2, 0);
                break;
            case "rhombus":
                figure = new Rhombus(0, 2, 1, 0, 0, -2, -1, 0);
                break;
            case "trapeze":
                figure = new Trapeze(0, 0, 0, 2, 1, 2, 2, 0);
                break;
            default:
                figure = null;
        }

        return figure;

    }
}
