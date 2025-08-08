class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 1 ;
        int count = 1;
        Arrays.sort(nums);   // 1,2,3,4,100 ,200    //0 , 1 ,1 ,2
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        for(int i = 0 ; i<nums.length-1 ; i++){
            if(nums[i+1]==nums[i]) continue;
            else if(nums[i+1]- nums[i] ==1){
                count++;
            }
            else{
                //return 1;
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}