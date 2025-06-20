class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;

        for(int i = 0 ; i < nums.length; i++){
            xor ^= nums[i];
            xor ^= i;
        }

        xor ^= n;
        return xor;
    }
}