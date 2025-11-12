class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;          // last valid element in nums1
        int p2 = n - 1;          // last element in nums2

        // Loop from the end of nums1
        for (int p = m + n - 1; p >= 0; p--) {
            if (p2 < 0) break;  // all elements from nums2 merged

            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
        }
    }
}
