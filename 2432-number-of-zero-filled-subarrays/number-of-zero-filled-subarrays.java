class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long total = 0;
        long count = 0;  // streak of consecutive zeros

        for (int num : nums) {
            if (num == 0) {
                count++;
                total += count;  // add new subarrays ending here
            } else {
                count = 0;  // reset
            }
        }
        return total;
    }
}
