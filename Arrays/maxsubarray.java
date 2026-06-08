package Arrays;

public class maxsubarray {
    public static void max_subArray_sum(int[] numbers){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++){
                currentSum = 0;
                for(int k = i; k <= j; k++){
                    currentSum = currentSum + numbers[k];
                }
                System.out.println(currentSum);
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    static void main() {
        int[] numbers = {2,4,6,8,10};
        max_subArray_sum(numbers);
    }
}
