package Arrays;

public class arraypairs {

    public static void print_array_pairs(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            // int current_number = numbers[i];
            for(int j = i + 1; j < numbers.length; j++){
                System.out.println("( " + numbers[i] + "," + numbers[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        print_array_pairs(numbers);
        }
    }
