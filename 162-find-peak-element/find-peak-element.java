class Solution {
    public int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if ((i == 0 || nums[i - 1] < nums[i]) && (i == nums.length - 1 || nums[i] > nums[i + 1])) {
                return i; // Peak element found
            }
        }
        return -1; // No peak found (should never happen for valid input)
    }
}
