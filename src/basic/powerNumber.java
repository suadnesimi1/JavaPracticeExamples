package basic;

import java.util.Scanner;

public class powerNumber {
    public static void main(String[] args) {
        long result = 1;
        int number;
        int power;
        Scanner s = new Scanner(System.in);
        System.out.println("x = ");
        number = s.nextInt();
        System.out.println("Power in: ");
        power = s.nextInt();
        int i = power;
        for(;i !=0;--i){
            result *= number;

        }
        System.out.println(number+"^"+power+" = "+result);
    }
}
