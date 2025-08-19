class Solution {
    public int[] searchRange(int[] nums, int target) {
         int first = findbound(nums, target, true);
         int last = findbound(nums, target, false);
        return new int[] { first, last};
    }

    private int findbound(int[] nums, int target, boolean isfirst) {
        int n = nums.length, low = 0, high = n-1;
        int ans  = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] == target){
                ans = mid;
                if(isfirst){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else if (nums[mid] < target){
                low = mid + 1;
            }else {
                high = mid -1;
            }
        }
        return ans;
    }
}