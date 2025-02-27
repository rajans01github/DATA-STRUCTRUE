class Solution {
    public int findPosition(int[] nums, int target, boolean findFirst) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                if (findFirst) {
                    end = mid - 1;  // Move left to find first occurrence
                } else {
                    start = mid + 1; // Move right to find last occurrence
                }
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        return new int[]{findPosition(nums, target, true), findPosition(nums, target, false)};
    }
}
