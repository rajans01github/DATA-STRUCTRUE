import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int max = 1;
        int count = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] == 1) {
                count++;
            } else if (nums[i + 1] != nums[i]) { // ignore duplicates
                count = 1;
            }
            max = Math.max(max, count);
        }

        return max;
    }
}
