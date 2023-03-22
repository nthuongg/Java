package com.class1;

import java.util.Scanner;

public class Person {
    //Members
    String name;
    String email;
    int age;

    public void display() {
        System.out.println("Name " + this.name);
        System.out.println("Email " + this.email);
        System.out.println("Age " + this.age);

    }

    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = input.nextLine();

        System.out.print("Enter email: ");
        this.email = input.nextLine();

        System.out.print("Enter age: ");
        this.age = input.nextInt();

        System.out.println("Input completed");
    }

}

