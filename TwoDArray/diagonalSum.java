package TwoDArray;

public class diagonalSum {
    public static int diagonal_sum(int matrix[][]) {
        int sum = 0;
        int n = matrix.length;

        for(int i = 0; i <= n; i++){
            sum += matrix[i][i];

            if(i != n-1-i){
                sum += matrix[i][n-1-i];
            }
        }
        return sum;
    }

    static void main() {
        int matrix[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        System.out.println(diagonal_sum(matrix));
    }
}
