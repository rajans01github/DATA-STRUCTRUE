class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer>map = new HashMap<>();

        int complement = 0;

        for( int i = 0 ; i < nums.length; i++){
           int  current = nums[i];
            complement = target - current;


            if(map.containsKey(complement)){
                return new int []{map.get(complement),i};
            }
            map.put(current, i);
        }
        return new int[] {};
        
    }
}