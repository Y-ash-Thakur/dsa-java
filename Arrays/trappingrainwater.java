package Arrays;

public class trappingrainwater {
    public static int trapping_rainwater(int[] height){
        // calculate left max boundary auxiliary array
        int n = height.length;
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        // calculate left max boundary auxiliary array
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        // loop
        for(int i = 0; i < n; i++){
            // waterLevel = min(left max boundry, right max boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trappedWater = waterlevel - height[i];
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    static void main(String[] args){
        int[] height = {4,2,0,6,3,2,5};
        int result = trapping_rainwater(height);
        System.out.println(result);
    }
}
