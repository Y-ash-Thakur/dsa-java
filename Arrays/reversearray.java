package Arrays;

public class reversearray {

    // public static void reverse_array(int [] numbers){
    //     int n = numbers.length;

    //     int [] temp = new int[n];

    //     for(int i = 0; i < n; i++){
    //         temp[i] = numbers[n - i - 1];
    //     }
    //     for(int i = 0; i < n; i++){
    //         numbers[i] = temp[i];
    //     }
    // } // BRUTE FORCE APPROACH

    public static void reverse_array(int [] numbers){
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args){
        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        reverse_array(numbers);

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
    
}
