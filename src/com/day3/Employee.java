package com.day3;

import java.util.Scanner;

public class Employee extends Staff {
    String skill;

    Employee(){
        super();
        this.skill = "";
    }

    Employee( String name, String email, int salary, String skill){
        super(name, email, salary);
        this.skill = skill;
    }

    public void inputData(){
        Scanner input = new Scanner(System.in);
        super.inputData();
        System.out.print("Enter skill ");
        this.skill = input.nextLine();
    }

    public void display(){
        super.display();
        System.out.println("skill " +this.skill);
    }
}
