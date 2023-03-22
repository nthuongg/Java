package day2;

import java.util.Scanner;

public class MainCLass {
    public static void main(String[] args) {
        int n ;
        int sum = 0;
        System.out.print("Number of element : ");
        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        while (n != 0){
            sum += n%10;
            n = n/10;
        }
        System.out.println("sum = "+sum);
    }
}
