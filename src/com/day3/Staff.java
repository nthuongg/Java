package com.day3;

import java.util.Scanner;

public class Staff {
    private String name;
    private String email;
    private int salary;

    Staff() {
        name = "";
        email = "";
        salary = 0;
    }

    Staff( String name, String email, int salary){
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public void inputData(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        this.name = input.nextLine();

        System.out.print("Enter email: ");
        this.email = input.nextLine();

        System.out.print("Enter salary: $");
        this.salary = input.nextInt();

    }

    public void display(){
        System.out.println("name: " + this.name);
        System.out.println("email: " + this.email);
        System.out.println("salary: $" + this.salary);
    }
}

