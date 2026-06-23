package stringBuilder;

public class CapitalizeTheTitle {
    public static String Capitalize_the_title(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0)));

        if(str.length() == 0){
            return str;
        }

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i-1) == ' '){
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    static void main() {
        String str = "hi, my name is yash thakur";
        String result = Capitalize_the_title(str);
        System.out.println(result);
    }
}
