package com.day5;

import java.util.Scanner;

public class Rectangle extends Shape{
    double a;
    double b;

    @Override
    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a: ");
        this.a = input.nextInt();
        System.out.print("Please enter b: ");
        this.b = input.nextInt();
    }

    @Override
    public void getArea() {
        double S = a *b;
        System.out.println("Rectangle Area is: " + S);
    }

    @Override
    public void getPerimeter() {
        double C = ( a + b ) * 2;
        System.out.println("Rectangle Perimeter is: " + C);
    }
}
