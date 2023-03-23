package day2;

import java.util.Scanner;

public class Number {
    int sum = 0;
    int n;

    public void display(){
        System.out.print("sum = " + this.sum);
    }
    public void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Number of element : ");
        this.n = input.nextInt();

        while (n > 0){
            sum += n%10;
            n = n/10;
        }

    }
}
