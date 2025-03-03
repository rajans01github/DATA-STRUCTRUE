class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        // Traverse the array in pairs
        for (int i = 0; i < n - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i]; // Found the unique element
            }
        }

        // If the loop didn't return, the last element is unique
        return nums[n - 1];
    }
}