package stringBuilder;

public class basics {
    static void main() {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch <= 'z'; ch++){
            sb.append(ch + " ");
        }
        System.out.println(sb);
    }
}
