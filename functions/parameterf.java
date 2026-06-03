package functions;

import java.util.Scanner;

public class parameterf {
    public static void addition(int a, int b){
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        addition(a,b);
    }
}
