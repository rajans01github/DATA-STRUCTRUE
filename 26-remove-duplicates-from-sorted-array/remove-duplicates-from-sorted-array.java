class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0; // pointer to last unique value
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;            // move to next unique spot
                nums[i] = nums[j]; // copy new unique value
            }
        }
        return i + 1; // total number of unique values
    }
}
