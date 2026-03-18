package src;

public class SearchInRotatedSortedArr {
    public static void main(String[] args) {
        SearchInRotatedSortedArr obj = new SearchInRotatedSortedArr();
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(obj.search(nums, 0));
        System.out.println(obj.search2(nums, 0));

    }
    public int search(int[] nums, int target) {
        int si = 0;
        int ei = nums.length-1;
        while(si<=ei){
            int mid = si + (ei-si)/2;
            if(nums[mid] == target){
                return mid;
            }

            //left is sorted side
            if(nums[si] <= nums[mid]){
                if(nums[si]<=target && target <nums[mid]){
                    ei = mid-1;
                } else{
                    si = mid+1;
                }

            } else {
                if(nums[mid] < target && target <= nums[ei]){
                    si = mid+1;
                } else{
                    ei = mid - 1;
                }
            }
        }
        
        
        return -1;
    } 

    public int search2(int[] nums, int target) {
    int left = 0, right = nums.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) return mid;

        // Left half is sorted
        if (nums[left] <= nums[mid]) {
            if (nums[left] <= target && target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        // Right half is sorted
        else {
            if (nums[mid] < target && target <= nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }

    return -1;
}
}
