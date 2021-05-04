package basic;

import java.util.Scanner;

public class addTwoNumbers {
    public static void main(String[] args) {


        int x, y;
        int sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        x = scanner.nextInt();
        System.out.println("Enter 2nd Number");
        y=scanner.nextInt();
        sum = x+y;
        System.out.println("Sum = " +sum);
        return;


    }
}