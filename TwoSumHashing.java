import java.util.*;

public class TwoSumHashing {
  public static void main(String args[]) {
    int[] nums = {2,7,9,11};
    int target = 21;
    int[] result = twosumBF(nums, target);
    System.out.print(result[0] +","+ result[1]);
  }
  
  public static int[] twosumBF(int[] nums, int target){
      Map<Integer, Integer> map = new HashMap();
      for(int i=0; i<nums.length; i++){
          int complement = target - nums[i];
          if(map.containsKey(complement)){
              
              return new int[] {i, map.get(complement)};
          } else{
              map.put(nums[i], i);
          }
      }
      return new int[] {-1, -1};
  }
}
