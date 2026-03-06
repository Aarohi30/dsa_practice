package src;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_IM100 {
    public static int[] twoSum(int[] nums, int target) {
        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        
        return new int[] {};
    }

    public static int[] twoSumPractice(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
                } else {
                map.put(nums[i], i);
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {18, 7, 11, 15, 10};
        int target = 18;
        int[] result = twoSum(nums, target);
        int[] resultPractice = twoSumPractice(nums, target);
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
        if (resultPractice.length == 2) {
            System.out.println("Practice Indices: " + resultPractice[0] + ", " + resultPractice[1]);
        } else {
            System.out.println("No two sum solution found in practice method.");
        }
    }
}