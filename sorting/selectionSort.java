package sorting;

import java.util.*;

public class selectionSort {
    public static void selection_sort(int[] arr, int p){
        for(int i = 0; i < p; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String [] args){
        int [] nums = {29, 10, 14, 37, 13};
        selection_sort(nums, 3);
    }
}
