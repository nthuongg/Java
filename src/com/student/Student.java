package com.student;

import java.util.Scanner;

public class Student {
    String name;
    int point;

    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Point: " + this.point);
    }

    public void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = input.nextLine();
        System.out.print("Enter point: ");
        this.point = input.nextInt();

        System.out.println("Input completed");
    }
}
