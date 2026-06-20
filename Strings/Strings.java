package Strings;

import java.util.Scanner;

public class Strings {
    public static void printLetters(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }

    static void main() {
//        char arr[] = {'a','b','c','d'};
//        String str = "abcd";
//        String str2 = new String("xyz");
//
//        // String input and output
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        System.out.println(name);

//        String fullName = "Tony Stark";
//        System.out.println(fullName.length());

        //concatenation
        String firstName = "Yash";
        String lastName = "Thakur";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        printLetters(fullName);
    }
}
