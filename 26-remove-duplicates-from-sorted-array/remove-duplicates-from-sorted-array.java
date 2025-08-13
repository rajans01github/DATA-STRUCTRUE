import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> seen = new LinkedHashSet<>(); // preserves order
        for (int num : nums) {
            seen.add(num); // duplicates automatically ignored
        }

        int j = 0;
        for (int num : seen) {
            nums[j++] = num; // write back unique values
        }

        return j; // new length
    }
}
