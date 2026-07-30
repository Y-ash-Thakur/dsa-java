package Arrays;

import java.util.*;

public class movezeros {
    public static void move_zeros(int [] nums){
        int insertPosition = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[insertPosition];
                nums[insertPosition] = temp;

                insertPosition++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    static void main() {
        int[] nums = {0,1,0,3,12};
        move_zeros(nums);
    }
}
