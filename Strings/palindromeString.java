package Strings;

import java.util.Scanner;

public class palindromeString {
    public static boolean palindrome_string(String str){
        int left = 0;
        int right = str.length() - 1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String character = sc.next();
        boolean result = palindrome_string(character);
        System.out.println(result);
    }
}
