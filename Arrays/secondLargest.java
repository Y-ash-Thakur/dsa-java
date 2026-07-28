package Arrays;

public class secondLargest {

    public static int second_largest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > largest){
                second_largest = largest;
                largest = num;
            } else if (num > second_largest && num != largest) {
                second_largest = num;
            }
        }
        return second_largest;
    }

    static void main() {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int res = second_largest(arr);
        System.out.println(res);
    }
}
