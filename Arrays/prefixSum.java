package Arrays;

public class prefixSum {
    public static void prefix_sum(int[] numbers){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // prefix array
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++){
                currentSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                if(maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    static void main(String[] args) {
        int[] numbers = {1,-2,6,-1,3};
        prefix_sum(numbers);
    }
}
