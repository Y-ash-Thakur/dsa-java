package Arrays;

public class binaryseach {
    public static int binarySearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;
            if(numbers[mid] == key){
                return mid;
            }
            else if(numbers[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1 ;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int numbers[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int key = 23;
        int target = binarySearch(numbers, key);
        if(target == -1){
            System.out.println("Key not found in the array.");
        }
        else{
            System.out.println("Key found at index: " + target);
        }
    }
}
