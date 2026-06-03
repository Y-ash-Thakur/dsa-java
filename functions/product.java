package functions;

public class product {
    public static int Multiply(int a, int b){
        int product = a * b;
        return product;
    }

    public static void main(String[] args){
        int a = 5;
        int b = 10;
        int result = Multiply(a,b);
        System.out.println(result);
    }
    
}
