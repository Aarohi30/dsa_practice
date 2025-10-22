public class TwoSumBF {
  public static void main(String args[]) {
    int[] nums = {2,7,9,11};
    int target = 20;
    int[] result = twosumBF(nums, target);
    System.out.println(result[0] +","+ result[1]);
  }
  
  public static int[] twosumBF(int[] nums, int target){
      for(int i=0; i<nums.length; i++){
          for(int j=i+1; j<nums.length; j++){
              if(nums[i] + nums[j] == target){
                  return new int[] {i,j};
              }
          }
      }
      return new int[] {-1, -1};
  }
}
