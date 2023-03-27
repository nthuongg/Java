package com.day3;

import java.util.Scanner;

public class Manager extends Staff{
    String department;

    Manager(){
        super();
        this.department = "";
    }

    Manager( String name, String email, int salary, String department) {
        super(name, email, salary);
        this.department = department;
    }

    public void inputData(){
        Scanner input = new Scanner(System.in);
        super.inputData();
        System.out.print("Enter department ");
        this.department = input.nextLine();
    }

    public void display(){
        super.display();
        System.out.println("department " +this.department);
    }
}
