package src;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 12;
        int searchIndex = search(nums, target);
        System.out.println(searchIndex);
    }
    public static int search(int[] nums, int target) {
        int si=0;
        int ei = nums.length-1;
        

        while(si<ei){
        int mid = (si+ei)/2;
        if(nums[mid]==target) return mid;
        if(target<nums[mid]){
            ei = mid-1;
        } else{
            si=mid+1;
        }   
        }
        if(si==ei){
            if(nums[si]==target)
            return si;
        }
        
        return -1;
    }
}
