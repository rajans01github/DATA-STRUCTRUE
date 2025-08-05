class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store value -> index
        HashMap<Integer,Integer> map = new HashMap <>();

        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            int complement = target-nums[i];

            if(map.containsKey(complement)){
                return new int[] {map.get(complement) , i};
            }
            map.put(current,i);
        }
        return new int[] {};
    }
}
