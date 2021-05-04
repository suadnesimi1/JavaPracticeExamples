package stringProgram;

public class stringCharConverter {
    /*


    public static void main(String[] args) {
//this is method to convert character to string
        char ch = 'a';
        String str = Character.toString(ch);
        System.out.println("String is: "+str);
    }
     */

    public static void main(String[] args) {
        // this is string to caracter converter
        String str = "Hello";
        for (int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            System.out.println("Character at "+i+ " Position "+ch);
        }
    }
}