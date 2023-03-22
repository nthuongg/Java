package com.day1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        int arrayInt[];
        int total = 0;
        int even = 0;
        int odd = 0;
        System.out.print("Number of element : ");
        Scanner input = new Scanner(System.in);

        total = input.nextInt();
        arrayInt = new int[total];

        for (int i = 0; i < total; i++) {
            System.out.print("Element " + (i+1) + " ");
            arrayInt[i] = input.nextInt();
        }

        for(int item : arrayInt) {
            System.out.println("Element = " + item);
        }
        for (int i = 0; i < total; i++){
            if(arrayInt[i] % 2 == 0){
                even += arrayInt[i];
            }else {
                odd += arrayInt[i];
            }
        }
        System.out.println("Sum of even: " + even);
        System.out.println("Sum of odd: " + odd);
    }

}
