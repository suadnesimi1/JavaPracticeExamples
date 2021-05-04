package basic;

import java.util.Scanner;

public class VowelorConsonant {
    public static void main(String[] args) {
        boolean isVowel = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        int ch = scanner.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'o':
            case 'i':
            case 'y':
            case 'u':
                isVowel = true;
        }
        if (isVowel == true) {
            System.out.println(ch+ " is a vowel");
        } else {
            if((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')){
                System.out.println(ch+" is a consonant character");
            }else{
                System.out.println("Wrong input");
            }
        }
    }
}
