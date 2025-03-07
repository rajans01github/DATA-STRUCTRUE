class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;  // Minimum is on the right
            } else if (nums[mid] < nums[end]) {
                end = mid;  // Minimum is on the left or at mid
            } else {
                // When nums[mid] == nums[end], reduce the search space
                end--;  // Shrink from the right
            }
        }
        return nums[start];  // The minimum element
    }
}
