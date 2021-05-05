package array;

import java.util.Scanner;

public class calculateAverage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // scanner class to get user input
        System.out.println("How many numbers you want to enter?");
        int num = s.nextInt(); // nextInit() method used to scan next token of the input as int
        double[] array = new double[num]; // type []arrayName = new type[size] declare an array variable array,create an array of num doubles
        double tot = 0; // declaration of variable total as tot and assign value = 0;
        for (int i = 0;i<array.length;i++){ //same as below
            System.out.print("Enter Element "+(i+1)+": ");
            array[i] = s.nextDouble();//nextDouble method used to scan next token of the input double
        }
        for(int i = 0; i<array.length;i++){ // sets a variable before the loop starts. defines the condition for the loop to run.
            // if the condition is true in this case if i is bigger than array.length, the loop will start over again,
            // if it is false the loop will end
            // i++ increase a value each time the code block in the loop has been executed
            tot = tot + array[i];//used to add total and array[size] as total
        }
        double average = tot / array.length; // from here we get the average adding total divide by array.length
        System.out.format("The average of numbers is: %.3f",average);//print average as float with three numbers after dot


    }
}