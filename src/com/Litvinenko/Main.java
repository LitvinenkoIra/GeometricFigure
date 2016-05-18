package com.Litvinenko;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FigureFactory figureFactory = new FigureFactory();
        GeometricFigure[] figures = new GeometricFigure[5];

        for (GeometricFigure figure : figures) {
            String input = scanner.next();
            figure = figureFactory.makeFigure(input);
        }


        for (GeometricFigure figure : figures) {
            System.out.print(figure.Info());
            System.out.println("Perimeter = " + figure.getPerimeter());
            System.out.println("Area = " + figure.getArea());
            System.out.println();

        }
    }
}
