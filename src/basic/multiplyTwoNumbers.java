package basic;

import java.util.Scanner;

public class multiplyTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = s.nextInt();
        System.out.println("Enter second number");
        int num2 = s.nextInt();

        int product = num1 * num2;
        System.out.println(+num1+" * "+num2+" = "+product);
    }
}
