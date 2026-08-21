package Strings;

import java.io.*;
import java.util.*;

public class secondNonRepeating {
    public static char secondNonRepeatingChar(String str){
        int[] freq = new int[26];
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }

        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(freq[ch - 'a'] == 1){
                count++;
            }
            if(count == 2){
                return ch;
            }
        }
        return '-';
    }

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char answer = secondNonRepeatingChar(s);
        System.out.println(answer);
    }
}
