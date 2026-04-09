package src;

import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> numsCountMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            if(numsCountMap.containsKey(num)){
                int count = numsCountMap.get(num);
                numsCountMap.put(num, ++count);
            } else{
                numsCountMap.put(num,1);
            }
        }
        
        return numsCountMap.keySet().stream().filter(num -> numsCountMap.get(num) == 1).findAny().get();
    }
}
