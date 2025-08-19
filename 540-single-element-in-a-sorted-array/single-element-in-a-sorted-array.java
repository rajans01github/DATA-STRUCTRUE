class Solution {
    public int singleNonDuplicate(int[] nums) {
         
        int low  = 0; 
        int high = nums.length - 1;

        while (low < high) {
            int mid  = low + (high - low) / 2;

            // mid को हमेशा even index पर adjust करो
            if (mid % 2 == 1) {
                mid--;
            }

            // अगर pair सही है → unique element right side में
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            } else {
                // unique element left side में (mid खुद भी हो सकता है)
                high = mid;
            }
        }

        return nums[low];
    }
}
