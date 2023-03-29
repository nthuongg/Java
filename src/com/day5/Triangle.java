package com.day5;

import java.util.Scanner;

public class Triangle extends Shape{
    double a;
    double b;

    double c;

    @Override
    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a: ");
        this.a = input.nextInt();
        System.out.print("Please enter b: ");
        this.b = input.nextInt();
        System.out.print("Please enter c: ");
        this.c = input.nextInt();
    }

    @Override
    public void  getArea(){
        double P = (a + b +c)/2;
        double S = Math.sqrt(P * (P - a) * (P - b) * (P - c));
        System.out.println("Triangle Area is: " + S);
    }

    @Override
    public void getPerimeter() {
        double C = a + b +c ;
        System.out.println("Triangle Perimeter is: " + C);
    }

}
