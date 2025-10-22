import java.util.*;

public class TwoSumSortAndT2Ptr {
  public static void main(String args[]) {
    int[] nums = {2,7,9,11};
    int target = 1;
    int[] result = twosumBF(nums, target);
    System.out.print(result[0] +","+ result[1]);
  }
  
  public static int[] twosumBF(int[] nums, int target){
      Arrays.sort(nums);
      int sp = 0;
      int ep = nums.length-1;
      while(sp<ep){
          int sum = nums[sp]+nums[ep];
          if(sum == target){
              return new int[] {nums[sp], nums[ep]};
          } else {
              if(sum>target){
                  ep--;
              } else if(sum<target){
                  sp++;
              }
          }
      }
      return new int[] {-1, -1};
  }
}
