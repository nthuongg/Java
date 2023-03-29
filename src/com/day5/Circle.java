package com.day5;

import java.util.Scanner;

public class Circle extends Shape{
    double r;

    @Override
    public void inputData(){
        Scanner input = new  Scanner(System.in);
        System.out.print("Please enter radius: ");
        this.r = input.nextFloat();
    }

    @Override
    public void getArea() {
        double S = Math.PI * r * r;
        System.out.println("Circle Area is: " + S);
    }

    @Override
    public void getPerimeter() {
        double C = 2 * Math.PI * r;
        System.out.println("Circle Perimeter is: " + C);
    }


}
