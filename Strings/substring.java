package Strings;

public class substring {
    public static String substring(String str, int si, int ei){
        String subString = "";
        for(int i = si; i < ei; i++){
            subString += str.charAt(i);
        }
        return subString;
    }

    static void main() {
        String str = "HelloWorld";
        substring(str, 0,5);
    }
}
