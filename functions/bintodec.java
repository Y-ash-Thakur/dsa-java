package functions;

import java.util.Scanner;

public class bintodec {
    public static void binToDec(int binNum){
        int power = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum += lastDigit * Math.pow(2, power);
            power++;
            binNum /= 10;
        }
        System.out.println("Decimal number: " + " = " + decNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binToDec(n);
    }
}
