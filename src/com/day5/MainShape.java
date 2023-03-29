package com.day5;

public class MainShape {
    public static void main(String[] args) {
        System.out.println("Please enter the lengths of the sides of the Triangle");


        Shape triangle = new Triangle();
        triangle.inputData();
        triangle.getArea();
        triangle.getPerimeter();

        System.out.println("Please enter the widths and lengths of the Rectangle");
        Shape rectangle = new Rectangle();
        rectangle.inputData();
        rectangle.getArea();
        rectangle.getPerimeter();


        System.out.println("Please enter the radius of the Circle");
        Shape circle = new Circle();
        circle.inputData();
        circle.getArea();
        circle.getPerimeter();


    }
}
