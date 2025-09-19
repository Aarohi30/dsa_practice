public class TrappingRainwater {
    public static void main(String[] args) {
        int height[] = {4,2,0, 6,3,2,5};
        System.out.println(trappedRainwater(height));
    }

    public static int trappedRainwater(int height[]){
        int n = height.length;
        //calculate the left max boundary - auxiliary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        //calculate the right max boundary - auxiliary array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //loop
        int trappedWater = 0;
        //waterlevel = min(leftmax, rightmax)
        //trspped water = waterLevel - height[i]
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel-height[i];
        }
        return trappedWater;
    }
}
