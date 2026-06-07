package Arrays;

public class largestInArray {

    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest number in the array is: " + smallest);
        return largest;
    }
    public static void main(String[] args){
        int numbers[] = {10, 20, 5, 30, 15, 25};
        int largest = getlargest(numbers);
        System.out.println("The largest number in the array is: " + largest);
    }
    
}
