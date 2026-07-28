package stringBuilder;

public class string_compress {
    public static String string_compression(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            int count = 1;
            sb.append(str.charAt(i));
            
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            if(count > 1){
                sb.append(count);
            }
        }
        return sb.toString();
    }

    static void main() {
        String str = "aaabbccddd";
        String result = string_compression(str);
        System.out.println(result);
    }
}
