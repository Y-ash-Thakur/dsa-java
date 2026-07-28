package Hashing;

import java.util.HashSet;

public class longestsubstringwithoutrepetition {
    public static int longest_sub_string(String str){
        HashSet<Character> set = new HashSet<>();

        int left = 0;

        int max = 0;

        for(int right = 0; right < str.length(); right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left ++;
            }
            set.add(str.charAt(right));
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    static void main() {
        String str = "abcabcbb";
        int result = longest_sub_string(str);
        System.out.println(result);
    }
}
