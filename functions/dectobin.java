package functions;

import java.util.Scanner;

public class dectobin {
    public static void decToBin(int n){
        int power = 0;
        int binNum = 0;

        while(n > 0){
            int rem = n % 2;
            binNum += rem * Math.pow(10, power);
            power ++;
            n /= 2;
        }
        System.out.println("Binary number: " + " = " + binNum); 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decToBin(n);
    }
}
