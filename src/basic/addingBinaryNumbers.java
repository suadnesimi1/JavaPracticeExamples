package basic;

import java.util.Scanner;

public class addingBinaryNumbers {
    public static void main(String[] args) {
        long x,y;
        int i = 0;
        int carry = 0;
        int[] sum = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first binary number: ");
        x = scanner.nextLong();
        System.out.println("Enter second binary number: ");
        y = scanner.nextLong();
        while(x!=0 || y!=0){
            sum[i++] = (int) ((x % 10 + y % 10 + carry) %2);
            carry = (int) ((x % 10 + y % 10 + carry)/2);
            x = x/10;
            y = y/10;
        }
        if (carry !=0){
            sum[i++] = carry;
        }
           --i;
        System.out.println("output");
        while (i>=0){
            System.out.println(sum[i--]);
        }
        System.out.println("\n");
    }
}
