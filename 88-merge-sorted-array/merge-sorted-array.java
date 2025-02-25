class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m; // Start from index `m` in nums1
        for (int j = 0; j < n; j++) { // Copy nums2 into nums1
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1); // Sort the merged array
    }
}