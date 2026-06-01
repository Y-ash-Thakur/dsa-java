package loops;

import java.util.*;

class Break {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            if ( n % 10 == 0){
                break;
            }
            System.out.println(n);
        }
    }
}
