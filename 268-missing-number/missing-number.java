import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        int newval = n;
        for(int i = 0 ; i< n; i++ ){
            Arrays.sort(nums);
            //  0 ,1,2,3, 4,5,6, 7,9
            if(nums[i]!=i){
                 return i;

            }
        }
        return n;
    }
}