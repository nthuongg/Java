package com.day3;

public class MainStaff {
    public static void main(String[] args) {
        Staff staff[] = new Staff[3];

        staff[0] = new Director();
        staff[1] = new Manager();
        staff[2] = new Employee();

        for(Staff item : staff) {
            item.inputData();
        }

        for(Staff item : staff) {
            item.display();
        }
    }
}
