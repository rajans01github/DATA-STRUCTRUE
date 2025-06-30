class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int canditate = 0;

        for(int num : nums){
            if(count == 0){
                canditate = num;
                count = 1;
            }else if(canditate == num)
            {
                count++;
            }else{
                count--;
            }
        }
        return canditate;
        
    }
}