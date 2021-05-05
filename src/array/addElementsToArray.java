package array;

import java.util.Scanner;

// userwould enter 10 elements and the program will store them into an array and will display the sum of them
public class addElementsToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner class is to get user input
        System.out.println("Enter elements: "); // print this line
        int[] arr = new int[10]; // type[] arrayName = new type[size],declare an variable array, create an array of 10 integers
        int sum = 0; // declare a variable with assign value =0;
        // declare variable i, then if i is smaller than 10 execute the loop, if it is not than end the loop,
        // incerate i till the array will be 10 elements as we declare at the begining
        for (int i = 0;i<10;i++){
            arr[i]=scanner.nextInt();// nextInit method used to scan next token of the input integer of array[];
        }
        //for-each loop
        //for(dataType item:array)
        //dataType -> the data type of the array
        // item -> each item of array is assigned to this variable
        // array -> an array
        for (int num:arr){
            sum=sum+num; // the sum is equal to sum + num;
        }
        System.out.println("Sum of array elements is: "+sum); // print the sum

    }
}
// for-each loop is easy to use and this is the reason why we use it in arrays and collections
