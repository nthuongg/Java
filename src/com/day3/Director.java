package com.day3;

import java.util.Scanner;

public class Director extends Staff {
    String roll;

    Director(){
        super();
        this.roll = "";
    }

    Director( String name, String email, int salary, String roll){
        super(name, email, salary);
        this.roll = roll;
    }

    public void inputData(){
        Scanner input = new Scanner(System.in);
        super.inputData();
        System.out.print("Enter roll ");
        this.roll = input.nextLine();

    }

    public void display(){
        super.display();
        System.out.println("roll " +this.roll);
    }

}
