package functions;

public class binomial {
    public static int fact(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f = f * i;
            return f;
        }
        return f;
    }

    public static int binomial(int n, int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n - r);
        
        int binomCoeff = fact_n / (fact_r * fact_nmr);
        return binomCoeff;
    }

    public static void main(String[] args){
        int result = binomial(5,2);
        System.out.println(result);
    }
}
