package sorting;

import org.w3c.dom.ls.LSOutput;

public class bubbleSort {
    public static void bubble_sort(int arr[]){
        int n = arr.length;
        for(int i = n-1; i >= 1; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(arr);
    }

    static void main(String[] args){
        int arr[] = {3,1,5,4,2};
        bubble_sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
