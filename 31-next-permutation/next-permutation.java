// Next Permutation - LeetCode 31
// Time: O(n), Space: O(1)
public class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) return;

        int n = nums.length;
        // 1. Find pivot: first index from right where nums[i] < nums[i+1]
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // 2. Find successor: first index j from right with nums[j] > nums[i]
            int j = n - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            // 3. Swap pivot and successor
            swap(nums, i, j);
        }

        // 4. Reverse the suffix starting at i+1
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    private void reverse(int[] arr, int l, int r) {
        while (l < r) {
            swap(arr, l++, r--);
        }
    }
}
